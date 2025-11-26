package com.portfolio.portfolio.client.Service;



import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.client.Entity.Request;
import com.portfolio.portfolio.client.Repository.RequestRepository;
import com.portfolio.portfolio.client.dto.DTORequest;
import com.portfolio.portfolio.client.mapper.RequestMapper;
import com.portfolio.portfolio.developer.Entity.EntityProject;
import com.portfolio.portfolio.developer.Repository.DeveloperRepository;

@Service
public class RequestService implements IRequestService {

    protected RequestRepository repository;

    protected JavaMailSender mailSender;

    protected RequestMapper mapper;

    protected DeveloperRepository repoDeveloper;

    public RequestService(RequestRepository repository, JavaMailSender mailSender, RequestMapper mapper,
            DeveloperRepository repoDeveloper) {
        this.repository = repository;
        this.mailSender = mailSender;
        this.mapper = mapper;
        this.repoDeveloper = repoDeveloper;
    }

    // Richiesta di un servizio da parte del cliente(sviluppo,sito,etc)
    @Override
    public Request addRequest(DTORequest request) {
       

        
        EntityProject developAssignMent = repoDeveloper.findById(1).orElse(null);
        Request entity = mapper.addRequest(request);
        entity.setStatus_enum(developAssignMent.getStatus_enum());
        entity.setStatus(developAssignMent.getStatus_enum().getDescription());
        String text = "Salve,siamo lieti di comunicarle che il suo progetto avrà inizio non appena lo sviuppatore prenderà servizio,"
                +
                " le comunico ch l'id del suo progetto sarà " + " " + request.getId() +
                ".\n" + "Il developer incaricato sarà " + " " + developAssignMent.getName_developer();
        sendEmail(request.getEmail(), text, request.getId());

        return repository.save(entity);

    }

    @Override
    public Request getRequestById(int id) {
        Request request = repository.findById(id).orElse(null);

        return request;
    }

    // Richiesta eliminazione del servizio
    @Override
    public String requestDelete(int id) {
        Request request = getRequestById(id);

        try {
            repository.deleteById(id);
            String text = "Salve,abbiamo inoltrato  la sua richiesta di annullamento di" + request.getType_request()
                    + "con id " +
                    request.getId() + ".\n" +
                    "Verrà annullata non appena lo sviluppatore sarà operativo";

            sendEmail(request.getEmail(), text, request.getId());
            return "Richiesta inviata correttamente";
        } catch (Exception e) {
            return "richiesta non inviata a causa di un errore";
        }
    }

    // Invio della mail al cliente di ricezione da parte dello sviluppatore,che
    // riceverà una notifica sull'app
    public void sendEmail(String to, String text, int id) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Richiesta progetto id:" + id);
        message.setText(text);
        mailSender.send(message);
    }

   
}

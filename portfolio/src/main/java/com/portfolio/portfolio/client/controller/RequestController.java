package com.portfolio.portfolio.client.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfolio.client.Entity.Request;
import com.portfolio.portfolio.client.Service.RequestService;
import com.portfolio.portfolio.client.dto.DTORequest;

@RestController
// Tutte le rotte si torvano sotto questo nome
@RequestMapping("/client")
public class RequestController {

    
    protected RequestService service;

    
    public RequestController( @RequestBody RequestService service) {
        this.service = service;
    }

    // rotta per aggiunta nuovo progetto
    @PostMapping("/newProject")
    public Request addRequest( @RequestBody DTORequest request) {
        return service.addRequest(request);
    }

    // rotta per controllo stato progetto
    @GetMapping("/find/{id}")
    public Request getRequestById(@PathVariable int id) {
        return service.getRequestById(id);
    }

    // rotta per eiminazione richiesta progetto
    @DeleteMapping("/del/{id}")
    public String delRequest(@PathVariable int id) {

        return service.requestDelete(id);
    }

}

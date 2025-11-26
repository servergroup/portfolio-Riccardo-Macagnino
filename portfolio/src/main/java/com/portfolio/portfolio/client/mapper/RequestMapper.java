package com.portfolio.portfolio.client.mapper;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.portfolio.portfolio.client.Entity.Request;
import com.portfolio.portfolio.client.dto.DTORequest;

// Mapper dedicato a separare la logica di trasformazione dei dati dal service,
// migliorando la pulizia del codice e la separazione delle responsabilità.

@Component

public class RequestMapper {

    public Request addRequest(DTORequest request) {
        Request entity = new Request();
        Random random = new Random();
        
        request.setId(random.nextInt(100000));
        
        entity.setId(request.getId());
        entity.setStatus(request.getStatus());
        entity.setType_request(request.getType_request());
        entity.setEmail(request.getEmail());

        entity.setDescription(request.getDescription());
        entity.setNotice_developer(true);

        return entity;
    }

}

package com.portfolio.portfolio.client.Service;
// Interfaccia di servizio che definisce il contratto per la gestione delle richieste.

// Favorisce separazione delle responsabilità e testabilità.

import com.portfolio.portfolio.client.Entity.Request;
import com.portfolio.portfolio.client.dto.DTORequest;

public interface IRequestService {

    public Request addRequest(DTORequest request);

    public Request getRequestById(int id);

    public String requestDelete(int id);

   

}

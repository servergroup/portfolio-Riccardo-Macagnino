package com.portfolio.portfolio.client.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.portfolio.portfolio.client.Entity.Request;

//Repository MongoDb per la gestione delle richieste
// Utilizzo tale database in modo da gestire al meglio grandi quantità di dati
// rendo l'esercitazione più realistica
public interface RequestRepository extends MongoRepository<Request, Integer> {
}
package com.portfolio.portfolio.client.dto;

//Autore:Riccardo Macagnino
public class DTORequest {

    private int id; // dichiaro id della richiesta
    private String status; // dichiaro lo stato della richista
    private String type_request; // dichiaro il tipo di richiesta
    private String description; // dichiaro la descrizione della richiesta
    private String email;// dichiaro la mail del cliente
    

    // costruttore vuoto per crudRepository
    public DTORequest() {
    }

    // costruttore pieno per inizializzazione delle variabili sopra elencate
    public DTORequest( String status, String type_request, String description) {
        this.id=id;
        this.status = status;
        this.type_request = type_request;
        this.description = description;
    }

    // getters e setter seguiti da hashcode e equals e infine toString, importati
    // attraverso ALT + SHIFT + INSERT (VISUAL STUDIO CODE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType_request() {
        return type_request;
    }

    public void setType_request(String type_request) {
        this.type_request = type_request;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((type_request == null) ? 0 : type_request.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DTORequest other = (DTORequest) obj;
        if (id != other.id)
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (type_request == null) {
            if (other.type_request != null)
                return false;
        } else if (!type_request.equals(other.type_request))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Request [id=" + id + ", status=" + status + ", type_request=" + type_request + ", Description="
                + description + "]";
    }

}
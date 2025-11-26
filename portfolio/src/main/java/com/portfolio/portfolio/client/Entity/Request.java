package com.portfolio.portfolio.client.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.portfolio.portfolio.enumerator.enumerator;

@Document(collection = "Requests")
public class Request {

    @Id
    private int id;

    private String status;
    private String type_request;
    private enumerator status_enum;
    private String description;
    private String email;
    private boolean notice_developer;

    public Request() {
    }

    public Request(int id, String status, String type_request, String description) {
        this.id = id;
        this.status = status;
        this.status_enum=status_enum;
        this.type_request = type_request;
        this.description = description;
    }

    // GETTER & SETTER

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

    public enumerator getStatus_enum() {
        return status_enum;
    }

    public void setStatus_enum(enumerator status_enum) {
        this.status_enum = status_enum;
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

    public boolean isNotice_developer() {
        return notice_developer;
    }

    public void setNotice_developer(boolean notice_developer) {
        this.notice_developer = notice_developer;
    }
}

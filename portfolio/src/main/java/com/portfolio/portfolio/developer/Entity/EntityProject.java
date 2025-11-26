package com.portfolio.portfolio.developer.Entity;



import com.portfolio.portfolio.enumerator.enumerator;

import jakarta.persistence.*;

@Entity
public class EntityProject {
    @Id
    private int id_client;
    private enumerator status_enum = enumerator.PENDING;
    private String name_project;
    private String name_developer;

    public EntityProject() {
    }

    public EntityProject(int id_client, String name_project, String name_developer) {
        this.id_client = id_client;
        this.status_enum=status_enum;
        this.name_project = name_project;
        this.name_developer = name_developer;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getName_project() {
        return name_project;
    }

    public void setName_project(String name_project) {
        this.name_project = name_project;
    }

    public String getName_developer() {
        return name_developer;
    }

    public void setName_developer(String name_developer) {
        this.name_developer = name_developer;
    }

    public enumerator getStatus_enum() {
        return status_enum;
    }

    public void setStatus_enum(enumerator status_enum) {
        this.status_enum = status_enum;
    }

}

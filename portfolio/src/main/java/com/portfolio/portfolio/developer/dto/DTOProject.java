package com.portfolio.portfolio.developer.dto;

// DTO utilizzato per trasferire le informazioni principali di un progetto
// tra client e server. Contiene i dati essenziali relativi al cliente,
// al nome del progetto e allo sviluppatore assegnato.

public class DTOProject {

    private int id_client;
    private String name_project;
    private String name_developer;

    public DTOProject() {
    }

    public DTOProject(int id_client, String name_project, String name_developer) {
        this.id_client = id_client;
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

}

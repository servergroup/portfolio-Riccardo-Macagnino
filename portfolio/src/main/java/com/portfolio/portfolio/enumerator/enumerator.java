package com.portfolio.portfolio.enumerator;

public enum enumerator {
    OK("APPROVATO"),

    FINISH("TERMINATO"),

    PENDING("IN ATTESA");

    private final String description;

    

    private enumerator(String description) {
    this.description=description;
    }

    public String getDescription() {
        return description;
    }





    

}

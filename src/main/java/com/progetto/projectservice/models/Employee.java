package com.progetto.projectservice.models;

import com.progetto.projectservice.models.Progetto;

import java.util.LinkedList;
;

public class Employee {
    private String nome;
    private String cognome;
    private String employeeID;
    private String ruolo;
    private boolean manager;

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public Employee() {}

    public Employee(String nome, String cognome, String employeeID,String ruolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.employeeID = employeeID;
        this.ruolo = ruolo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }








}

package com.progetto.projectservice.models;

import com.progetto.projectservice.models.Progetto;

import java.util.LinkedList;
;

public class Employee {
    private String nome;
    private String cognome;
    private String employeeID;





    public Employee() {}

    public Employee(String nome, String cognome, String employeeID) {
        this.nome = nome;
        this.cognome = cognome;
        this.employeeID = employeeID;


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

    public String toString(){
        String s = "\nNome: "+ nome + " \nCognome: "+ cognome + "\n ID: "+employeeID;
        return s;
    }








}

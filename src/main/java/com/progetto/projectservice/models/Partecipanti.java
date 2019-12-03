package com.progetto.projectservice.models;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Partecipanti {
    LinkedList<Employee> partecipanti;
    private String projectID;
    private String managerID;


    public Partecipanti(String projectID,String managerID) {
        partecipanti = new LinkedList<>();
        this.projectID = projectID;
        this.managerID = managerID;
    }

    public void addPartecipanti(Employee e){
        partecipanti.add(e);
    }


    @Override
    public String toString(){
        String s = "";
       for(int i=0; i<partecipanti.size();i++){
           s += partecipanti.get(i).toString();

       }

        return s;
    }

}
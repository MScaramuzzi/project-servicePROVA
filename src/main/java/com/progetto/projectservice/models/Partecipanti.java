package com.progetto.projectservice.models;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Partecipanti {
    LinkedList<Employee> partecipanti;


    public Partecipanti() {
        partecipanti = new LinkedList<>();
    }

    public void addPartecipanti(Employee e){
        partecipanti.add(e);
    }


   /* public String toString(List<Employee> lista){
        String s = "";

        ListIterator<Employee> iter = lista.listIterator();
        while(iter.hasNext()){
            Employee e = iter.next();
            s += e.toString();

        }

        return s;
    }

    public String tooString(){
        String s = "";
        LinkedList<Employee> l = new LinkedList<>();
        for (Iterator i = l.iterator(); i.hasNext();) {
            s += l.toString();
        }
        return s;
    }
   */
}
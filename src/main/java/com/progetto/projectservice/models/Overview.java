package com.progetto.projectservice.models;

import com.progetto.projectservice.resources.ProjectResource;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Overview {
    private HashMap<Progetto, Partecipanti> overview;
    private Iterator<String> it;

    public Overview(){
        overview = new HashMap<>();
    }



    public void addProgetto(Progetto p, Partecipanti pa){
        overview.put(p,pa);
    }

    public String toString() {
        String s =new String();

        Iterator<Progetto> itP;
        Iterator<Employee> itE;
        Set<Progetto> setP= overview.keySet();
        itP= setP.iterator();
        while(itP.hasNext()){
            Progetto chiave=itP.next();
            s += "***************\n"+chiave.toString();
            itE=overview.get(chiave).partecipanti.iterator();
            while(itE.hasNext()){
                Employee emp=itE.next();

                s += emp.toString();

                if (emp.isManager()){
                    s += "MANAGER" ;
                }

            }
        }
        return s;
    }





}

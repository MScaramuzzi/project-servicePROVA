package com.progetto.projectservice.resources;

import com.progetto.projectservice.models.Progetto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {

    private List<Progetto> projects = new ArrayList<>(Arrays.asList(
            new Progetto("001","Project 1","Non facciamo un cazzo",400),
            new Progetto("002","Project 2","Dormiamo",666),
            new Progetto("003","Project 3","Degaetaniamo",0)
    ));

    public List<Progetto> getAllProjects() {
        return projects;
    }

    public Progetto getProgetto(String projectID){
        return projects.stream().filter(p -> p.getProjectID().equals(projectID)).findFirst().get();
    }
}

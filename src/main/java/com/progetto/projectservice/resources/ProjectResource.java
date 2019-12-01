package com.progetto.projectservice.resources;

import com.progetto.projectservice.models.Employee;
import com.progetto.projectservice.models.Overview;
import com.progetto.projectservice.models.Partecipanti;
import com.progetto.projectservice.models.Progetto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


@RestController

public class ProjectResource {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/projects")
    public List<Progetto> getProject(){

        return projectService.getAllProjects();
        /*Employee e1 =new Employee("childish","gambino","0000","Programmatore");
        Employee e2 = new Employee("carlo","vacca","0001","Nullafacente");
        e1.setManager(true);
        Partecipanti partecipanti= new Partecipanti();
        partecipanti.addPartecipanti(e1);
        partecipanti.addPartecipanti(e2);
        Progetto progetto1 = new Progetto("OOOk","Descrixiozne",544);
        Overview overview1 = new Overview();
        overview1.addProgetto(progetto1,partecipanti);
        overview1.stream();*/
    }
    @RequestMapping("/projects/{projectID}")
    public Progetto getProgetto(@PathVariable String projectID){
        return projectService.getProgetto(projectID);
    }

}
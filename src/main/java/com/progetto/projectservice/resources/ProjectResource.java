package com.progetto.projectservice.resources;

import com.progetto.projectservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;


@RestController

public class ProjectResource {

    @Autowired
    private ProjectService projectService;

    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping("/projects")
    public List<Progetto> getProject(){

        return projectService.getAllProjects();

    }

    @RequestMapping("/projects/{projectID}")
    public Progetto getProgetto(@PathVariable String projectID){
        return projectService.getProgetto(projectID);
    }

    @RequestMapping("/overview/{projectID}")
    public String overview(@PathVariable String projectID){

        String s = "Overview del progetto ";
        Manager m1= new Manager("Confused","Travolta","789");
        Partecipanti partecipanti = new Partecipanti(projectID,m1.getManagerID());

        partecipanti.addPartecipanti( restTemplate.getForObject("http://localhost:8082/employees/123",Employee.class));
        partecipanti.addPartecipanti( restTemplate.getForObject("http://localhost:8082/employees/666",Employee.class));
        partecipanti.addPartecipanti( restTemplate.getForObject("http://localhost:8082/employees/456",Employee.class));


         s += "\n" + projectService.getProgetto(projectID).toString() + m1.toString()+ "\n" + partecipanti.toString() ;


        return s;
    }

}
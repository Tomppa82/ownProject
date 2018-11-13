package com.buutcamp.controller;


import com.buutcamp.dao.TeamDAO;

import com.buutcamp.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {


    @Autowired
    private TeamDAO teamDAO;

    @GetMapping("/")
    public String frontPageGET(Model model){

        List<Team> teams = teamDAO.getTeams();


        model.addAttribute("teams",teams);

        model.addAttribute("team", new Team());

        return "homepage";
    }



    @GetMapping("/updateTeam")
    public String updateTeam(@RequestParam("teamId") int id, Model model) {
        Team team = teamDAO.getTeam(id);
        model.addAttribute("team",team);

        return "homepage";
    }

    @PostMapping("/searchStudents")
    public String searchTeam(@RequestParam("searchValue") String searchVal, Model model) {

        List<Team> team = teamDAO.searchTeam(searchVal);
        model.addAttribute("team", team);
        return "homepage";
    }
}

















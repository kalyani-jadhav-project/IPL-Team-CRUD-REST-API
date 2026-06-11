package com.IPL.ipl_team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeamController {

    @Autowired
    private TeamService service;

    // Save Team
    @PostMapping("/save")
    public Team saveTeam(@RequestBody Team team) {
        return service.saveTeam(team);
    }

    // Get All Teams
    @GetMapping("/getall")
    public List<Team> getAllTeams() {
        return service.getAllTeams();
    }

    // Get Team By Id
    @GetMapping("/get/{id}")
    public Team getTeamById(@PathVariable int id) {
        return service.getTeamById(id);
    }

    // Update Team
    @PutMapping("/update")
    public Team updateTeam(@RequestBody Team team) {
        return service.updateTeam(team);
    }

    // Delete Team
    @DeleteMapping("/delete/{id}")
    public String deleteTeam(@PathVariable int id) {
        return service.deleteTeam(id);
    }
}
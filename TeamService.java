package com.IPL.ipl_team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    TeamDao dao;

    public Team saveTeam(Team team) {
        return dao.save(team);
    }

    public List<Team> getAllTeams() {
        return dao.findAll();
    }

    public Team getTeamById(int id) {
        return dao.findById(id).orElse(null);
    }

    public Team updateTeam(Team team) {
        return dao.save(team);
    }

    public String deleteTeam(int id) {
        dao.deleteById(id);
        return "Team Deleted";
    }
}
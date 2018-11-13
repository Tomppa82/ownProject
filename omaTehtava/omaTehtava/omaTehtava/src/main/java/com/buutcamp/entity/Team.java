package com.buutcamp.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class Team {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamDetails_id")

    private TeamDetails teamDetails;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "team_name")
    private String teamName;

    public Team() {
    }

    public Team(String cityName, String teamName, TeamDetails teamDetails) {

        this.cityName = cityName;
        this.teamName = teamName;
        this.teamDetails = teamDetails;
    }

    public Team(String city, String team) {
        this.cityName = city;
        this.teamName = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public TeamDetails getTeamDetails() {
        return teamDetails;
    }

    public void setTeamDetails(TeamDetails teamDetails) {
        this.teamDetails = teamDetails;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamDetails=" + teamDetails +
                ", id=" + id +
                ", cityName='" + cityName + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}

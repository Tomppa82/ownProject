package com.buutcamp.entity;

import javax.persistence.*;

@Entity
@Table(name = "teamDetails")
public class TeamDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "establish_year")
    private String establish_year;

    @Column(name = "champions_count")
    private int champions_count;

    @Column(name = "current_rank")
    private int current_rank;

    @Column(name = "coach")
    private String coach;

    public TeamDetails() {
    }


    public TeamDetails(String establish_year, int champions_count, int current_rank, String coach) {

        this.establish_year = establish_year;
        this.champions_count = champions_count;
        this.current_rank = current_rank;
        this.coach = coach;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstablish_year() {
        return establish_year;
    }

    public void setEstablish_year(String establish_year) {
        this.establish_year = establish_year;
    }

    public int getChampions_count() {
        return champions_count;
    }

    public void setChampions_count(int champions_count) {
        this.champions_count = champions_count;
    }

    public int getCurrent_rank() {
        return current_rank;
    }

    public void setCurrent_rank(int current_rank) {
        this.current_rank = current_rank;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "TeamDetails{" +
                "id=" + id +
                ", establish_year='" + establish_year + '\'' +
                ", champions_count=" + champions_count +
                ", current_rank=" + current_rank +
                ", coach='" + coach + '\'' +
                '}';
    }


}

package com.buutcamp.dao;


import com.buutcamp.entity.Team;
import com.buutcamp.main.SetTeams;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class TeamDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Team> getTeams() {

        Session session = sessionFactory.getCurrentSession();

        Query<Team> query = session.createQuery("from Team", Team.class);
        return query.getResultList();

    }

    @Transactional
    public void saveTeam(Team team) {

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(team);
    }

    @Transactional
    public List<Team> searchTeam(String searchVal) {
        Session session = sessionFactory.getCurrentSession();

        Query query;

        if (searchVal != null && searchVal.trim().length() > 0) {
            query = session.createQuery("from teams where lower(team_name) " +
                    "like :searchValue or lower(city_name) like :searchValue", Team.class);
            query.setParameter("searchValue", "%" + searchVal.toLowerCase() + "%");

        } else {
            query = session.createQuery("from teams", Team.class);
        }
        return query.getResultList();
    }

    @Transactional
    public Team getTeam(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Team.class, id);

    }

}












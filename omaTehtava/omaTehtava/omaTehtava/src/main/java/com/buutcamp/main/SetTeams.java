package com.buutcamp.main;

import com.buutcamp.entity.Team;
import com.buutcamp.entity.TeamDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SetTeams {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Team.class)
                .addAnnotatedClass(TeamDetails.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        Team team1 = new Team("Oulu", "Kärpät");
        TeamDetails teamDetails1 = new TeamDetails("1946",8,1,"Mikko Manner");
        team1.setTeamDetails(teamDetails1);

        Team team2 = new Team("Rauma", "Lukko");
        TeamDetails teamDetails2 = new TeamDetails("1936",1,4,"Pekka Virta");
        team2.setTeamDetails(teamDetails2);

        Team team3 = new Team("Tampere", "Tappara");
        TeamDetails teamDetails3 = new TeamDetails("1955",17,6,"Jukka Rautakorpi");
        team3.setTeamDetails(teamDetails3);

        Team team4 = new Team("Tampere", "Ilves");
        TeamDetails teamDetails4 = new TeamDetails("1931",16,4,"Karri Kivi");
        team4.setTeamDetails(teamDetails4);

        Team team5 = new Team("Turku", "TPS");
        TeamDetails teamDetails5 = new TeamDetails("1922",11,2,"Kalle Kaskinen");
        team5.setTeamDetails(teamDetails5);

        Team team6 = new Team("Pori", "Ässät");
        TeamDetails teamDetails6 = new TeamDetails("1960",3,15,"Mikael Kotkaniemi");
        team6.setTeamDetails(teamDetails6);

        Team team7 = new Team("Kouvola", "KooKoo");
        TeamDetails teamDetails7 = new TeamDetails("1965",0,11,"Tuomas Tuokkola");
        team7.setTeamDetails(teamDetails7);

        Team team8 = new Team("Mikkeli", "Jukurit");
        TeamDetails teamDetails8 = new TeamDetails("1970",0,9,"Mikko Kangasalusta");
        team8.setTeamDetails(teamDetails8);

        Team team9 = new Team("Lappeenrata", "SaiPa");
        TeamDetails teamDetails9 = new TeamDetails("1948",0,7,"Tero Lehterä");
        team9.setTeamDetails(teamDetails9);

        Team team10 = new Team("Helsinki", "HIFK");
        TeamDetails teamDetails10 = new TeamDetails("1928",7,10,"Ari-Pekka Selin");
        team10.setTeamDetails(teamDetails10);

        Team team11 = new Team("Hämeenlinna", "Hpk");
        TeamDetails teamDetails11 = new TeamDetails("1929",1,3,"Antti Pennanen");
        team11.setTeamDetails(teamDetails11);

        Team team12 = new Team("Kuopio", "KalPa");
        TeamDetails teamDetails12 = new TeamDetails("1929",0,12,"Sami Kapanen");
        team12.setTeamDetails(teamDetails12);

        Team team13 = new Team("Jyväskylä", "JYP");
        TeamDetails teamDetails13 = new TeamDetails("1929",2,14,"Lauri Merikivi");
        team13.setTeamDetails(teamDetails13);

        Team team14 = new Team("Vaasa", "Sport");
        TeamDetails teamDetails14 = new TeamDetails("1962",0,8,"Ari-Pekka Pajuluoma");
        team14.setTeamDetails(teamDetails14);

        Team team15 = new Team("Lahti", "Pelicans");
        TeamDetails teamDetails15 = new TeamDetails("1891",0,5,"Ville Nieminen");
        team15.setTeamDetails(teamDetails15);

        session.beginTransaction();

        session.save(team1);
        session.save(team2);
        session.save(team3);
        session.save(team4);
        session.save(team5);
        session.save(team6);
        session.save(team7);
        session.save(team8);
        session.save(team9);
        session.save(team10);
        session.save(team11);
        session.save(team12);
        session.save(team13);
        session.save(team14);
        session.save(team15);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}





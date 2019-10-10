package com.vcs.lects.l14.jpa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Random;

public class JPAMain {

    //l14_lect_kontekstas

    public static void main(String[] args) {

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("l14_lect_kontekstas");

        JPAMain jpaMain = new JPAMain();
        jpaMain.generateSomePersons(emFactory);

//        List<Person> result = jpaMain.listPersons(emFactory);
//
//
//
//        for (Person p: result) {
//            System.out.println(p);
//        }

        jpaMain.updateEntity(emFactory);

        emFactory.close();
    }


    private void generateSomePersons(EntityManagerFactory emFactory) {

        EntityManager em = emFactory.createEntityManager();

        em.getTransaction().begin();

        Random rnd = new Random();

        int rndBound = rnd.nextInt(40);

//        Person p = null;
        for (int i = 0; i < rndBound; i++) {
//            p = new Person();
//            p.setName("Tomas " + rnd.nextInt());
//            p.setSurname("Pavardauskas");
//            Dog d = new Dog();
//            d.setName("Ciucikas" + i);
//            em.persist(p);

                        Dog d = new Dog();
            d.setName("Auau " + i);
            em.persist(d);
        }

        em.getTransaction().commit();

        em.close();

    }

    private void updateEntity(EntityManagerFactory emFactory) {
        EntityManager em = emFactory.createEntityManager();

        em.getTransaction().begin();
        Dog dog = em.find(Dog.class, 1);
        dog.setName("Plutas");
        em.getTransaction().commit();
        em.close();

    }


    private List<Person> listPersons(EntityManagerFactory emFactory) {
        EntityManager em = emFactory.createEntityManager();

        em.getTransaction().begin();

        TypedQuery<Person> result = em.createQuery("SELECT obj FROM Person obj", Person.class);

        List<Person> persons = result.getResultList();

        em.getTransaction().commit();

        em.close();

        return persons;
    }


}

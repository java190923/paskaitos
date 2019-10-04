package com.vcs.lects.l09.tasks;

import java.util.Objects;

public class Person {

    // Asmens ID bet kokioje sistemoje
    private String id;

    // Vardas
    private String name;

    // Pavardė
    private String surname;

    // Asmens kodas
    private String ak;

    // Gimimo metai
    private Integer bYear;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public Integer getbYear() {
        return bYear;
    }

    public void setbYear(Integer bYear) {
        this.bYear = bYear;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.surname);
        hash = 53 * hash + Objects.hashCode(this.ak);
        hash = 53 * hash + Objects.hashCode(this.bYear);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return true;
    }
    
    

}

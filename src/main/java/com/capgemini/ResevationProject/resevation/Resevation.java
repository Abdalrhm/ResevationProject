package com.capgemini.ResevationProject.resevation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resevation {

    @Id
    @GeneratedValue
    private Long id;
    private int numOfTables;
    private String guestFirstName;
    private String guestLastName;
    private String dateNtime;
    private int telefoon;
    private int numberOfGuest;

    public Resevation() {
    }

    public Resevation(Long id, int numOfTables, String guestFirstName, String guestLastName, String dateNtime, int telefoon, int numberOfGuest) {
        this.id = id;
        this.numOfTables = numOfTables;
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
        this.dateNtime = dateNtime;
        this.telefoon = telefoon;
        this.numberOfGuest = numberOfGuest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumOfTables() {
        return numOfTables;
    }

    public void setNumOfTables(int numOfTables) {
        this.numOfTables = numOfTables;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public String getDateNtime() {
        return dateNtime;
    }

    public void setDateNtime(String dateNtime) {
        this.dateNtime = dateNtime;
    }



    public int getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(int telefoon) {
        this.telefoon = telefoon;
    }

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }
}
package com.example.com.example;

import java.util.Date;

public class Zadanie {

    public Zadanie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "";


    public boolean isVipolneno() {
        return vipolneno;
    }

    public void setVipolneno(boolean vipolneno) {
        this.vipolneno = vipolneno;
    }

    boolean vipolneno = false;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date = null;


    public String getDatezadachi() {
        return datezadachi;
    }

    public void setDatezadachi(String datezadachi) {
        this.datezadachi = datezadachi;
    }

    private String datezadachi = "";


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    private String ID = "";

}

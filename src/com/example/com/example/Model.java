package com.example.com.example;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<Zadanie> list = new ArrayList<Zadanie>();

    public Model() {
    }

    public void add(Zadanie zadanieParametr)
    {
        list.add(zadanieParametr);
    }
    public void remove (Zadanie zadanieParametr) {list.remove(zadanieParametr);}
    public void remove (int i) {list.remove(i);}
    public Zadanie getZadanie (int i) { return list.get(i); }
    public int getListSize() { return list.size(); }

}

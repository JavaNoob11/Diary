package com.example.com.example;

import java.util.Scanner;

public class Controller {
    private Model m = new Model();

    public Controller() {
        this.command = command;
    }

    public void setCommand (String s) {command = s;}
    String command = "";
    public void execute() {
        if ("1".equals(command)) {
            add();
            System.out.println("Было добавлено задание");
        } else if ("2".equals(command)) {
            delete();
            System.out.println("Задание было удалено");
        } else if ("3".equals(command)) {
            showList();
            System.out.println("Вызов размера списка");
        } else if ("4".equals(command)) {
            ispolnenie();
            System.out.println("Задание выполнено");
        }
    }

    public Controller(String command) {
            this.command = command;
        }


    private void add() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите текст задачи: ");
        String text1 = scn.nextLine();
        System.out.println("Введите дату: ");
        String date = scn.nextLine();

        Zadanie z1 = new Zadanie(text1);
        z1.setDatezadachi(date);
        m.add(z1);

    }

    private void delete() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите номер задания которое надо удалить: ");
        int num = scn.nextInt();

        m.remove(num);
    }

    private void showList() {
        System.out.println("СПИСОК" + m.getListSize());
        for (int i = 0; i<m.getListSize(); i++){
            Zadanie z1 = m.getZadanie(i);
            z1.getDatezadachi();
            Zadanie z2 = m.getZadanie(i);
            z2.isVipolneno();
            System.out.println("Задание в списке номер " +  i + " - Название задания: " + m.getZadanie(i).getName() + ", " + z1.getDatezadachi() + ", " + z2.isVipolneno());
        }}

        private void ispolnenie (){
            showList();
            System.out.println("Введите номер задачи которая выполнена: ");
            Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();
            Zadanie z1 = m.getZadanie(num);
            z1.setVipolneno(true);

    }
    }


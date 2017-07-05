package com.example;
import com.example.com.example.Controller;

import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Мои ежедневные задания: ");

        Controller c = new Controller();

        boolean r = true;
        while(r==true){
            int number1 = scn.nextInt();
            String peremennayastring =  Integer.toString(number1);
            c.setCommand(peremennayastring);
            c.execute();
        }
    }
    }


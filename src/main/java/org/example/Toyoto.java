package org.example;

public class Toyoto implements Model{
    @Override
    public void drive(String str) {
        System.out.println(str+ " Toyoto");
    }
}

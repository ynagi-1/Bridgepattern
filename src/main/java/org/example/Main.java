package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehical vehical = new Car (new Toyoto());
        vehical.drive();
        Vehical vehical2 = new Track (new Audi());
        vehical2.drive();

        }
    }

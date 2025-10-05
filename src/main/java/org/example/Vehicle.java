package org.example;
abstract class Vehical {
    Model model;
    public Vehical(Model model) {
        this.model = model;
    }
    abstract void drive();
}

package org.example;

public class Car extends Vehical {
    public Car(Model model) {
        super(model);
    }
    @Override
    void drive() {
        model.drive("Drive car");
    }
}

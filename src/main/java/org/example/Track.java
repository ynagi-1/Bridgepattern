package org.example;

public class Track extends Vehical {
    public Track(Model model) {
        super(model);
    }
    @Override
    void drive() {
        model.drive("Drive track");
    }
}


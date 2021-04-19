package com.tts.lab;


///////////trying to create custom class & making it default which is "protected"

public class Car {
    private String make, model;
    private int manufacturingYear;

    public Car() {
//            make = "";
//            model = "";
//            manufacturingYear = 2010;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        manufacturingYear = 2010;
    }

    public Car(String make, String model, int manufacturingYear) {
        this.make = make;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
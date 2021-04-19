package com.tts.lab;

public class Pet {
    public static void main(String[] args) {
///// Calling Pet here & setting the value
        Pet pet = new Pet();
        pet.setName("Gage");
        pet.setAge(2);
        pet.setLocation("Siberia");
        pet.setType("Husky");


         System.out.println(pet.name);
        System.out.println(pet.age);
        System.out.println(pet.location);
        System.out.println(pet.type);




   //////// calling Car here & setting the value

     Car car = new Car();
     car.setMake("Toyota");
     car.setModel("High Lander limited");

     System.out.println(car.getMake());
        System.out.println(car.getModel());


    }
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet() {
        name = "";
        age = 0;
        location = "";
        type = "";
    }

    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }


}



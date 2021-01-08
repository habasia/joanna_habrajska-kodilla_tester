package com.kodilla.abstracts.homework;

public class JobApplication {

    public static void main(String[] args) {
        Job engineer = new Engineer();
        Job teacher = new Teacher();
        Job developer = new Developer(); //mam zacmienie. jak dosięgnąc klasy z konstruktora bez tworzenia obiektu? da sie?

        Person asia = new Person("Asia",25,engineer);
        Person pawel = new Person("Pawel",25,developer);
        Person andrzej = new Person("Andrzej",40,teacher);


        role(asia);
        role(pawel);
        role(andrzej);
    }

    public static void role(Person person) {
        System.out.println(person.firstName + "'s responsibilities is/are " + person.job.responsibilities());
    }
}

package com.myfirstSeleniumProject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class n01_day05_Faker {

    @Test
    public void javaFaker() {

        Faker faker = new Faker();

        System.out.println(faker.book().author());

        System.out.println(faker.address().cityName());


        System.out.println(faker.name().firstName());

        System.out.println(faker.dragonBall().character());

        System.out.println(faker.internet().password());

        System.out.println(faker.phoneNumber().cellPhone());

        System.out.println(faker.harryPotter().spell());

        System.out.println(faker.lordOfTheRings().character());

        System.out.println(faker.lordOfTheRings().location());


    }

}

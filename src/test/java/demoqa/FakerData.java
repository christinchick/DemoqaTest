package demoqa;

import com.github.javafaker.Faker;

public class FakerData {
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String currentAddress = faker.address().city();
    String setRandomNumber = faker.numerify("##########");
}

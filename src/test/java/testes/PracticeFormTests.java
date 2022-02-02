package testes;

import com.github.javafaker.Faker;
import demoqa.StartTestDemoqaRegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests extends StartTestDemoqaRegistrationPage{
    StartTestDemoqaRegistrationPage startTestDemoqaRegistrationPage = new StartTestDemoqaRegistrationPage();
    static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
                         lastName = faker.name().lastName(),
                         userEmail = faker.internet().emailAddress(),
                         currentAddress = faker.address().city(),
                         setRandomNumber = faker.numerify("##########");

    @Test
    void fillFormTest() {
        startTestDemoqaRegistrationPage.openPage();
        startTestDemoqaRegistrationPage.registrationFormTestFirstName(firstName);
        startTestDemoqaRegistrationPage.registrationFormTestLastName(lastName);
        startTestDemoqaRegistrationPage.setGender();
        startTestDemoqaRegistrationPage.setFakerNumber(setRandomNumber);
        startTestDemoqaRegistrationPage.registrationUserEmail(userEmail);
        startTestDemoqaRegistrationPage.setDate("June", "1991", "27");
        startTestDemoqaRegistrationPage.setSubjects();
        startTestDemoqaRegistrationPage.selectHobbies();
        startTestDemoqaRegistrationPage.fileFile();
        startTestDemoqaRegistrationPage.selectAddress(currentAddress);
        startTestDemoqaRegistrationPage.chooseStateAndCity();
        startTestDemoqaRegistrationPage.pressSubmit();
        startTestDemoqaRegistrationPage.checkTestSubmittingForm();
    }
}

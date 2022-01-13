package testes;

import demoqa.StartTestDemoqaRegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {
    StartTestDemoqaRegistrationPage startTestDemoqaRegistrationPage = new StartTestDemoqaRegistrationPage();

    @Test
    void fillFormTest() {
        startTestDemoqaRegistrationPage.openPage();
        startTestDemoqaRegistrationPage.registrationFormTestFirstName();
        startTestDemoqaRegistrationPage.registrationFormTestLastName();
        startTestDemoqaRegistrationPage.setGender();
        startTestDemoqaRegistrationPage.setRandomNumber();
        startTestDemoqaRegistrationPage.registrationUserEmail();
        startTestDemoqaRegistrationPage.setDate("June", "1991", "27");
        startTestDemoqaRegistrationPage.setSubjects();
        startTestDemoqaRegistrationPage.selectHobbies();
        startTestDemoqaRegistrationPage.fileFile();
        startTestDemoqaRegistrationPage.selectAddress();
        startTestDemoqaRegistrationPage.chooseStateAndCity();
        startTestDemoqaRegistrationPage.pressSubmit();
        startTestDemoqaRegistrationPage.checkTestSubmittingForm();
    }
}

package testes;

import com.github.javafaker.Faker;
import demoqa.StartTestDemoqaRegistrationPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class PracticeFormTests extends StartTestDemoqaRegistrationPage{
    StartTestDemoqaRegistrationPage startTestDemoqaRegistrationPage = new StartTestDemoqaRegistrationPage();
    static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
                         lastName = faker.name().lastName(),
                         userEmail = faker.internet().emailAddress(),
                         currentAddress = faker.address().city(),
                         setRandomNumber = faker.numerify("##########");

    @Owner("Christinchick")
    @Feature("RegistrationForm")
    @Story("Регистрация")
    @DisplayName("Регистрация")
    @Test
    void fillFormTest() {
        step("Открываем страницу", () -> {
            startTestDemoqaRegistrationPage.openPage();
        });
        step("Заполняем поле First Name", () -> {
            startTestDemoqaRegistrationPage.registrationFormTestFirstName(firstName);
        });
        step("Заполняем поле Last Name", () -> {
            startTestDemoqaRegistrationPage.registrationFormTestLastName(lastName);
        });
        step("Выбираем Gender", () -> {
            startTestDemoqaRegistrationPage.setGender();
        });
        step("Вводим Mobile Namber", () -> {
            startTestDemoqaRegistrationPage.setFakerNumber(setRandomNumber);
        });
        step("Заполняем поле Email", () -> {
            startTestDemoqaRegistrationPage.registrationUserEmail(userEmail);
        });
        step("Выбираем Date of Birth", () -> {
            startTestDemoqaRegistrationPage.setDate("June", "1991", "27");
        });
        step("Заполняем поле Subjects", () -> {
            startTestDemoqaRegistrationPage.setSubjects();
        });
        step("Выбираем Hobbies", () -> {
            startTestDemoqaRegistrationPage.selectHobbies();
        });
        step("Прикрепляем Picture", () -> {
            startTestDemoqaRegistrationPage.fileFile();
        });
        step("Заполняем поле Current Address", () -> {
            startTestDemoqaRegistrationPage.selectAddress(currentAddress);
        });
        step("Выбираем State and City", () -> {
            startTestDemoqaRegistrationPage.chooseStateAndCity();
        });
        step("Кликаем кнопку Submit", () -> {
            startTestDemoqaRegistrationPage.pressSubmit();
        });
        step("Проверяем введенные даные", () -> {
            startTestDemoqaRegistrationPage.checkTestSubmittingForm();
        });
    }
}

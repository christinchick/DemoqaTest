package demoqa;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static testes.PracticeFormTests.*;

public class StartTestDemoqaRegistrationPage {

       public StartTestDemoqaRegistrationPage openPage() {
       open("/automation-practice-form");
       $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
       return this;
   }
    public StartTestDemoqaRegistrationPage registrationFormTestFirstName(String name) {
        $("#firstName").setValue(name);
        return this;
   }
    public StartTestDemoqaRegistrationPage registrationFormTestLastName(String name) {
        $("#lastName").setValue(name);
        return this;
    }
    public StartTestDemoqaRegistrationPage setGender(){
        $("#genterWrapper").$(byText("Male")).click();
        return this;
    }
    public StartTestDemoqaRegistrationPage setFakerNumber(String number) {
        $("#userNumber").setValue(number);
        return this;
    }
    public StartTestDemoqaRegistrationPage registrationUserEmail(String email) {
        $("#userEmail").setValue(email);
        return this;
    }
    public StartTestDemoqaRegistrationPage setDate(String month, String year , String day) {
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption(month);
            $(".react-datepicker__year-select").selectOption(year);
            $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
            return this;
    }
    public StartTestDemoqaRegistrationPage setSubjects() {
        $("#subjectsInput").setValue("Arts").pressEnter().setValue("Chemistry").pressEnter();
        return this;
    }
    public StartTestDemoqaRegistrationPage selectHobbies() {
        $("#hobbiesWrapper").$(byText("Music")).scrollTo().click();
        return this;
    }
    public StartTestDemoqaRegistrationPage fileFile() {
        $("#uploadPicture").uploadFile(new File("src/test/resources/1.png"));
        $("#uploadPicture").uploadFromClasspath("1.png");
        return this;
    }
    public StartTestDemoqaRegistrationPage selectAddress(String address) {
        $("#currentAddress").setValue(address);
        return this;
    }
    public StartTestDemoqaRegistrationPage chooseStateAndCity() {
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        return this;
    }
    public void pressSubmit() {
        $("#submit").click();
   }

    public StartTestDemoqaRegistrationPage checkTestSubmittingForm(){
        $("#example-modal-sizes-title-lg").shouldBe(visible);
        $(".modal-body").shouldHave((text(firstName)),
                (text(lastName)),
                (text(userEmail)),
                (text("Male")),
                (text(setRandomNumber)),
                (text("27 June,1991")),
                (text("Arts, Chemistry")),
                (text("Music")),
                (text("1.png")),
                (text(currentAddress)),
                (text("Haryana Karnal")));
                return this;
    }
}

package demoqa;

import com.github.javafaker.Faker;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StartTestDemoqaRegistrationPage extends FakerData{
       public void openPage() {
       open("https://demoqa.com/automation-practice-form");
       $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
   }
    public void registrationFormTestFirstName() {
        $("#firstName").setValue(firstName);
   }
    public void registrationFormTestLastName() {
        $("#lastName").setValue(lastName);
    }
    public void setGender(){
        $("#genterWrapper").$(byText("Male")).click();
    }
    public void setRandomNumber() {
        $("#userNumber").setValue(setRandomNumber);
    }
    public void registrationUserEmail() {
        $("#userEmail").setValue(userEmail);
    }
    public void setDate(String month, String year , String day) {
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption(month);
            $(".react-datepicker__year-select").selectOption(year);
            $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }
    public void setSubjects() {
        $("#subjectsInput").setValue("Arts").pressEnter().setValue("Chemistry").pressEnter();
    }
    public void selectHobbies() {
        $("#hobbiesWrapper").$(byText("Music")).scrollTo().click();
    }
    public void fileFile() {
        $("#uploadPicture").uploadFile(new File("src/test/resources/1.png"));
        $("#uploadPicture").uploadFromClasspath("1.png");
    }
    public void selectAddress() {
        $("#currentAddress").setValue(currentAddress);
    }
    public void chooseStateAndCity() {
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
    }
    public void pressSubmit() {
        $("#submit").click();
   }

    public void checkTestSubmittingForm(){
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
    }
}

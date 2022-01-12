package testes;

import com.codeborne.selenide.Configuration;
import demoqa.DataOpenPage;
//import demoqa.СheckTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static demoqa.DataOpenPage.setRandomNumber;

public class PracticeFormTests {
    DataOpenPage dataOpenPage = new DataOpenPage();

    @Test
    void fillFormTest() {
        dataOpenPage.openPage();
        dataOpenPage.registrationFormTestFirstName();
        dataOpenPage.registrationFormTestLastName();
        dataOpenPage.setGender();
        dataOpenPage.setRandomNumber();
        dataOpenPage.registrationUserEmail();
        dataOpenPage.setDate("June", "1991", "27");
        dataOpenPage.setSubjects();
        dataOpenPage.selectHobbies();
        dataOpenPage.fileFile();
        dataOpenPage.selectAddress();
        dataOpenPage.chooseStateAndCity();
        dataOpenPage.pressSubmit();






    }

}

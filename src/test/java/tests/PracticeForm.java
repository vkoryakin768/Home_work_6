package tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;




public class PracticeForm extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void testPracticeForm() {
        registrationPage.openPage()
                .removePage()
                .setFirstName("Egor")
                .setLastName("Egorov")
                .setUserEmail("Egor@egorov.com")
                .setGender()
                .setNumber("9995553377")
                .setDateOfBirth("23","July","1996")
                .setSubjects("Math")
                .setSubjects("Physics")
                .setHobbies()
                .setPicture("Screenshot_2.png")
                .setAddress("Street 1")
                .setStateAndCity("NCR", "Gurgaon")
                .submit();

        registrationPage.checkFinalResult("Egor Egorov")
                .checkFinalResult("Egor@egorov.com")
                .checkFinalResult("Male")
                .checkFinalResult("9995553377")
                .checkFinalResult("23 July,1996")
                .checkFinalResult("Maths, Physics")
                .checkFinalResult("Sports")
                .checkFinalResult("Screenshot_2.png")
                .checkFinalResult("Street 1")
                .checkFinalResult("NCR Gurgaon");

    }
@Test
    void minTestValue() {
    registrationPage.openPage()
            .removePage()
            .setFirstName("Egor")
            .setLastName("Egorov")
            .setUserEmail("Egor@egorov.com")
            .setGender()
            .setNumber("9995553377")
            .setDateOfBirth("23", "July", "1996")
            .submit();

    registrationPage.checkFinalResult("Egor Egorov")
            .checkFinalResult("Egor@egorov.com")
            .checkFinalResult("9995553377")
            .checkFinalResult("23 July,1996");
}
@Test
    void negativeTestPracticeForm(){
    registrationPage.openPage()
            .removePage()
            .setUserEmail("Egor@egorov.com")
            .setSubjects("Math")
            .setSubjects("Physics")
            .submit();

    registrationPage.resultWindow();
}

}

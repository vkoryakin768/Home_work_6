package tests;

import org.junit.jupiter.api.Test;
import pages.components.TextBoxComponent;
import pages.TextBoxPage;



public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxComponent textBoxComponent = new TextBoxComponent();
    @Test
    void fillFormTest() {
        textBoxPage.openForm()
                .removePage()
                .setName("Egor")
                .setEmail("Egor@egorov.com")
                .setCurrentAddress("Street 1")
                .setPermanentAddress("Street 2")
                .clickSubmit();

        textBoxComponent.resultName("Egor")
                        .resultEmail("Egor@egorov.com")
                        .resultCurrentAddress("Street 1")
                        .resultPermanentAddress("Street 2");
    }
}


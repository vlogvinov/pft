package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("first name", "middle name", "last name", "nichname", "title", "company", "address", "Home",
                "Mobile", "Work", "Fax", "email", "email2", "email3", "homepage", "22", "August", "1993",
                "11", "July", "1994", "secondaryAddress", "phone2", "notes"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}

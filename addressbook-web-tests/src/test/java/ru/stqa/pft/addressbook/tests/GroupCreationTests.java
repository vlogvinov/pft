package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("my first group", "my first group", "footer"));
        app.sumbitGroupCreation();
        app.returnToGroupsPage();
        app.logout();
    }
}

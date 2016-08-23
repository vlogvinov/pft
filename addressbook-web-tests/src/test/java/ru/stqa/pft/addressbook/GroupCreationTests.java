package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupsPage();
        initGroupCreation();
        fillGroupForm(new GroupData("my first group", "my first group", "footer"));
        sumbitGroupCreation();
        returnToGroupsPage();
        logout();
    }
}

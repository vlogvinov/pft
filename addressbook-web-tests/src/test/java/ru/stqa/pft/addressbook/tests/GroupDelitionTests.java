package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.goToGroupsPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupsPage();
    }

}

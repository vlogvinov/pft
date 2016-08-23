package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class SessionHelper extends HelperBase {

    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void login(UserData userData) {
        type(By.name("user"), userData.getUsername());
        type(By.name("pass"), userData.getPassword());
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

    public void logout() {
        click(By.linkText("Logout"));
    }
}

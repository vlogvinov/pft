package ru.stqa.pft.addressbook.model;

public class UserData {
    private final String username;
    private final String password;

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

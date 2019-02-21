package model;

import java.time.LocalDateTime;

public class User{

    String login, password;
    LocalDateTime date_added;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDate_added() {
        return date_added;
    }

    public void setDate_added(LocalDateTime date_added) {
        this.date_added = date_added;
    }

    public User(String login, String password, LocalDateTime date_added) {
        this.login = login;
        this.password = password;
        this.date_added = date_added;
    }

    public User(String login, String password){
        this.login = login;
        this.password = password;
        date_added = LocalDateTime.now();


    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", date_added=" + date_added +
                '}';
    }
}

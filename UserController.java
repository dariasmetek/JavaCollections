package controller;
import model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;


public class UserController {
    private List<User> registered_users = new ArrayList<>();
    private Set<String> registered_logins = new HashSet<>();

    public boolean addUser(String login, String password) {
        if (registered_logins.contains(login)) {
            System.out.println("Login: " + login + " istnieje w bazie");
            return false;
        }
        User u = new User(login, password);
        registered_users.add(u);
        registered_logins.add(login);
        System.out.println("Zarejestrowano uzytkownika");
        return true;
    }

    public boolean deleteUser(String login_delete) {
        for (int i = 0; i < registered_users.size(); i++) {
            if (registered_users.get(i).getLogin().equals(login_delete)) {
                registered_users.remove(registered_users.get(i));
                registered_logins.remove(login_delete);
                System.out.println("Usunieto uzytkownika: " + login_delete);
                return true;
            }
        }
        System.out.println("Nie ma takiego uzytkownika: " + login_delete);
        return false;
    }
    public boolean passwordCheck(String newPassword){
        //dlugosc hasla co najmniej 6 znakow
        String template = ".{6,32}";
        //musi byc przynajmniej jedna cyfra
        String template1 = ".*[A-Z]+.*";
        return Pattern.matches(template, newPassword) && Pattern.matches(template1,newPassword) && Pattern.matches(template, newPassword);
    }

    public boolean changePassword(String login, String oldPassword, String newPassword1, String newPassword2){
        for (int i = 0; i < registered_users.size(); i++) {
            //szukamy usera po loginie

            if (registered_users.get(i).getLogin().equals(login)) {
                //sprawdzamy podobienstwo hasel
                if (newPassword1.equals(newPassword2) && !newPassword1.equals(oldPassword)) {
                    //sprawdzamy poprawnosc nowego hasla
                    if (passwordCheck(newPassword1)) {
                        registered_users.get(i).setPassword(newPassword1);
                        System.out.println("Haslo zostalo zmienione");
                        return true;
                    }
                    System.out.println("Podane hasla sa rozne lub takie same jak stare haslo");
                    return false;
                }
            }
            System.out.println("Nie ma takiego uzytkownika: " + login + "lub stare haslo jest bledne");
            return false;
        }
    }
        public void showUsers(){
            registered_users.forEach(user -> System.out.println(user));
        }

    }


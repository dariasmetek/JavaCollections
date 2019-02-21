import controller.UserController;

public class MainUser {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("mk", "mk");
        uc.addUser("av", "av");
        uc.addUser("uy", "uy");
        uc.addUser("nn", "nn");
        uc.deleteUser("ssss");
        uc.deleteUser("mk");
        uc.changePassword("mk", "mk", "nowe", "nowe");
        uc.changePassword("av", "av", "haslo", "haslo");
        uc.showUsers();



    }

}

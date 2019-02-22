import controller.MessageController;

import java.util.Scanner;

public class MainMessage {
    public static void main(String[] args) {
        MessageController mc = new MessageController();
        System.out.println("Twoja poczta glosowa");
        System.out.println("Masz"+ mc.getSize() +" nowych wiadomosci");
        System.out.println("1. Odczytaj wiadomosc \n2. Usun wiadomosc \n3. Dodaj wiadomosc");
        Scanner sc = new Scanner(System.in);
        int decision = -1;

             decision = sc.nextInt();
             switch (decision){
                 case 1:
                     mc.getMessage();
                     break;
                 case 2:
                     mc.deleteMessage();
                     break;
                 case 3:
                     System.out.println("Podaj adresata");
                     String author = sc.nextLine();
                     System.out.println("Podaj tresc wiadomosci");
                     String content = sc.nextLine();
                     mc.addMessage(content, author);
                     System.out.println("Zapisano wiadomosc");
                     break;
                 case 0:
                     System.out.println("Dziekuje!");
                     break;
                 default:
                     break;
             }
    }
}

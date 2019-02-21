import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainTest {
    public static void main(String[] args) {
        System.out.println("JCollections");
        //utworzenie pustej listy
        List<String> fruits = new ArrayList<>();
        //sprawdzenie rozmiaru listy
        System.out.println("Rozmiar listy: " + fruits.size());
        //dodawanie do listy
        fruits.add("Jablko");
        fruits.add("Gruszka");
        fruits.add("Pomidor");
        fruits.add("Ogorek");
        fruits.add("Mandarynka");
        //dodawanie elementow na dowolnym indexie
        fruits.add(1,"Mango");
        //fruits.add(10,"Mango"); --blad
        //wypisanie zawartosci tablicy
        System.out.println(fruits);
        //wyrazenie lambda
        System.out.println("Lambda");
        fruits.forEach(f -> System.out.println(f));
        //to samo
        System.out.println("For each");
        for (String f : fruits){
            System.out.println(f);
        }
        //modyfikacja wartosci w liscie
        fruits.set(1,"Kaka");
        //odczytanie wartosci na podanym indexie
        System.out.println(fruits.get(1));
        System.out.println(fruits);
        //usuwanie wartosci
        fruits.remove("Gruszka");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.get(0));

        //Inicjalizacja listy wartosciami poczatkowymi
        List<String> brands = new ArrayList<>(Arrays.asList("BMW", "Audi", "VW", "Toyota"));
        brands.add("Porsche");
        System.out.println(brands);

    }

}

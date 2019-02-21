import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        //Deklaracja zbioru
        Set<String> pesels = new HashSet<>();
        Set<String> pesels_bydgoszcz = new HashSet<>(Arrays.asList("2222","3333", "2345", "4567"));
        //dodawanie wartosci do zbioru"
        System.out.println("Dodano: " + pesels.add("1234"));
        System.out.println("Dodano: " + pesels.add("2345"));
        System.out.println("Dodano: " + pesels.add("3456"));
        System.out.println("Dodano: " + pesels.add("4567"));
        System.out.println("Dodano: " + pesels.add("1234"));
        System.out.println(pesels);
        //sprawdzenie przynaleznosci do zbioru
        System.out.println("Przynalezy: " + pesels.contains("1234"));
        System.out.println("Przynalezy: " + pesels.contains("6666"));
        //usuniecie wartosci ze zbioru
        pesels.remove("1234");
        System.out.println(pesels);
        //suma zbiorow
        Set<String> temp = new HashSet<>();
        temp.addAll(pesels);
        temp.addAll(pesels_bydgoszcz);
        System.out.println("Po sumowaniu: " + pesels + "+" + pesels_bydgoszcz + "=" + temp);

        //roznica zbiorow
        temp.clear();
        temp.addAll(pesels);
        temp.removeAll(pesels_bydgoszcz);
        System.out.println("Po roznicy: " + pesels + "-" + pesels_bydgoszcz + "=" + temp);
        //czesc wspolna
        temp.clear();
        temp.addAll(pesels);
        temp.retainAll(pesels_bydgoszcz);
        System.out.println("Po czesci wspolnej: " + pesels + " x " + pesels_bydgoszcz + "=" + temp);
    }
}
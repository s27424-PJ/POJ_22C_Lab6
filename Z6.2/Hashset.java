import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> zbior = new HashSet<>();

        zbior.add("Red");
        zbior.add("Green");
        zbior.add("Black");
        zbior.add("Pink");
        zbior.add("Orange");

        System.out.println("Zawartość zbioru: " + zbior);

        String[] tablica = zbior.toArray(new String[zbior.size()]);
        
        System.out.println("Zawartość tablicy: ");
        for (String element : tablica) {
            System.out.println(element);
        }
    }
}

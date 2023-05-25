import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "Styczeń");
        months.put(2, "Luty");
        months.put(3, "Marzec");
        months.put(4, "Kwiecień");
        months.put(5, "Maj");
        months.put(6, "Czerwiec");
        months.put(7, "Lipiec");
        months.put(8, "Sierpień");
        months.put(9, "Wrzesień");
        months.put(10, "Październik");
        months.put(11, "Listopad");
        months.put(12, "Grudzień");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca (1-12): ");
        int numerMiesiaca = scanner.nextInt();


        if (numerMiesiaca >= 1 && numerMiesiaca <= 12) {
            String nazwaMiesiaca = months.get(numerMiesiaca);
            System.out.println("Miesiąc o numerze " + numerMiesiaca + " to " + nazwaMiesiaca + ".");
        } else {
            System.out.println("Podano niepoprawny numer miesiąca.");
        }
    }
}

import java.util.LinkedList;

public class Lista {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Red");
        lista.add("Green");
        lista.add("Black");
        lista.add("Pink");
        lista.add("Orange");

        System.out.println("The Original linked list:: " + lista);

        String pierwszy = lista.removeFirst();
        String ostatni = lista.removeLast();

        System.out.println("Elements removed: " + pierwszy + ", " + ostatni);


        System.out.println("The New linked list: " + lista);
    }
}

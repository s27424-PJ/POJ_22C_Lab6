import java.util.Iterator;
import java.util.TreeSet;

public class Trees {
    public static void main(String[] args) {
        // a
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Red");
        tree1.add("Green");
        tree1.add("Blue");
        tree1.add("Yellow");
        tree1.add("Purple");

        // b
        System.out.println("Elementy drzewa tree1:");
        Iterator<String> iterator = tree1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Orange");
        tree2.add("Pink");
        tree2.add("Brown");


        System.out.println("Elementy drzewa tree2:");
        for (String element : tree2) {
            System.out.println(element);
        }


        tree1.addAll(tree2);

        System.out.println("Elementy drzewa tree1 po dodaniu elementów z tree2:");
        for (String element : tree1) {
            System.out.println(element);
        }

        // d
        System.out.println("Elementy drzewa tree1 w odwrotnej kolejności:");
        Iterator<String> reverseIterator = tree1.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // e
        String firstElement = tree1.first();
        String lastElement = tree1.last();
        System.out.println("Pierwszy element drzewa tree1: " + firstElement);
        System.out.println("Ostatni element drzewa tree1: " + lastElement);

        // f
        TreeSet<String> tree3 = (TreeSet<String>) tree1.clone();

        // g
        System.out.println("Liczba elementów w drzewie tree1: " + tree1.size());
        System.out.println("Liczba elementów w drzewie tree3: " + tree3.size());

        // h
        boolean areEqual = tree1.equals(tree2);
        System.out.println("Czy drzewa tree1 i tree2 są równe? " + areEqual);
    }
}

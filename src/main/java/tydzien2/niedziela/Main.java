package tydzien2.niedziela;

import java.util.ArrayList;
//import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(5);
        list.add(10);
        list.add("text");
        list.add(java.time.LocalDateTime.of(2018,11,11,11,11));

        System.out.println("Tablica ma: " + list.size() + " elementow");
        System.out.printf("tablica ma %s elementow%n", list.size());
        System.out.println(String.format("tablica ma %s elementow", list.size()));

        ArrayList<String> listOfString = new ArrayList<String>();
        listOfString.add("Jan kowalski");
        listOfString.add("janina kowalska");
        listOfString.add("tomasz kot");
        listOfString.add("zbigniew zientarski");

        for (int i = 0; i < listOfString.size(); i++)
        {
            System.out.println(listOfString.get(i));
        }

        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("John wick", "thinking in java"));
        for (int i = 0; i < listOfBooks.size(); i++)
        {
            System.out.println(listOfBooks.get(i));
        }

    }
}

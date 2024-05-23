import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> BookList = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("_______________");
            System.out.println("1. Ivesti Knygos Pavadinima ");
            System.out.println("2. Knygu Saraso Atvaizdavimas");
            System.out.println("3. Knygu Saraso Redagavimas");
            System.out.println("4  Knygu Saraso Istrinimas");
            System.out.println("5. Isejimas is Programos");
            System.out.println("_______________");
            System.out.println();
            int item = sc.nextInt();
            sc.nextLine();
            switch (item) {
                case 1:
                    System.out.println("Parasykite Knygos Pavadinima");
                    String input = sc.nextLine();
                    BookList.add(input);
                    break;
                case 2:
                    for (int i = 0; i < BookList.size(); i++) {
                        System.out.println(BookList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Iveskite Kuria Knyga Norite Pakeisti");
                    String SenaKnyga = sc.nextLine();
                    if (BookList.contains(SenaKnyga)) {
                        System.out.println("Nauja Knyga");
                        String NaujaKnyga = sc.nextLine();
                        int index = BookList.indexOf(SenaKnyga);
                        BookList.set(index, NaujaKnyga);
                    }
                    break;
                case 4:
                    System.out.println("Iveskite Knyga Kuria Norite Istrinti");
                    String BookName = sc.nextLine();
                    if (BookList.contains(BookName)) {
                        System.out.println("Knyga Istrinta");
                        String IstrintaKnyga = sc.nextLine();
                        BookList.remove(IstrintaKnyga);
                        int index = BookList.indexOf(BookName);
                        BookList.set(index, IstrintaKnyga);
                    }else {
                        System.out.println("Knygos Pavadinimo Sarase Nera");
                    }
                    break;
                case 5:
                    System.exit(0);


            }
        }
































    }
}
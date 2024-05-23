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
            System.out.println("2. Knygu Atvaizdavimas");
            System.out.println("3. Prekiu Redagavimas");
            System.out.println("4  Prekiu Istrinimas");
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
            }
        }
































    }
}
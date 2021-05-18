package application;

import java.util.Locale;
import java.util.Scanner;

import util.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product[] vect = new Product[10];

        System.out.printf("How many rooms will be rented?: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("Rent #" + i);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int Room = sc.nextInt();

            vect[Room] = new Product(name, email);

        }

            System.out.print("Busy Rooms: ");
            for (int i = 0; i < 10; i++){
                if (vect[i] != null){
                    System.out.println(i + ": " + vect[i]);
                }
            }

        sc.close();
    }
}

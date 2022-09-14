package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();

        Product[] products = new Product[quantity];
        double sum = 0.0;

        for(int i = 0; i < products.length; i++){
            System.out.print("Enter product name: ");
            String name = sc.next();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
            sum += products[i].getPrice();
        }

        double averagePrice = sum / quantity;

        System.out.println();
        System.out.printf("AVERAGE PRICE = %.2f%n", averagePrice);

        sc.close();
    }
}

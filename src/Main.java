import Product.*;
import java.util.*;
import Client.*;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer, name, gender, country, address, size, color;
        byte age;
        float budget;

        while (true) {
            System.out.printf("Welcome To our store !!\n");
            System.out.println("Do u want to order ? (write yes or no)");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("no"))
                System.exit(0);

            System.out.printf("Great !! These is our product and their prices, take a look at them : \n");
            System.out.println("1 - T-shirt : 2000 DA");
            System.out.println("2 - Jacket : 4999 DA");
            System.out.println("What dou you want to buy ?");
            answer = scanner.nextLine();

            switch (answer) {
                case "T-shirt" :
                    String orderOne = "T-shirt";

                    System.out.println("Very Well !! now to make your order you need to give us some informations about you.");
                    System.out.printf("Your name : ");
                    name = scanner.next();
                    System.out.printf("Your age : ");
                    age = scanner.nextByte();
                    System.out.printf("Your gender : ");
                    gender = scanner.next();
                    System.out.printf("Your size : ");
                    size = scanner.next();
                    System.out.printf("color : ");
                    color = scanner.next();
                    System.out.printf("Your country : ");
                    country = scanner.next();
                    System.out.printf("Your address : ");
                    address = scanner.next();
                    System.out.printf("Your budget : ");
                    budget = scanner.nextFloat();
                    System.out.printf("\n");

                    if (gender.equalsIgnoreCase("null")) {
                        Customer customerOne = new Customer(name, age, country, budget, address, orderOne, size);
                        Tshirt tshirt = new Tshirt(size, color, gender);
                        Buy customerBuyOne = new Buy(customerOne, tshirt);
                        customerBuyOne.showOrderStatus();
                    } else {
                        Customer customerOne = new Customer(name, gender, age, country, budget, address, orderOne, size);
                        Tshirt tshirt = new Tshirt(size, color, gender);
                        Buy customerBuyOne = new Buy(customerOne, tshirt);
                        customerBuyOne.showOrderStatus();
                    }

                    System.out.println("Thx, your order will arrive to you soon as possible");
                    System.exit(0);
                    scanner.close();
                    break;

                case "Jacket" :
                    String orderTwo = "Jacket";

                    System.out.println("Very Well !! now to make your order you need to give us some informations about you.");
                    System.out.printf("Your name : ");
                    name = scanner.next();
                    System.out.printf("Your age : ");
                    age = scanner.nextByte();
                    System.out.printf("Your gender : ");
                    gender = scanner.next();
                    System.out.printf("Your size : ");
                    size = scanner.next();
                    System.out.printf("color : ");
                    color = scanner.next();
                    System.out.printf("Your country : ");
                    country = scanner.next();
                    System.out.printf("Your address : ");
                    address = scanner.next();
                    System.out.printf("Your budget : ");
                    budget = scanner.nextFloat();
                    System.out.printf("\n");

                    Customer customerTwo = new Customer(name, gender, age, country, budget, address, orderTwo, size);
                    Jacket jacket = new Jacket(size, color, gender);
                    Buy customerBuyTwo = new Buy(customerTwo, jacket);
                    customerBuyTwo.showOrderStatus();

                    System.out.println("Thx, your order will arrive to you soon as possible");
                    System.exit(0);
                    scanner.close();
                    break;
            }
        }
    }
}
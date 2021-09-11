package GameCart;

import GameCart.GamingShoppingCart;

import java.util.Scanner;

public class Main_Two {
    private static Scanner sc = new Scanner(System.in);
    private static GamingShoppingCart gameShopCart = new GamingShoppingCart();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit){

            System.out.println("Enter an option");
            System.out.println("1 - to add a game");
            System.out.println("2 - to print the your cart");
            System.out.println("3 - to quit");
            System.out.println("4 - to find a game");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    printCart();
                    break;
                case 3:
                    System.out.println("Quitting...");
                    quit = true;
                    break;
                case 4:
                    findGames();
                    break;
            }
        }
        if (choice == 3){
            System.out.println("\nApplication closed");
        }
    }

    public static void add() {
        System.out.println("What game would you like to add your cart?: ");
        gameShopCart.addGame(sc.nextLine());
    }

    public static void printCart(){
        System.out.println("Your carts contents: ");
        gameShopCart.printGameCart();
    }

    public static void findGames() {
        System.out.println("What game would you like search for?: ");
        String item = sc.nextLine();
        if (gameShopCart.onFile(item)) {
            System.out.println("Found " + item + " is in spot " + gameShopCart.positionOfGame(item) + " in your cart");
        }else {
            System.out.println("Not found");
        }
    }
}

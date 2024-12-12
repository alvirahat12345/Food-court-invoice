
import classes.*;
import interfaces.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
//import fileio.*;
import java.io.*;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choose;
        //FileReadWriteDemo frwd = new FileReadWriteDemo();
        boolean count = true;
        //do {
            try {
                boolean flag = true;


                while (flag) {
                    System.out.println("\n\n----------------------------------------------------");
                    System.out.println("|\t\tWelcome to Burger King             |");
                    System.out.println("----------------------------------------------------\n\n");
                    System.out.println("Please Choose your desire option : \n");
                    System.out.println("\n1. Purchase Food");
                    System.out.println("\n2. Make Invoice");
                    int Choose;
                    choose = sc.nextInt();
                    PurchaseFoodAndInvoice pp = new PurchaseFoodAndInvoice();
                    switch (choose) {
                        case 1:
                            boolean flag1 = true;
                            System.out.println("\nYou have choosed Purchase Food\t : \n");
                            System.out.println("Please Enter Your Name : \n");
                            String name;
                            name = sc2.nextLine();
                            System.out.println("Hello " + name + ", what would you like to purchase?");
                            pp.purchaseFood();
                            while (flag1) {
                                System.out.println("\nDo You want to buy more foods?(y/n) ");
                                String response = sc2.nextLine();
                                if (response.equals("Yes") || response.equals("Y") || response.equals("y") || response.equals("yes")) {
                                    pp.purchaseFood();
                                } else if (response.equals("No") || response.equals("N") || response.equals("n") || response.equals("no")) {
                                    pp.show();
                                    pp.totalAmount();
                                    pp.returnAmount();
                                    flag1 = false;
                                    flag = false;

                                } else {
                                    System.out.println("Wrong Input!! Type yes/y or no/n");

                                }
                            }
                            break;
                        case 2:
                            System.out.println("\nYou have choosed Make an Invoice : \n");
                            pp.makeInvoice();
                            pp.show1();
                            System.out.println("Your invoice has been successfully made! ");
                            break;
                        default:
                            System.out.println("\nWrong Input!!Enter 1 or 2...\n");
                            continue;
                    }
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println("\nDo you want to continue?(Y/N)... \n");
                        String response1 = sc2.nextLine();
                        if (response1.equals("Yes") || response1.equals("Y") || response1.equals("y") || response1.equals("yes")) {
                            flag = true;
                            flag2 = false;
                        } else if (response1.equals("No") || response1.equals("N") || response1.equals("n") || response1.equals("no")) {
                            System.out.println("Exiting......");
                            System.out.println("Thank You :) \n\n\n");
                            flag2 = false;
                            flag = false;
                        } else {
                            System.out.println("\nWrong Input!! Enter yes/y or n/no...\n");
                        }
                    }
                }
                //count = false;
            }catch(Exception e){
                System.out.println("You have entered a wrong input,Please enter valid input.");
                System.out.println("Your Exception type is ::: " + e);
                System.out.println("Taking back to main menu");
            }
      //  }while (count == true);
    }

}
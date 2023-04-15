/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henry
 */
import java.util.Scanner;
public class Menu {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("1. Chapo & Beans");
        System.out.println("2. Ugali & Omena");
        System.out.println("3. Ugali & Beef");
        System.out.println("4. Matoke & Beef");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        
        switch (choice) {
            case 1 -> System.out.println("You have selcted Chapo & Beans @ KSH.100");
            case 2 -> System.out.println("You have selected Ugali & Omena @ KSH.80");
            case 3 -> System.out.println("You have selected Ugali & Beef @ KSH.150");
            case 4 -> System.out.println("You have selected Matoke & Beef @ KSH.100");
            default -> System.out.println("Invalid Choice!");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author namaz
 */
public class MenuUtil {

    public static void showMenu() {

        System.out.println("Please select menu!");
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        int selectedMenuNumber = sc.nextInt();

        Menu selectedMenu = Menu.find(selectedMenuNumber);

        selectedMenu.process();
    }
}

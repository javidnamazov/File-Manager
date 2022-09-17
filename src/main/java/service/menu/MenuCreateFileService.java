/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.inter.menu.MenuCreateFileServiceInter;

/**
 *
 * @author namaz
 */
public class MenuCreateFileService implements MenuCreateFileServiceInter {

    @Override
    public void process() {

        System.out.println("Please enter the folder path(note:as file name excluded): ");
        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();

        System.out.println("Please enter the file name: ");
        Scanner sc2 = new Scanner(System.in);
        String fileName = sc.nextLine();

        File myObj = new File(dir + "\\" + fileName);
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

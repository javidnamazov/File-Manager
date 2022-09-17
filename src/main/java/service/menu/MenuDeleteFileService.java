/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import java.io.File;
import java.util.Scanner;
import service.inter.menu.MenuDeleteFileServiceInter;

/**
 *
 * @author namaz
 */
public class MenuDeleteFileService implements MenuDeleteFileServiceInter {

    @Override
    public void process() {
        
        System.out.println("Please enter the folder path(note:as file name excluded): ");
        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();
        File file = new File(dir);

        System.out.println("Please enter the file name: ");
        Scanner sc2 = new Scanner(System.in);
        String fileName = sc2.nextLine();

        File currentFile = new File(file.getPath(), fileName);
        currentFile.delete();

    }

}

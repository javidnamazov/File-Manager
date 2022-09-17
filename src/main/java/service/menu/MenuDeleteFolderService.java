/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import java.io.File;
import java.util.Scanner;
import main.MyUncaughtExceptionHandler;
import service.inter.menu.MenuDeleteFolderServiceInter;

/**
 *
 * @author namaz
 */
public class MenuDeleteFolderService implements MenuDeleteFolderServiceInter {

    @Override
    public void process() {
        
        System.out.println("Please enter the path to delete last folder: ");

        Scanner sc = new Scanner(System.in);
        String folderPath = sc.nextLine();

        File file = new File(folderPath);

        String[] entries = file.list();
        for (String s : entries) {
            File currentFile = new File(file.getPath(), s);
            currentFile.delete();
        }

        if (file.exists()) {
            file.delete();
            System.out.println("Folder and including files have been deleted successfully!\n");
        } else {
            System.out.println("File does not exist");
        }
    }
}

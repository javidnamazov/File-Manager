/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import java.io.File;
import java.util.Scanner;
import service.inter.menu.MenuCreateFolderServiceInter;

/**
 *
 * @author namaz
 */
public class MenuCreateFolderService implements MenuCreateFolderServiceInter {

    @Override
    public void process() {
        
        String path1 = "C:\\Workspace\\File Manager\\Folder 1\\Folder 1.1\\Folder 1.1.1";
        String path2 = "C:\\Workspace\\File Manager\\Folder 1\\Folder 1.2";
        String path3 = "C:\\Workspace\\File Manager\\Folder 1\\Folder 1.3\\1.3.1";
        String path4 = "C:\\Workspace\\File Manager\\Folder 2\\Folder 2.1\\Folder 2.1.1";

        System.out.println("Please enter the path to create folders: ");
        System.out.println("*Hint* Copy the path to create folders by default [1st path] - " + path1);
        System.out.println("*Hint* Copy the path to create folders by default [2nd path] - " + path2);
        System.out.println("*Hint* Copy the path to create folders by default [3rd path] - " + path3);
        System.out.println("*Hint* Copy the path to create folders by default [4th path] - " + path4);
        
        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();

        File file = new File(dir);

        if (file.mkdirs()) {
            System.out.println("New directory is created!\n");
        }
    }
}

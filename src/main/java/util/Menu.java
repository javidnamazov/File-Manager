/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.logging.Level;
import java.util.logging.Logger;
import main.MyUncaughtExceptionHandler;
import service.inter.*;
import service.menu.*;
import util.*;

/**
 *
 * @author namaz
 */
public enum Menu {

    CREATE_FOLDER(1, "Create Folder", new MenuCreateFolderService()),
    DELETE_FOLDER(2, "Delete Folder", new MenuDeleteFolderService()),
    CREATE_FILE(3, "Create File", new MenuCreateFileService()),
    DELETE_FILE(4, "Delete File", new MenuDeleteFileService()),
    UNKNOWN;

    private int number;
    private String label;
    private Processable service;

    Menu() {
    }

    Menu(int number, String label, Processable service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != Menu.UNKNOWN) {
                System.out.println(menus[i]);
            }
        }
        System.out.println("0.Exit");
    }

    public static Menu find(int number) throws NullPointerException{
        
        if (number==0) {
            System.out.println("System will be turned off in 3 seconds!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            return null;
        }
        
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        System.out.println("Please enter a valid number!\n");
        try{
            return Menu.UNKNOWN;
        }finally{
            MenuUtil.showMenu();
        }
    }
}

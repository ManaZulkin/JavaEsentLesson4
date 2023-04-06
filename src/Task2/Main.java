package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String file, fileTipe;
        System.out.println("Enter full name of file");
        file = in.next();
        fileTipe = file.substring(file.length()-3);
        System.out.println("This file has tipe " + fileTipe);
        switch (fileTipe){
            case "txt" , "TXT": {
                TXTHandler newFile = new TXTHandler();
                System.out.println("You can do next operetion");
                newFile.create();
                newFile.open();
                newFile.change();
                newFile.create();
                break;
            }
            case "xml" , "XML": {
                XMLHandler newFile = new XMLHandler();
                System.out.println("You can do next operetion");
                newFile.create();
                newFile.open();
                newFile.change();
                newFile.create();
                break;
            }
            case "doc" , "DOC": {
                DOCHandler newFile = new DOCHandler();
                System.out.println("You can do next operetion");
                newFile.create();
                newFile.open();
                newFile.change();
                newFile.create();
                break;
            }
        }
    }
}

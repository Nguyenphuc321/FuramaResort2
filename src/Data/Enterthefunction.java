package Data;

import java.util.Scanner;

public class Enterthefunction {
    public static Scanner sc = new Scanner(System.in);
    public static void addNewServices(){
        System.out.println("\n1.Add NewVilla" +
                "\n2. Add new House" +
                "\n3.Add new Room" +
                "\n4:Back to menu" +
                "\n5:Exit" +
                "\n Please select one function below: ");

        switch (sc.nextInt()){
            case 1:
                addnewVilla();
                break;
            case 2:
                addnewHouse();
                break;
            case 3:
                addnewRoom();
                break;
            case 4:
                displayMainMenu();
                System.out.println("=================");
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Erro.back to menu");
                backMainMenu();
        }
    }
    public static void addnewVilla(){}
    public static void addnewHouse(){}
    public static void addnewRoom(){}
    public static void displayMainMenu(){}
    public static void backMainMenu(){}
}

package Model;

import java.util.Scanner;
import java.util.UUID;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu(){
        sc = new Scanner(System.in);
        System.out.println("\n1.Add NewServices" +
                "\n2. Show Services" +
                "\n3.Exit" +
                "\n Please select one function below: ");
        switch (sc.nextInt()){
            case 1:
                addNewServices();
            case 2:
                showServices();
            case 3:
               System.exit(0);
            default:
                System.out.println("Erro.back to menu");
                backMainMenu();
        }
    }
    private static void backMainMenu(){
        System.out.println("\n enter to continue");
        sc.nextLine();
        System.out.println("\n------------------");
        displayMainMenu();
    }
    private static void addNewServices(){
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
    private static void showServices(){

    }
    private static void addnewVilla(){
        Services villa = new Villa();
        System.out.println("nhập vào id");
        villa.setId(UUID.randomUUID().toString().replace("--","---"));
        System.out.println("nhập tên dich vụ");
        villa.setNameServices(sc.nextLine());
        System.out.println("diện tích sử dụng");
        villa.setAreaused(sc.nextFloat());
        System.out.println("nhập chi phí thuê");
        villa.setRentalcosts(sc.nextFloat());
        System.out.println("nhập số người thuê");
        villa.setAmountofpeople(sc.nextInt());
        System.out.println("nhập vào kiểu thuê");
        villa.setTypeofrent(sc.nextLine());
        System.out.println("nhập vào tiêu chuẩn phòng");
        ((Villa)villa).setRoomstandard(sc.nextLine());
        System.out.println("nhập mô tả tiện nghi");
        ((Villa)villa).setComfortdescription(sc.nextLine());
        System.out.println("nhập sô tầng");
        ((Villa)villa).setNumberoffloors(sc.nextInt());
        System.out.println("nhập diện tích hồ bơi");
        ((Villa)villa).setPoolarea(sc.nextFloat());
        System.out.println(villa.showInfor());
    }
    private static void addnewHouse(){
        Services house = new House();
        Services villa = new Villa();
        System.out.println("nhập vào id");
        house.setId(UUID.randomUUID().toString().replace("--","---"));
        System.out.println("nhập tên dich vụ");
        house.setNameServices(sc.nextLine());
        System.out.println("diện tích sử dụng");
        house.setAreaused(sc.nextFloat());
        System.out.println("nhập chi phí thuê");
        house.setRentalcosts(sc.nextFloat());
        System.out.println("nhập số người thuê");
        house.setAmountofpeople(sc.nextInt());
        System.out.println("nhập vào kiểu thuê");
        house.setTypeofrent(sc.nextLine());
        System.out.println("nhập vào tiêu chuẩn phòng");
        ((House)house).setRoomstandard(sc.nextLine());
        System.out.println("nhập mô tả tiện nghi");
        ((House)house).setComfortdescription(sc.nextLine());
        System.out.println("nhập sô tầng");
        ((House)house).setNumberoffloors(sc.nextInt());
        System.out.println(house.showInfor());
    }
    private static void addnewRoom(){
        Room room = new Room();
        System.out.println("nhập vào id");
        room.setId(UUID.randomUUID().toString().replace("--","---"));
        System.out.println("nhập tên dich vụ");
        room.setNameServices(sc.nextLine());
        System.out.println("diện tích sử dụng");
        room.setAreaused(sc.nextFloat());
        System.out.println("nhập chi phí thuê");
        room.setRentalcosts(sc.nextFloat());
        System.out.println("nhập số người thuê");
        room.setAmountofpeople(sc.nextInt());
        System.out.println("nhập vào kiểu thuê");
        room.setTypeofrent(sc.nextLine());
        System.out.println("nhập dịch vụ miễn phí đi kèm");
        ((Room)room).setFreeserviceincluded(sc.nextLine());
        System.out.println(room.showInfor());
    }
}

package Views;

import java.util.Scanner;

public class Checkinputdata {
    public static void main(String[] args) {
         String NameServices,typeofrent,Roomstandard;
         float Areaused,Poolarea;
        float  rentalcosts;
        int amountofpeople;
        int Numberoffloors;
        String  Freeserviceincluded="massage, karaoke, food, drink, car";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập diện tích mà bạn muốn sử dụng ");
        Areaused = scanner.nextFloat();
        if (Areaused>30){
            System.out.println(Areaused+"bạn đã nhập đúng số cần tìm");
        }else {
            System.out.println(Areaused+"bạn đã nhập sai vui lòng nhập lai");
        }
        System.out.println("nhập tích hồ bơi bạn muốn sử dụng");
        Poolarea = scanner.nextFloat();
        if (Poolarea>30){
            System.out.println(Poolarea+"bạn đã nhập đúng,cảm ơn");
        }else {
            System.out.println(Poolarea+"bạn đã nhập sai vui lòng nhập lại");
        }
        scanner.nextLine();
        System.out.println("nhập số tiền mà bạn muốn thuê");
        rentalcosts = scanner.nextFloat();

        if (rentalcosts>0){
            System.out.println(rentalcosts+"bạn đã nhập đúng");
        }else {
            System.out.println(rentalcosts+"bạn đã nhập sai vui lòng nhập lại");
        }
        System.out.println("mời bạn nhập số người thuê");
        amountofpeople = scanner.nextInt();
        if (amountofpeople>0||amountofpeople<20){
            System.out.println(amountofpeople+"bạn đã nhập đúng");
        }else {
            System.out.println(amountofpeople+"bạn đã nhập sai vui lòng nhập lại");
        }
        scanner.nextLine();
        System.out.println("mời bạn nhập dịch vụ miễn phí đi kèm");
        Freeserviceincluded = scanner.nextLine();
        if (Freeserviceincluded=="massage, karaoke, food, drink, car"){
            System.out.println(Freeserviceincluded+"bạn đã nhập đúng");
        }else {
            System.out.println("bạn đã nhập sai vui lòng nhập lại");
        }
        scanner.nextLine();
        System.out.println("mời bạn nhập số tầng");
        Numberoffloors = scanner.nextInt();
        if (Numberoffloors>0){
            System.out.println(Numberoffloors+"bạn đã nhập đúng số tầng");
        }else {
            System.out.println(Numberoffloors+"bạn đã nhập sai vui lòng nhập lại");
        }
        scanner.nextLine();
        System.out.println("mời bạn nhập tiêu chuẩn phòng");
        typeofrent = scanner.nextLine();
        if (){
            System.out.println(typeofrent+"bạn đã nhập đúng");
        }else {
            System.out.println(typeofrent+"bạn đã nhập sai");
        }



















    }
}

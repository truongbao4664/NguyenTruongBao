
package baitap1sao;
import java.util.Scanner;

public class BAT1 {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Nhap ten: ");
        String ten = scanner.nextLine();
        
        System.out.println("Nhap tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Nhap gioi tinh: ");
        String gioiTinh = scanner.nextLine();
        
        System.out.println("Nhap chuyen nganh: ");
        String chuyenNganh = scanner.nextLine();
        
        System.out.println("Nhap GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Nhap que quan: ");
        String queQuan = scanner.nextLine();
        
        
        System.out.println("\n Thong tin da nhap: ");
        System.out.println("Ten: " + ten);
        System.out.println("tuoi : " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Chuyen nganh: " + chuyenNganh);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + queQuan);
    }
    
}

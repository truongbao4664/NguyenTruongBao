package baitap1sao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Baitap1sao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        Date ngaySinh = null;
        try {
            ngaySinh = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Ngày sinh không hợp lệ!");
            return;
        }

        System.out.print("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Nhập chuyên ngành: ");
        String chuyenNganh = scanner.nextLine();

        System.out.print("Nhập GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập quê quán: ");
        String queQuan = scanner.nextLine();

        System.out.println("\nThông tin đã nhập:");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Ngày sinh: " + sdf.format(ngaySinh));
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Chuyên ngành: " + chuyenNganh);
        System.out.println("GPA: " + gpa);
        System.out.println("Quê quán: " + queQuan);

        scanner.close();
    }
}

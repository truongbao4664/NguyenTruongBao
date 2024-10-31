package baitap1sao;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        if (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("Bạn đã nhập chuỗi: " + input);
        } else {
            System.out.println("Không phải chuỗi.");
        }

        scanner.close();
    }
}

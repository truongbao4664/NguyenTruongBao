package baitap1sao;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            System.out.println("Bạn đã nhập số nguyên: " + input);
        } else {
            System.out.println("Không phải số nguyên.");
        }

        scanner.close();
    }
}

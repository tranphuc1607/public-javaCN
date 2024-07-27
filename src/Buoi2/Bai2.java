package Buoi2;

import java.util.Scanner;
import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("nhập vào số phần tử của mảng số nguyên : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("/n");
        System.out.print("nhập phần tử của mảng ");
        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr.add(arrItem);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 != 0) {
                int newItem = arr.get(i) + Math.abs(((i + 1 == n) ? 0 : arr.get(i + 1)) - arr.get(i - 1));
                arr.set(i,newItem);
            }
            System.out.print(arr.get(i) + " ");
        }
        scanner.close();
    }
}

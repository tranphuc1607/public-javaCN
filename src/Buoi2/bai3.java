package Buoi2;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        int sum = 1;
        System.out.print("nhập n của ma trận NxN : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int left = 0, right = n - 1,top = 0,bottom = n - 1;
        while(left <= right && top <= bottom) {
            for(int i = left ; i <= right ; i++) {
                arr[top][i] = sum++;
            }
            top++;
            for(int i = top ; i <= bottom ; i++) {
                arr[i][right] = sum++;
            }
            right--;
            for(int i = right ; i >= left ; i--) {
                arr[bottom][i] = sum++;
            }
            bottom--;
            for(int i = bottom ; i >= top ; i--) {
                arr[i][left] = sum++;
            }
            left++;
        }
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
        scanner.close();
    }

}

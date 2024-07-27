package Buoi2;
import java.util.Scanner;


public class Bai1 {
    private float chuVi(float r,float PI) {
        return 2*PI*r;
    }
    private float dienTich(float r,float PI) {
        return PI*(float)Math.pow(r,2);
    }
    public static void main(String[] args) {
        System.out.print("nhập vào bán kính hình tròn : ");
        Scanner scanner = new Scanner(System.in);
        float r = scanner.nextFloat();
        float PI = 3.14f;
        Bai1 bai1 = new Bai1();
        System.out.printf("chu vi của hình trong là %.3f , diện tích hình tròn là : %.3f ",bai1.chuVi(r, PI),bai1.dienTich(r,PI));
        scanner.close();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author KyThuat88
 */
public class Test {
    public static void main(String[] args) {
        Employee[] arr=new Employee[3];
        System.out.println("Nhập thông tin boss");
        arr[0]=new Boss();
        arr[0].nhap();
        System.out.println("Nhập thông tin PieceWorked ");
        arr[1]=new PieceWorker();
        arr[1].nhap();
        System.out.println("Nhập thông tin CommisstionWorked ");
        arr[2]=new CommisionWorker();
        arr[2].nhap();
        System.out.println("Thông tin boss");
        arr[0].display();
        System.out.println("Thông tin PieceWorked");
        arr[1].display();
        System.out.println("Thông tin CommisstionWorked");
        arr[2].display();
    }
}

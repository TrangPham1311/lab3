/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public abstract class Employee {
    private String name;
    private float luong;
    public abstract float earnings();
    public abstract void hienthi();

    public Employee(String name, float luong) {
        this.name = name;
        this.luong = luong;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên:  ");
        name=sc.nextLine();
        earnings();
    }
    
    
    public void display() {
       System.out.println("Name :"+name);
       hienthi();
    }
}

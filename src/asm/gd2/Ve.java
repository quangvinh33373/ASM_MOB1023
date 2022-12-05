/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm.gd2;

import java.io.Serializable;

/**
 *
 * @author nguye
 */
public class Ve implements Serializable{

    /**
     * @param args the command line arguments
     */


int soluong;
String hoten,namsinh,tenphim,gioxem,loaive,gioitinh,sdt;
    public int giave(String loaive){
    switch (loaive) {
        case "Học Sinh":
            return 45*soluong;
        case "Sinh Viên":
            return 55*soluong;
        default:
            return 65*soluong;
    }
    }
   
    public Ve() {
    }

    public int tuoi(){
        return 2022-Integer.parseInt(namsinh);
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public String getGioxem() {
        return gioxem;
    }

    public void setGioxem(String gioxem) {
        this.gioxem = gioxem;
    }

    public String getLoaive() {
        return loaive;
    }

    public void setLoaive(String loaive) {
        this.loaive = loaive;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Ve(int soluong, String hoten, String namsinh, String tenphim, String gioxem, String loaive, String gioitinh, String sdt) {
        this.soluong = soluong;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.tenphim = tenphim;
        this.gioxem = gioxem;
        this.loaive = loaive;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
    }



}

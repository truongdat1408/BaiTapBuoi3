package model;

import java.util.Scanner;

public class SinhVien {
    int maSo;
    String hoTen;
    String sdt;
    String diaChi;
    BangDiem bangDiem;

    public SinhVien() {
        if (bangDiem == null)
            bangDiem = new BangDiem(maSo);
    }

    public SinhVien(int maSo, String hoTen, String sdt, String diaChi) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.diaChi = diaChi;
        if (bangDiem == null)
            bangDiem = new BangDiem(maSo);
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- NHAP THONG TIN ---");
        // System.out.println("- Ma so: ");
        // maSo = sc.nextInt();
        // sc.nextLine();
        System.out.println("- Ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("- So dien thoai: ");
        sdt = sc.nextLine();
        System.out.println("- Dia chi: ");
        diaChi = sc.nextLine();
        bangDiem.nhapDiem();
    }

    public void inThongTin() {
        System.out.println("/////THONG TIN SINH VIEN/////");
        System.out.println("- Ma so: " + maSo);
        System.out.println("- Ho ten: " + hoTen);
        System.out.println("- So dien thoai: " + sdt);
        System.out.println("- Dia chi: " + diaChi);
        bangDiem.inBangDiem();
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}

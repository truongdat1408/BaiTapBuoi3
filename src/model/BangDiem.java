package model;

import java.util.Scanner;

public class BangDiem {
    int maSoSinhVien;
    float toan;
    float ly;
    float hoa;
    float diemTB;
    String xepLoai;

    public BangDiem() {
    }

    public BangDiem(int maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public BangDiem(int maSoSinhVien, float toan, float ly, float hoa, float diemTB, String xepLoai) {
        this.maSoSinhVien = maSoSinhVien;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.diemTB = diemTB;
        this.xepLoai = xepLoai;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Toan: ");
            toan = sc.nextFloat();
            System.out.println("Ly: ");
            ly = sc.nextFloat();
            System.out.println("Hoa: ");
            hoa = sc.nextFloat();
        } while (toan < 0 || toan > 10 || ly < 0 || ly > 10 || hoa < 0 || hoa > 10);

        diemTB = Math.round((toan + ly + hoa)*100/3)/100;
        if (diemTB < 4) {
            xepLoai = "Yeu";
        } else if (diemTB >= 4 && diemTB < 5) {
            xepLoai = "Kem";
        } else if (diemTB >= 5 && diemTB < 6.5) {
            xepLoai = "Trung binh";
        } else if (diemTB >= 6.5 && diemTB < 7 ) {
            xepLoai = "Kha";
        } else if (diemTB >= 7 && diemTB < 8.5) {
            xepLoai = "Gioi";
        } else {
            xepLoai = "Xuat sac";
        }
    }

    public void inBangDiem() {
        System.out.println("- BANG DIEM: ");
        System.out.println("\t+ Toan: " + toan);
        System.out.println("\t+ Ly: " + ly);
        System.out.println("\t+ Hoa: " + hoa);
        System.out.println("\t+ Diem trung binh: " + diemTB);
        System.out.println("\t+ Xep loai: " + xepLoai);
    }

    public int getMaSoSinhVien() {
        return maSoSinhVien;
    }

    public void setMaSoSinhVien(int maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
}

import model.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<SinhVien> danhSachSV;

    public static void main(String[] args) {
        danhSachSV = new ArrayList<>();

        byte lc;
        do {
            luaChon();
            lc = sc.nextByte();
            if (lc == 2 || lc == 1) {
                thucThiLuaChon(lc);
            }
        } while (lc != 3);
    }

    public static void luaChon() {
        System.out.println("/////// BANG LUA CHON ///////");
        System.out.println("1. Them sinh vien");
        System.out.println("2. In danh sach sinh vien");
        System.out.println("3. Ket thuc");
        System.out.print(">> ");
    }

    public static void thucThiLuaChon(byte lc) {
        switch (lc) {
            case 1:
                SinhVien sv = new SinhVien();
                sv.setMaSo(danhSachSV.size());
                sv.nhapThongTin();
                sv.inThongTin();
                danhSachSV.add(sv);
                break;
            case 2:
                for (SinhVien sinhVien : danhSachSV) {
                    sinhVien.inThongTin();
                }
        }
    }
}

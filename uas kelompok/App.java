import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.PerpusController;
import model.Buku;
import model.Peminjam;

public class App {
    
    public static void main(String[] args) throws Exception {
        PerpusController perpusController = new PerpusController();
        perpusController.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        perpusController.logIn();

        while (lanjut) {
            System.out.println("=================================================================");
            System.out.println("=                                                               =");
            System.out.println("=                SELAMAT DATANG DI PERPUSTAKAAN                 =");
            System.out.println("=                                                               =");
            System.out.println("=================================================================");

            System.out.println("Kamu Mau Nagapain Hari ini?");
            tampilkanPilihan();
            System.out.println("Memilihnya Satu-satu Yah, Jangan Rusuh!!!");
            String lilihan = reader.readLine();
            switch (lilihan) {
                case "1":
                    perpusController.clearScreen();
                    perpusController.lihatNamaBuku();
                    break;
                case "2":
                    perpusController.shopping();
                    break;
                case "3":
                    perpusController.clearScreen();
                    perpusController.lihatLaporanLalu();
                    break;
                case "0" :
                    lanjut = false;
                    perpusController.clearScreen();
                    perpusController.udhKelar();
                    break;
                default :
                    perpusController.threadSleep();
                    perpusController.clearScreen();
                    break;
            }
        }
    }

    public static void tampilkanPilihan() {
        System.out.println("1. Lihat Buku yang Tersedia");
        System.out.println("2. Meminjam Buku");
        System.out.println("3. Laporan Peminjaman");
        System.out.println("0. Keluar");
    }

}
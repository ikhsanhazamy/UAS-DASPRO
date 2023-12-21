package Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Buku;
import model.DetailPeminjaman;
import model.Peminjam;
import model.Peminjaman;

public class PerpusController {
    HashMap<String, Buku> bukus = new HashMap<>();
    ArrayList<Peminjaman> peminjamans = new ArrayList<>();
    HashMap<String, Peminjam> peminjams = new HashMap<>();
    

    public void setUp () {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        Buku buku3 = new Buku();
        Buku buku4 = new Buku();
        Buku buku5 = new Buku();
        Buku buku6 = new Buku();
        Buku buku7 = new Buku();
        Buku buku8 = new Buku();
        Buku buku9 = new Buku();
        Buku buku10 = new Buku();

        buku1.setIdBuku("01").setNamaBuku("Beauty is a Wound").setGenreBuku("NOVEL").setIsAvailable(true);
        buku2.setIdBuku("02").setNamaBuku("Sangkuriang").setGenreBuku("DONGENG").setIsAvailable(true);
        buku3.setIdBuku("03").setNamaBuku("Gus Dur").setGenreBuku("BOGRAFI").setIsAvailable(true);
        buku4.setIdBuku("04").setNamaBuku("Ronggeng Dukuh Paruk").setGenreBuku("FANTASI").setIsAvailable(true);
        buku5.setIdBuku("05").setNamaBuku("Sewu Dino").setGenreBuku("HORROR").setIsAvailable(true);
        buku6.setIdBuku("06").setNamaBuku("Sukarno: An Autobiography").setGenreBuku("MISTERI").setIsAvailable(true);
        buku7.setIdBuku("07").setNamaBuku("Ronggeng Dukuh Paruk").setGenreBuku("ROMANTIS").setIsAvailable(true);
        buku8.setIdBuku("08").setNamaBuku("Earth Dance").setGenreBuku("SEJARAH").setIsAvailable(true);
        buku9.setIdBuku("09").setNamaBuku("The Good Son").setGenreBuku("THRILLER").setIsAvailable(true);
        buku10.setIdBuku("10").setNamaBuku("Koala Kumal").setGenreBuku("KOMEDI").setIsAvailable(true);

        bukus.put(buku1.getIdBuku(), buku1);
        bukus.put(buku2.getIdBuku(), buku2);
        bukus.put(buku3.getIdBuku(), buku3);
        bukus.put(buku4.getIdBuku(), buku4);
        bukus.put(buku5.getIdBuku(), buku5);
        bukus.put(buku6.getIdBuku(), buku6);
        bukus.put(buku7.getIdBuku(), buku7);
        bukus.put(buku8.getIdBuku(), buku8);
        bukus.put(buku9.getIdBuku(), buku9);
        bukus.put(buku10.getIdBuku(), buku10);
        

        Peminjam peminjam1 = new Peminjam();
        Peminjam peminjam2 = new Peminjam();
        Peminjam peminjam3 = new Peminjam();
        peminjam1.setIdPeminjam("01").setNamaLengkap("Muhammad Eka Mandiri Sujanto").setEmail("eka220905@gmail.com").setPw("Nijisanji").setNIK("123456789");
        peminjam2.setIdPeminjam("02").setNamaLengkap("Muhammad Ikhsan Hazamy").setEmail("Ikhsanhazamy@gmail.com").setPw("Bebas").setNIK("1237050138");
        peminjam3.setIdPeminjam("03").setNamaLengkap("Muhammad Zaki Alghifari").setEmail("ghifari@gmail.com").setPw("Sempoerna").setNIK("978653421");
        peminjams.put(peminjam1.getIdPeminjam(), peminjam1);
        peminjams.put(peminjam2.getIdPeminjam(), peminjam2);
        peminjams.put(peminjam3.getIdPeminjam(), peminjam3);
    }


    public void lihatNamaBuku() throws Exception {
            for (Map.Entry<String, Buku> buku : bukus.entrySet()) {
                String key = buku.getKey();
                Buku tBuku = buku.getValue();
                if (tBuku.isIsAvailable()) {
                    System.out.println("Kode Buku \t : " + key);
                    System.out.println("Genre Buku \t : " +tBuku.getGenreBuku());
                    System.out.println("Nama Buku \t : " + tBuku.getNamaBuku());
                    System.out.println();
                }
            }

            System.out.println("========================================");
            System.out.println("=                                      =");
            System.out.println("= Tertarik?, Bisa Dipinjem Kok Bukunya =");
            System.out.println("=                                      =");
            System.out.println("========================================");
            System.out.println("1. Minjem Buku");
            System.out.println("0. Kembali");
            System.out.println("==============");
            BufferedReader choice = new BufferedReader(new InputStreamReader((System.in)));
            String next = choice.readLine();
            switch (next) {
                case "1":
                    shopping();
                    break;
                case "0" :
                    clearScreen();
                    break;
                default:
                    clearScreen();
                    threadSleep();
                    break;
            }

        }


    public Buku getBuku(String idBuku) {
        return bukus.get(idBuku);
    }

    public Peminjam getPeminjam(String idPeminjam) {
        return peminjams.get(idPeminjam);
    }

    public void shopping()  throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetailPeminjaman> tDetailPeminjamans = new ArrayList<>();
        int tambahan = 0;
        String lanjut = "";
            do {
                tambahan++;
                System.out.println();
                System.out.print("Pilih Kode Buku yang Ingin Dipinjam\t : ");
                String koBuku = input.readLine();
                System.out.print("Lihat-Lihat Lagi? (Y/N)?\t : ");
                lanjut = input.readLine();
    
                DetailPeminjaman dp = new DetailPeminjaman();
                Buku tBuku = getBuku(koBuku);
                dp.setIdDetailPeminjaman("dp" + tambahan);
                dp.setBuku(tBuku);
                tDetailPeminjamans.add(dp);
    
            } while (lanjut.equalsIgnoreCase("Y"));
            clearScreen();
            System.out.println();
            System.out.println("========================================");
            System.out.println("=                                      =");
            System.out.println("=          BUKU PINJAMAN ANDA          =");
            System.out.println("=                                      =");
            System.out.println("========================================");
            tampilkanBukuPinjaman(tDetailPeminjamans);
            System.out.println(" ");
    
            BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Konfirmasi Peminjaman? (Y/N)?");
            String konfirm = inputKonfirmasi.readLine();
    
            if (konfirm.equalsIgnoreCase("y")) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setDetailPeminjamans(tDetailPeminjamans)
                        .setIdPeminjaman("P" + (peminjamans.size() + 1))
                        .setPeminjam(getPeminjam("01"))
                        .setTanggal(LocalDate.now());
                peminjamans.add(peminjaman);
            } else {
                shopping();
            }

            threadSleep();
            clearScreen();
            tampilkanLaporanPeminjaman();
            System.out.println();

            BufferedReader inputNgulang = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Kamu Mau Minjem Buku Lagi Ngga (Y/N)??");
            String ulang = inputNgulang.readLine();

            if (ulang.equalsIgnoreCase("Y")) {
                clearScreen();
                threadSleep();
                lihatNamaBuku();
            } else {
                clearScreen();
            }

    }

    public void tampilkanBukuPinjaman(ArrayList<DetailPeminjaman> dp) {
        for (DetailPeminjaman detailPeminjaman : dp) {
            System.out.println("Kategori Buku \t :" +detailPeminjaman.getBuku().getGenreBuku());
            System.out.println("Nama Buku \t :" + detailPeminjaman.getBuku().getNamaBuku());
            System.out.println(" ");
        }
    }

    public void tampilkanLaporanPeminjaman() {
        for (Peminjaman peminjaman : peminjamans) {
            System.out.println("==================================================================");
            System.out.println("Tanggal Peminjaman \t : "+peminjaman.getTanggal());
            System.out.println("Kode Peminjaman \t : "+peminjaman.getIdPeminjaman());
            System.out.println("Nama Peminjam \t \t : "+peminjaman.getPeminjam().getNamaLengkap());
            System.out.println("NIK Peminjam \t \t : "+peminjaman.getPeminjam().getNIK());
            System.out.println("==================================================================");
            ArrayList <DetailPeminjaman> ngeliat = peminjaman.getDetailPeminjamans();
            for (DetailPeminjaman detail : ngeliat) {
            System.out.println("Kategori Buku \t \t : " +detail.getBuku().getGenreBuku());
            System.out.println("Nama Buku \t \t : " + detail.getBuku().getNamaBuku());
            System.out.println("==================================================================");
            }
        }

    }

    public void lihatLaporanLalu () throws Exception {
        for (Peminjaman peminjaman : peminjamans) {
            System.out.println("==================================================================");
            System.out.println("Tanggal Peminjaman \t : "+peminjaman.getTanggal());
            System.out.println("Kode Peminjaman \t : "+peminjaman.getIdPeminjaman());
            System.out.println("Nama Peminjam \t \t : "+peminjaman.getPeminjam().getNamaLengkap()+"=");
            System.out.println("NIK Peminjam \t \t : "+peminjaman.getPeminjam().getNIK());
            System.out.println("==================================================================");
            ArrayList <DetailPeminjaman> ngeliat = peminjaman.getDetailPeminjamans();
            for (DetailPeminjaman detail : ngeliat) {
            System.out.println("Kategori Buku \t \t : " +detail.getBuku().getGenreBuku());
            System.out.println("Nama Buku \t \t : " + detail.getBuku().getNamaBuku());
            System.out.println("==================================================================");
            }
        }

        abisLiatLaporan();
    }

    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public void threadSleep() throws InterruptedException {
        Thread.sleep(1500);
    }

    public void abisLiatLaporan () throws Exception {
        BufferedReader mauBalik = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Kembali ke Menu Utama (Y/N)?");
        String balik = mauBalik.readLine();

        if (balik.equalsIgnoreCase("Y")) {
            clearScreen();
        } else {
            clearScreen();
            lihatLaporanLalu();
        }
    }

    public void udhKelar () {
        System.out.println("=================================================================");
        System.out.println("=                                                               =");
        System.out.println("=                TERIMAKASIH ATAS WAKTU KAMU                    =");
        System.out.println("=                     DATANG LAGI YA!!!!                        =");
        System.out.println("=                                                               =");
        System.out.println("=================================================================");
    }

    public void logIn () throws Exception {

        Map<String, String> peminjams = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        peminjams.put("pengguna1", "katasandi1");
        peminjams.put("pengguna2", "katasandi2");
        peminjams.put("eka220905@gmail.com", "Nijisanji");
        peminjams.put("ikhsanhazamy@gmail.com", "Bebas");
        peminjams.put("ghifari@gamil.com", "Sempoerna");
        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader userEmail = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader pwUser = new BufferedReader(new InputStreamReader(System.in));

        boolean masuk = false;

        while (!masuk) {
        System.out.println("=================================================================");
        System.out.println("=                                                               =");
        System.out.println("=                        SELAMAT DATANG                         =");
        System.out.println("=                 SUDAHKAH ANDA MEMILIKI AKUN?                  =");
        System.out.println("=                                                               =");
        System.out.println("=================================================================");
        System.out.println("= 1. Log In                                                     =");
        System.out.println("= 2. Sign In                                                    =");
        System.out.println("= 0. Keluar                                                     ="); 
        System.out.println("=================================================================");
        String choose = choice.readLine();

            switch (choose) {
                case "1":
                    System.out.println("========================================");
                    System.out.println("=                                      =");
                    System.out.println("=             SILAHKAN MASUK           =");
                    System.out.println("=                                      =");
                    System.out.println("========================================");
                    System.out.print(" Masukkan Email Anda yang Terdaftar \t \t : ");
                    String emailUser = userEmail.readLine();
                    System.out.print(" Masukkan Password dengan Baik dan Benar \t : ");
                    String userPw = pwUser.readLine();
                    System.out.println("========================================");

                if (peminjams.containsKey(emailUser) && peminjams.get(emailUser).equals(userPw)) {
                    masuk = true;
                    clearScreen();
                } else {
                    System.out.println("Nama pengguna atau kata sandi salah. Silakan coba lagi.");
                }
                break;
                    case "2":
                    System.out.println("========================================");
                    System.out.println("=                                      =");
                    System.out.println("=           SILAHKAN DAFTAR            =");
                    System.out.println("=                                      =");
                    System.out.println("========================================");
                    System.out.print("Masukkan Email Anda \t : ");
                    String emailBaru = scanner.nextLine();
                    System.out.print("Masukkan Password Anda \t : ");
                    String newPassword = scanner.nextLine();
                    System.out.println("========================================");

                if (peminjams.containsKey(emailBaru)) {
                    System.out.println("===================================================");
                    System.out.println("Email Sudah Terdaftar, Silahkan Masukkan Email Baru");
                    System.out.println("===================================================");
                } else {
                    peminjams.put(emailBaru, newPassword);
                    System.out.println("=====================");
                    System.out.println("Pendaftaran Berhasil");
                    System.out.println("=====================");
                    threadSleep();
                    clearScreen();
                }
                break;
                    case "0":
                    System.exit(0);
                    break;
                default:
                clearScreen();
                threadSleep();
                    break;
            }
        }
    }

}

package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peminjaman {

    private String idPeminjaman;
    private Peminjam peminjam;;
    private LocalDate tanggal;
    private ArrayList<DetailPeminjaman> detailPeminjamans;


    public String getIdPeminjaman() {
        return this.idPeminjaman;
    }

    public Peminjaman setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
        return this;
    }

    public Peminjam getPeminjam() {
        return this.peminjam;
    }

    public Peminjaman setPeminjam(Peminjam peminjam) {
        this.peminjam = peminjam;
        return this;
    }

    public LocalDate getTanggal() {
        return this.tanggal;
    }

    public Peminjaman setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public ArrayList<DetailPeminjaman> getDetailPeminjamans() {
        return this.detailPeminjamans;
    }

    public Peminjaman setDetailPeminjamans(ArrayList<DetailPeminjaman> detailPeminjamans) {
        this.detailPeminjamans = detailPeminjamans;
        return this;
    }


}
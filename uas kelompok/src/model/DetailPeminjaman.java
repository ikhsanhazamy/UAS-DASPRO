package model;
public class DetailPeminjaman {

    private String idDetailPeminjaman;
    private Peminjaman peminjaman;
    private Buku buku;


    public String getIdDetailPeminjaman() {
        return this.idDetailPeminjaman;
    }

    public DetailPeminjaman setIdDetailPeminjaman(String idDetailPeminjaman) {
        this.idDetailPeminjaman = idDetailPeminjaman;
        return this;
    }

    public Peminjaman getPeminjaman() {
        return this.peminjaman;
    }

    public DetailPeminjaman setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
        return this;
    }

    public Buku getBuku() {
        return this.buku;
    }

    public DetailPeminjaman setBuku(Buku buku) {
        this.buku = buku;
        return this;
    }


}
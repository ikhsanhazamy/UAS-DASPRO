package model;
public class Peminjam extends Akun {

    private String idPeminjam;
    

    public String getIdPeminjam() {
        return this.idPeminjam;
    }

    public Peminjam setIdPeminjam(String idPeminjam) {
        this.idPeminjam = idPeminjam;
        return this;
    }


}
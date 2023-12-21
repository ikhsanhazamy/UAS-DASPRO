package model;
public class Buku {

    private String idBuku;
    private String genreBuku;
    private String namaBuku;
    private boolean isAvailable;



    public String getIdBuku() {
        return this.idBuku;
    }

    public Buku setIdBuku(String idBuku) {
        this.idBuku = idBuku;
        return this;
    }

    public String getGenreBuku() {
        return this.genreBuku;
    }

    public Buku setGenreBuku(String genreBuku) {
        this.genreBuku = genreBuku;
        return this;
    }

    public String getNamaBuku() {
        return this.namaBuku;
    }

    public Buku setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
        return this;
    }

    public boolean isIsAvailable() {
        return this.isAvailable;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public Buku setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }



}
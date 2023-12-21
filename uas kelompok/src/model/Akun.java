package model;
public class Akun {

    private String namaLengkap;
    private String email;
    private String pw;
    private String NIK;



    public String getNamaLengkap() {
        return this.namaLengkap;
    }

    public Akun setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPw () {
        return this.pw;
    }

    public Akun setPw(String pw) {
        this.pw = pw;
        return this;
    }

    public String getNIK() {
        return this.NIK;
    }

    public Akun setNIK(String NIK) {
        this.NIK = NIK;
        return this;
    }


}
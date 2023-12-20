# UAS-DASPRO

```mermaid
classDiagram
    class Akun{
        -nama : String
        -email : String
        -NIK : integer
    }

    class Buku{
        -idBuku :String
        -namaBuku : String
        -isAvailable : boolean
    }

    class CategoryBuku{
        -idCategory : String
        -Peminjaman :
        -Buku :
        -Category :
        -isAvailable : boolean
    }

    class DetailPeminjaman{
        -idDetailPeminjaman : String
        -Peminjaman :
        -Buku :
        -Ctegory :
     
    }

    class Peminjam{
        -idPeminjam : String
    }

class Peminjaman{
        -idPeminjaman : String
        -Peminjam :
        -Tanggal :
        -DetailPeminjamans : ArrayList

}

    Akun <|--|> Peminjam
    Buku --|> Peminjaman
    Peminjam <|--|> CategoryBuku
    Buku <|-- CategoryBuku
    Peminjaman --*  DetailPeminjaman
    
```

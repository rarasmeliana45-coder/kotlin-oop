Program OOP Kotlin: Rekening Bank
Program sederhana yang dibuat dengan Kotlin untuk mempelajari konsep OOP (Object-Oriented Programming), khususnya penggunaan variabel dan fungsi public dan private (enkapsulasi).
Deskripsi
Program ini mensimulasikan sebuah rekening bank. Data sensitif seperti saldo dan PIN disimpan sebagai private sehingga tidak bisa diakses langsung dari luar class. Akses hanya bisa dilakukan lewat fungsi public yang sudah divalidasi.
Konsep yang Digunakan
Elemen
Modifier
Keterangan
namaPemilik
public
Bisa diakses dari luar class
nomorRekening
public
Dibuat otomatis secara acak
saldo
private
Hanya bisa diubah dari dalam class
pin
private
Tersembunyi dari luar class
setor()
public
Menambah saldo
tarik()
public
Mengurangi saldo (butuh PIN)
lihatSaldo()
public
Menampilkan saldo (butuh PIN)
cekPin()
private
Fungsi internal untuk validasi PIN# kotlin-oop
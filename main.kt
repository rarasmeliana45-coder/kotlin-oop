// Program OOP Kotlin: Rekening Bank
// Menunjukkan variabel public dan private (enkapsulasi)

class RekeningBank(val namaPemilik: String, saldoAwal: Double) {

    // PUBLIC: bisa diakses dari luar class
    val nomorRekening: String = "REK-" + (1000..9999).random()

    // PRIVATE: hanya bisa diakses dari dalam class ini
    private var saldo: Double = saldoAwal
    private var pin: String = "1234"

    // Fungsi PUBLIC untuk menyetor uang
    fun setor(jumlah: Double) {
        if (jumlah > 0) {
            saldo += jumlah
            println("Setor Rp$jumlah berhasil.")
        } else {
            println("Jumlah setor tidak valid!")
        }
    }

    // Fungsi PUBLIC untuk menarik uang (dengan validasi PIN)
    fun tarik(jumlah: Double, pinInput: String) {
        if (!cekPin(pinInput)) {
            println("PIN salah! Penarikan dibatalkan.")
        } else if (jumlah > saldo) {
            println("Saldo tidak cukup!")
        } else {
            saldo -= jumlah
            println("Tarik Rp$jumlah berhasil.")
        }
    }

    // Fungsi PUBLIC untuk melihat saldo (saldo tetap private)
    fun lihatSaldo(pinInput: String) {
        if (cekPin(pinInput)) {
            println("Saldo $namaPemilik: Rp$saldo")
        } else {
            println("PIN salah! Saldo tidak bisa ditampilkan.")
        }
    }

    // Fungsi PRIVATE: hanya dipakai di dalam class
    private fun cekPin(pinInput: String): Boolean {
        return pinInput == pin
    }
}

fun main() {
    val rekening = RekeningBank("Budi", 500000.0)

    // Mengakses variabel PUBLIC (boleh)
    println("Pemilik : ${rekening.namaPemilik}")
    println("No Rek  : ${rekening.nomorRekening}")
    println("------------------------------")

    rekening.setor(250000.0)
    rekening.lihatSaldo("1234")
    rekening.tarik(100000.0, "1234")
    rekening.tarik(50000.0, "0000")   // PIN salah
    rekening.lihatSaldo("1234")

    // Baris di bawah akan ERROR jika tanda // dihapus,
    // karena saldo dan pin bersifat PRIVATE:
    // println(rekening.saldo)
    // println(rekening.pin)
}

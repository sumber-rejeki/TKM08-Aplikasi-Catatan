// File: Main.kt
import kotlinx.coroutines.*

fun main() {
    val pengelolaCatatan = PengelolaCatatan()

    // Contoh menambah catatan
    pengelolaCatatan.tambahCatatan(Catatan("Catatan 1", "Isi catatan pertama"))
    pengelolaCatatan.tambahCatatan(Catatan("Catatan 2", "Isi catatan kedua"))

    // Contoh menampilkan daftar catatan secara synchronous
    println("Menampilkan daftar catatan secara synchronous:")
    pengelolaCatatan.tampilkanDaftarCatatan()

    // Menjalankan suspending function untuk menampilkan daftar catatan secara asynchronous
    runBlocking {
        tampilkanDaftarCatatanAsync(pengelolaCatatan)
    }
}

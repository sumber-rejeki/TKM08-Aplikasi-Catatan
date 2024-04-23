// File: Util.kt
import kotlinx.coroutines.delay

suspend fun tampilkanDaftarCatatanAsync(pengelolaCatatan: PengelolaCatatan) {
    // Contoh suspending function untuk menampilkan daftar catatan secara asynchronous
    delay(1000) // contoh delay untuk simulasi operasi asynchronous
    println("Menampilkan daftar catatan secara asynchronous:")
    pengelolaCatatan.tampilkanDaftarCatatan()
}

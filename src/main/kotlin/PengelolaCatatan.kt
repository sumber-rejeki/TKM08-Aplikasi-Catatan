// File: PengelolaCatatan.kt
class PengelolaCatatan {
    private val daftarCatatan = mutableListOf<Catatan>()

    fun tambahCatatan(catatan: Catatan) {
        daftarCatatan.add(catatan)
    }

    fun tampilkanDaftarCatatan() {
        for ((index, catatan) in daftarCatatan.withIndex()) {
            println("Catatan ${index + 1}:")
            println("Judul: ${catatan.judul}")
            println("Konten: ${catatan.konten}")
        }
    }
}

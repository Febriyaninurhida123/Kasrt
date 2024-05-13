package com.example.kasrt.model

data class DataItem(
    val email : String,
    val alamat: String,
    val foto_warga: String,
    val nama_depan: String,
    val nama_belakang: String,
    val pemanfaatan_iuran: String,
    val pengeluaran_iuran: Int,
    val total_rekap_iuran_bulanan: Int,
    val jumlah_iuran_bulanan_warga: Int,
    val total_iuran_individu_warga: Int,
)
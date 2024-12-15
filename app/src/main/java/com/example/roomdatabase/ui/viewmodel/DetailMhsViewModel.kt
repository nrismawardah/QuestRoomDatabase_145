package com.example.roomdatabase.ui.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.roomdatabase.data.entity.Mahasiswa
import com.example.roomdatabase.repository.RepositoryMhs
import com.example.roomdatabase.ui.navigation.DestinasiDetail
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map

data class DetailUiState(
    val detailUiState: MahasiswaEvent = MahasiswaEvent(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
) {
    val isUiEventEmpty: Boolean
        get() = detailUiEvent == MahasiswaEvent()


    val isUiEventNotEmpty: Boolean
        get() = detailUiEvent != MahasiswaEvent()
}

fun Mahasiswa.toDetailUiEvent() : MahasiswaEvent {
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}
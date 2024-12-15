package com.example.roomdatabase.ui.viewmodel

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
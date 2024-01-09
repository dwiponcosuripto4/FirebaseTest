package com.example.firebasetest.ui

import android.text.Editable.Factory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebasetest.KontakApplication
import com.example.firebasetest.ui.add.AddViewModel
import com.example.firebasetest.ui.detail.DetailViewModel
import com.example.firebasetest.ui.edit.EditViewModel
import com.example.firebasetest.ui.home.HomeViewModel

fun CreationExtras.aplikasiKontak():KontakApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakApplication)

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            AddViewModel(aplikasiKontak().container.kontakRepository)
        }

        initializer {
            HomeViewModel(aplikasiKontak().container.kontakRepository)
        }

        initializer {
            DetailViewModel(
                createSavedStateHandle(),
                aplikasiKontak().container.kontakRepository
            )
        }

        initializer {
            EditViewModel(
                createSavedStateHandle(),
                aplikasiKontak().container.kontakRepository
            )
        }
    }
}
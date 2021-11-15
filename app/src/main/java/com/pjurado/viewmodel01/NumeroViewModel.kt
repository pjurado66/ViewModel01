package com.pjurado.viewmodel01

import androidx.lifecycle.ViewModel

class NumeroViewModel: ViewModel() {
    private var resultado = 0

    fun getResultado(): Int {
        return resultado
    }

    fun setResultado(resultado: Int) {
        this.resultado = resultado
    }

}
package com.github.knifeofdreams.codekata.kotlin

class CodeKata(val intSupplier: () -> Int) {

    fun generateRandomNumber(): Int {
        return intSupplier.invoke()
    }
}

fun generateRandomNumber(supplier: () -> Int): Int {
    return supplier.invoke()
}

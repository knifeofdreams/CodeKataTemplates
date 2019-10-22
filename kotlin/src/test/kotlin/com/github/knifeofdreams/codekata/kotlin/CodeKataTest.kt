package com.github.knifeofdreams.codekata.kotlin

import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

@ExtendWith(MockKExtension::class)
internal class CodeKataTest {

    @MockK
    lateinit var intSupplier: () -> Int

    lateinit var codeKata: CodeKata

    @BeforeTest
    fun before() {
        every {
            intSupplier.invoke()
        } returns 4;
        codeKata = CodeKata(intSupplier)
    }

    @Test
    fun `class uses provided mock correctly`() {
        assertEquals(4, codeKata.generateRandomNumber())
    }
}

internal class CodeKataTopLevelFunctionTest {

    @Test
    fun `function uses provided mock correcty`() {
        val intSupplierFunc = mockk<() -> Int>()
        every {
            intSupplierFunc.invoke()
        } returns 4

        assertEquals(4, generateRandomNumber(intSupplierFunc))
    }
}

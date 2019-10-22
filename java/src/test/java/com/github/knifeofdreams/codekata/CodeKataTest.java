package com.github.knifeofdreams.codekata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.IntSupplier;
import org.junit.jupiter.api.Test;

class CodeKataTest {

  @Test
  public void testGenerateRandomNumber() {
    IntSupplier mockRandomNumberSupplier = mock(IntSupplier.class);
    when(mockRandomNumberSupplier.getAsInt())
        .thenReturn(4);

    CodeKata kata = new CodeKata(mockRandomNumberSupplier);
    assertEquals(4, kata.generateRandomNumber());
  }

}

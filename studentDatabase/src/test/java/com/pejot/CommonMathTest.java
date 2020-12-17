package com.pejot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.math3.stat.Frequency;
import org.junit.jupiter.api.Test;

public class CommonMathTest {
  @Test
  public void FrequencyTest() {

    Frequency f = new Frequency();
    f.addValue("test");
    f.addValue("123123");
    f.addValue("oNsadase");
    f.addValue("Z");

    assertEquals(1, f.getCount("test"));
  }
}

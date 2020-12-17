package com.pejot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.math3.stat.Frequency;
import org.junit.jupiter.api.Test;

public class CommonMathTest {
  @Test
  public void caseSensitiveFrequencyTest() {

    Frequency f = new Frequency();
    f.addValue("test");
    f.addValue("123123");
    f.addValue("oNsadase");
    f.addValue("Z");

    assertEquals(1, f.getCount("test"));
  }
  @Test
  public void caseInsensitiveFrequencyTest() {

    Frequency f = new Frequency(String.CASE_INSENSITIVE_ORDER);
    f.addValue("test1");
    f.addValue("z1");
    f.addValue("oN1sadase");
    f.addValue("Z1");

    assertEquals(2, f.getCount("z1"));
  }
}

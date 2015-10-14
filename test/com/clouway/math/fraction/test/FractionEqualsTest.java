package com.clouway.math.fraction.test;

import com.clouway.math.fraction.Fraction;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class FractionEqualsTest {

  @Test
  public void sameNumeratorAndDenominator() {
    assertThat(new Fraction(3,5), is(equalTo(new Fraction(3,5))));
  }

  @Test
  public void DifferentDenominator(){
    assertThat(new Fraction(4, 9), not(equalTo(new Fraction(4, 7))));
  }

  @Test
  public void differentNumerator(){
    assertThat(new Fraction(1,3), not(equalTo(new Fraction(2,3))));
  }

  @Test
  public void wholeNumbersEqualsSameFraction(){
    assertThat(new Fraction(6), is(equalTo(new Fraction(6,1))));
  }

  @Test
  public void wholeNumberNotEqualToDifferentHoleNumber(){
    assertThat(new Fraction(2), not(equalTo(new Fraction(8))));
  }

  @Test
  public void negativeDenominator() {
    assertThat(new Fraction(1, 2), is(equalTo(new Fraction(-1, -2))));
    assertThat(new Fraction(-1, 2), is(equalTo(new Fraction(1, -2))));
  }
  @Test
  public void reduce(){
    assertThat(new Fraction(3, 4), is(equalTo(new Fraction(6, 8))));
  }
}
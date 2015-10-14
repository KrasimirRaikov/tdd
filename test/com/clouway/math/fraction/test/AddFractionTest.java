package com.clouway.math.fraction.test;


import com.clouway.math.fraction.Fraction;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class AddFractionTest {

  @Test
  public void zeroPlusZero() {
    assertThat(new Fraction(0), is(equalTo(new Fraction(0).plus(new Fraction(0)))));
  }

  @Test
  public void nonZeroPlusZero(){
    assertThat(new Fraction(3), is(equalTo(new Fraction(3).plus(new Fraction(0)))));
  }

  @Test
  public void zeroPlusNonZero(){
  assertThat(new Fraction(7), is(equalTo(new Fraction(0).plus(new Fraction(7)))));
  }

  @Test
  public void nonNegativNonZeroOperands(){
    assertThat(new Fraction(7),is(equalTo(new Fraction(3).plus(new Fraction(4)))));
  }

  @Test
  public void negativePlusNonNegative(){
    assertThat(new Fraction(-2), is(equalTo(new Fraction(-3).plus(new Fraction(1)))));
  }

  @Test
  public void nonTrivialButCommonDenominator() {
    assertThat(new Fraction(3,5), is(equalTo(new Fraction(1,5).plus(new Fraction(2, 5)))));
  }

  @Test
  public void deifferentDenominators(){
    assertThat(new Fraction(5, 6), is(equalTo(new Fraction(1,2).plus(new Fraction(1, 3)))));
  }

  @Test
  public void reduceResultToWholeNumber() {
    assertThat(new Fraction(1), is(equalTo(new Fraction(1,3).plus(new Fraction(2, 3)))));
  }

  @Test
  public void oneDenominatorIsMultipleOfTheOther() {
    assertThat(new Fraction(11, 8), is(equalTo(new Fraction(3, 4).plus(new Fraction(5, 8)))));
  }

  @Test
  public void commonFactorInDenominators() {
    assertThat(new Fraction(11, 18), is(equalTo(new Fraction(1,6).plus(new Fraction(4, 9)))));
  }

  @Test
  public void reduceResultEvenWhenDenominatorsAreTheSame() {
    assertThat(new Fraction(3, 2), is(equalTo(new Fraction(3, 4).plus(new Fraction(3, 4)))));
  }

  @Test
  public void negativeFractionAndReducing() {
    assertThat(new Fraction(1,2), is(equalTo(new Fraction(-1,4).plus(new Fraction(3, 4)))));
    assertThat(new Fraction(-1,8), is(equalTo(new Fraction(3, 8).plus(new Fraction(-1, 2)))));

  }

  @Test
  public void negativeSignsEverywhere() {
    assertThat(new Fraction(1,2), is(equalTo(new Fraction(1, -4).plus(new Fraction(-3, -4)))));
  }
}

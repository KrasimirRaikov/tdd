package com.clouway.math.fraction.test;

import com.clouway.math.fraction.NumberTheory;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class GreatestCommonDivisorTest {
  @Test
  public void reflexive() {
    assertThat(1,is(equalTo(NumberTheory.gcd(1, 1))));
    assertThat(2,is(equalTo(NumberTheory.gcd(2, 2))));
    assertThat(1,is(equalTo(NumberTheory.gcd(-1, -1))));
    assertThat(1,is(equalTo(NumberTheory.gcd(1, 1))));
  }

  @Test
  public void relativelyPrime(){
    assertThat(1,is(equalTo(NumberTheory.gcd(2, 3))));
    assertThat(1,is(equalTo(NumberTheory.gcd(4, 7))));
    assertThat(1, is(equalTo(NumberTheory.gcd(-2, -3))));
  }

  @Test
  public void oneIsMultipleOfTheOther(){
    assertThat(3,is(equalTo(NumberTheory.gcd(3, 9))));
    assertThat(5,is(equalTo(NumberTheory.gcd(5, 30))));
  }

  @Test
  public void commonFactor() {
    assertThat(2,is(equalTo(NumberTheory.gcd(6, 8))));
    assertThat(7,is(equalTo(NumberTheory.gcd(49, 315))));
    assertThat(4,is(equalTo(NumberTheory.gcd(-24, -28))));
  }

  @Test
  public void negatives() {
    assertThat(4,is(equalTo(NumberTheory.gcd(-24, 28))));
    assertThat(4,is(equalTo(NumberTheory.gcd(24, -28))));
  }

  @Test
  public void zero() {
    assertThat(1, is(equalTo(NumberTheory.gcd(1,0))));
    assertThat(5, is(equalTo(NumberTheory.gcd(0,5))));
    assertThat(0, is(equalTo(NumberTheory.gcd(0,0))));
  }

}

package com.clouway.math.fraction.test;

import com.clouway.math.fraction.Fraction;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class ReduceFractionTest {

  @Test
  public void alreadyInLowestTerms() {
    assertThat(new Fraction(3,4), is(equalTo(new Fraction(3, 4))));
  }

  @Test
  public void reduceToNotWholeNumbers(){
    assertThat(new Fraction(3,4), is(equalTo(new Fraction(6,8))));
  }

  @Test
  public void reduceToWholeNumber() {
    assertThat(new Fraction(6), is(equalTo(new Fraction(24, 4))));
  }

  @Test
  public void reduceZero() {
    assertThat(new Fraction(0), is(equalTo(new Fraction(0, 432))));
  }
}

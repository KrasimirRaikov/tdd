package com.clouway.math.fraction;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Fraction {
  private final int denominator;
  private final int numerator;

  public Fraction(int integerValue) {
    this(integerValue, 1);
  }

  public Fraction(int numerator, int denominator) {
    final int signOfDenominator = denominator<0?-1:1;
    //CONTRACT: gcd never returns zero
    final int gcd= NumberTheory.gcd(numerator,denominator)*signOfDenominator;
    this.numerator = numerator/gcd;
    this.denominator = denominator/gcd;
  }

  public Fraction plus(Fraction that) {
      return new Fraction(this.numerator * that.denominator+that.numerator*this.denominator,
              this.denominator*that.denominator);
  }

  public int intValue() {
    return numerator;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }


  @Override
  public boolean equals(Object other) {
    if (other instanceof Fraction) {
      Fraction that = (Fraction) other;
      return this.numerator == that.numerator
              && this.denominator == that.denominator;
    }
    return false;
  }

  @Override
  public int hashCode(){
    return numerator*19+denominator;
  }

  @Override
  public String toString() {
    return String.format("%d/%d", numerator, denominator);
  }
}

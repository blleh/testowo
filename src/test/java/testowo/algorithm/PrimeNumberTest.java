package testowo.algorithm;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    private PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void positive() {
        assertThat(primeNumber.isPrime(2), is(true));
    }

    @Test
    public void negative() {
        assertThat(primeNumber.isPrime(4), is(false));
    }

    @Test
    public void one() {
        assertThat(primeNumber.isPrime(1), is(false));
    }
}
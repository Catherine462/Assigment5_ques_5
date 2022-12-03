import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeTest {
	@Test
	public void test2() {
		Prime n = new Prime();
		assertTrue(n.isPrime(2));
	}
	@Test
	public void test3() {
		Prime n = new Prime();
		assertTrue(n.isPrime(3));
		
	}
	
	@Test
	public void test4(){
		Prime n = new Prime();
		assertFalse(n.isPrime(4));
		
	}
	@Test
	public void test5() {
		Prime n = new Prime();
		assertTrue(n.isPrime(5));
	}
	@Test
	public void test6() {
		Prime n = new Prime();
		assertFalse(n.isPrime(6));
	}

}

package elite;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class PrimeTest {

	private Integer inputNumber;
	private boolean expectedResult;
	private Prime prime;
	
	@Before
	public void initialize() {
		prime=new Prime();
	}
	
	public PrimeTest(Integer inputNumber,boolean expectedResult) {
		this.inputNumber=inputNumber;
		this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][]  {
			{2,true},{6,false},{16,true},{22,false},{23,true}
		});
	}
	
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized Number is "+inputNumber);
		
		assertEquals(expectedResult,Prime.validate(inputNumber));
	}

}

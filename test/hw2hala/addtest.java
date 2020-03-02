package hw2hala;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class addtest {

	@Test
	public void Addtest() {
		assertEquals("error in add()",3,calculator.add(1,2));
		assertEquals("error in add()",-3,calculator.add(-1,-2));
		assertEquals("error in add()",9,calculator.add(9,0));
		
	}
	
	public void Addtestfail() {
		assertEquals("error in add()",0,calculator.add(1,2));
	}

}

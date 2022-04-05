package xyz.test;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestWithdrawal extends InitialRequrements{
	
	/*
	 * without expected, this will fail
	 */

	@Test(expected = IllegalArgumentException.class)
	public void testOverWithdrawal() {
		account.withdraw(2500);
	}
	
	@Test
	public void testWithdrawal() {
		account.withdraw(250);
	}

}

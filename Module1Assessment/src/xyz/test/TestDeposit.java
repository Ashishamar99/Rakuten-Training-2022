package xyz.test;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestDeposit extends InitialRequrements{

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeDeposit() {
		account.deposit(-250);
	}
	
	@Test
	public void testDeposit() {
		account.deposit(250);
	}

}

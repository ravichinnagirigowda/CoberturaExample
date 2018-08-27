package com.training.example.CoberturaExample;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void whenEmptyString_thenAccept() {
	    App palindromeTester = new App();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
}

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass  operatorTestClass = new OperatorTestClass();
	
	@Test
	void additionTest() {
		
		assertEquals(10, operatorTestClass.addition(5, 5));
		assertEquals(10, operatorTestClass.addition(0, 10));
		assertEquals(10, operatorTestClass.addition(7, 3));
		
	}
	
	@Test
	void subtractionTest() {
		
		assertEquals(10, operatorTestClass.subtraction(15, 5));
		assertEquals(10, operatorTestClass.subtraction(10, 0));
		assertEquals(15, operatorTestClass.subtraction(20, 5));
		
	}
	
	@Test
	void divisionTest() {
		
		assertEquals(10, operatorTestClass.division(50, 5));
		assertEquals(0, operatorTestClass.division(0, 10));
		assertEquals(5, operatorTestClass.division(25, 5));
		
	}
	
	@Test
	void multiplicationTest() {
		
		assertEquals(25, operatorTestClass.multiplication(5, 5));
		assertEquals(0, operatorTestClass.multiplication(0, 10));
		assertEquals(100, operatorTestClass.multiplication(10, 10));
		
	}
	
	@Test
	void modulusTest() {
		
		assertEquals(3, operatorTestClass.modulus(103, 5));
		assertEquals(0, operatorTestClass.modulus(0, 10));
		assertEquals(5, operatorTestClass.modulus(15, 10));
		
	}
	
	@Test
	void bitAndTest() {
		
		assertEquals(5, operatorTestClass.bitAnd(5, 5));
		assertEquals(0, operatorTestClass.bitAnd(1, 2));
		assertEquals(1, operatorTestClass.bitAnd(1, 11));
		
	}
	
}

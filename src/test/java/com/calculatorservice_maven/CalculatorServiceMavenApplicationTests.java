package com.calculatorservice_maven;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest
class CalculatorServiceMavenApplicationTests {

	int a = 45;
	int b = 15;
	int result_sum = 0;
	OperationSum operationSum = new OperationSum(a, b, result_sum);

	@Test
	void sumTesting(){
		int expect_sum = 60;
		result_sum = operationSum.sum(a, b);
		assertEquals(expect_sum, result_sum);
	}

	double c = 15.5;
	double d = 10.0;
	double result_sub = 0;
	OperationSubstration operationSubstration = new OperationSubstration(c, d, result_sub);

	@Test
	void subTesting(){
		double expect_sub = 5;
		result_sub = operationSubstration.sub(c, d);
		assertNotEquals(expect_sub,result_sub);
	}

	double e = 10;
	double f = 2;
	double result_mul = 0;
	OperationMultiplication operationMultiplication = new OperationMultiplication(e, f, result_mul);

	@Test
	void mulTesting(){
		double expect_mul = 18;
		result_mul = operationMultiplication.mul(e, f);
		assertNotEquals(expect_mul,result_mul);
	}

	double g = 45;
	double h = 15;
	double result_div = 0;
	OperationDivision operationDivision = new OperationDivision(g, h, result_div);

	@Test
	void divTesting(){
		double expect_div = 2.8;
		result_div = operationDivision.div(g, h);
		assertNotEquals(expect_div, result_div);
	}

}

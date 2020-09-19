package com.calculatorservice_maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b){
        OperationSum operationSum = new OperationSum(a, b, 0);
        return operationSum.sum(a, b);
    }

    @GetMapping("/sub/{a}/{b}")
    public double sub(@PathVariable double a, @PathVariable double b){
        OperationSubstration operationSubstration = new OperationSubstration(a, b, 0);
        return operationSubstration.sub(a, b);
    }

    @GetMapping("/mul/{a}/{b}")
    public double mul(@PathVariable double a, @PathVariable double b){
        OperationMultiplication operationMultiplication = new OperationMultiplication(a, b, 0);
        return operationMultiplication.mul(a, b);
    }

    @GetMapping("/div/{a}/{b}")
    public double div(@PathVariable double a, @PathVariable double b) {
        OperationDivision operationDivision = new OperationDivision(a, b, 0);
        return operationDivision.div(a, b);
    }

}

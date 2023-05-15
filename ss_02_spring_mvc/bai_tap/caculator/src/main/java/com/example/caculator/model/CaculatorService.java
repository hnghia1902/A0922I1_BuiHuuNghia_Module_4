package com.example.caculator.model;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CaculatorService implements ICaculatorService{
    private static List<String> operator;
    static {
        operator = new ArrayList<>();
        operator.add("addition");
        operator.add("subtraction");
        operator.add("multiplication");
        operator.add("division");
    }

    @Override
    public List<String> operator() {
        return operator;
    }

    @Override
    public double caculator(double num1, String operator, double num2) {
        double opera = 0;
        switch (operator) {
            case "addition":
                opera = num1+num2;
                break;
            case "subtraction":
                opera = num1-num2;
                break;
            case "multiplication":
                opera = num1*num2;
                break;
            case "division":
                opera = num1/num2;
                break;
        }

        return opera;
    }}

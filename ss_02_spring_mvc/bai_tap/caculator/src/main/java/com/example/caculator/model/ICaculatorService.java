package com.example.caculator.model;

import org.springframework.stereotype.Service;

import java.util.List;


public interface ICaculatorService {
    List<String> operator();
    double caculator(double num1, String operator, double num2);
}

package com.example.hello.services;

import java.util.Arrays;

public class Calculadora {
  public int somar(int... valores) {
    return Arrays.stream(valores).reduce(0, (soma, atual) -> soma + atual);
  }
}

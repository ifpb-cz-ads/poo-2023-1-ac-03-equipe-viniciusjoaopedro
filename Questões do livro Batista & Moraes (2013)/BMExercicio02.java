// Questão 2 (pg. 43) do livro Batista & Moraes (2013).

/**
Escreva um programa que declare, inicialize e imprima as seguintes variáveis:
• Inteiro i de 32 bits com valor 1
• Inteiro j de 64 bits com valor 2
• Ponto flutuante p de 32 bits com valor 20.0
• Ponto flutuante q de 64 bits com valor 30.0
• Boolean b com valor verdadeiro
• Caracter c com valor ‘k’
 */

public class BMExercicio02 {
  public static void main(String args[]) {
    int i = 1;
    long j = 2L;
    float p = 20.0f;
    double q = 30.0;
    boolean b = true;
    char c = 'k';

    System.out.println("Inteiro i de 32 bits = " + i);
    System.out.println("Inteiro j de 64 bits = " + j);
    System.out.println("Ponto flutuante p de 32 bits = " + p);
    System.out.println("Ponto flutuante q de 64 bits = " + q);
    System.out.println("Boolean b = " + b);
    System.out.println("Caracter c = " + c);
  }
}

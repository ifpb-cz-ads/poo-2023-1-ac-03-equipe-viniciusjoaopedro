// Questão 2 (pg. 59) do livro Chagas, Baruque & Baruque (2010)

/**
Crie um programa e declare nele 3 variáveis numéricas int, inicializando-as com algum valor e obtenha a soma dessas variáveis e a
média delas, imprimindo esses resultados na tela.
 */

public class CBBAtividadePratica2 {
    public static void main(String args[]) {
      int a = 1, b = 2, c = 4;
      int soma = a + b + c;
      double media = soma / 3.0;
      System.out.println("Soma: " + soma);
      System.out.println("Média: " + media);
    }
}

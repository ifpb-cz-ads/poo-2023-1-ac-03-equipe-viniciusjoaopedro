// Questão 4 (pg. 44) do livro Batista & Moraes (2013).

public class BMExercio04 {
  public static void main(String[] args) {

    // Declare uma variável chamada long1 do tipo long e a inicialize com 100.    
    long long1 = 100;
    
    // Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com 200.    
    int int1 = 200, int2;
    
    /* Agora faça int2 receber int1 mais long1 e explique os resultados.
    Resposta: int2 = int1 + long1;  Apresentará um erro de compilação.
    Pois a soma entre int1 e long1 resultará em um valor do tipo long, que não
    pode ser atribuída a int2 do tipo inteiro. Por isso acusa que poderá haver 
    perda de informação na conversão entre os tipos long e int. */
    
    // Arrume o código para que não ocorra o erro anterior.    
    int2 = int1 + (int) long1; //Para evitar isso fazemos o casting
    System.out.println("A soma entre int1 e long1 é: " + int2);    
  }
}
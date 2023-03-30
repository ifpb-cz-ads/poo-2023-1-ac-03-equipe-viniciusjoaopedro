/* CBBAtividadePratica4
    Crie um programa que elabore o orçamento de uma construtora para o cálculo 
    do valor total de construção de uma piscina. O valor total será dado pela 
    cubagem da piscina (metros cúbicos) multiplicada por R$100,00, que é o preço 
    do metro cúbico construído de piscina. Faça a simulação dos cálculos no 
    programa para ver se está tudo funcionando corretamente.
    */
   
public class CBBAtividadePratica4 {
  public static void main(String[] args) {
      
      // Dimensões da piscina:
      float altura = 2.5f;
      float comprimento = 6.5f;
      float largura = 6.5f;
          
      float cubagem = altura * comprimento * largura;
            
      float orcamento = cubagem * 100;
        
      System.out.printf("O orçamento da piscina é de R$ %.2f\n", orcamento);
  }
}
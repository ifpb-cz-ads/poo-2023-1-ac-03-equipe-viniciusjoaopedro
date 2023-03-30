// Crie um programa seguindo as orientações abaixo. 
// Faça tudo que pede dentro do método main.

public class BMExercicio03 {
  public static void main(String[] args) {

    // a) Declare duas variáveis para armazenar os valores de dois itens de
    //    venda. Os valores dos dois itens devem ser 2.95 e 3.50. Pense em nomes
    //    significativos para as variáveis e também considere qual deve ser seu tipo.

    float valor_item1 = 2.95f;
    float valor_item2 = 3.50f;

    // b) Use o System.out.println() para mostrar o conteúdo de suas variáveis. 
    //    Execute o programa e veja a saída. Apresente uma mensagem significativa 
    //    como “O Item 1 custa 2.95 e ...” (Dica : utilize o operador + para 
    //    concatenar o texto com o valor da variável).
    
    System.out.println("O valor do item 1 é R$ " + valor_item1 + " e o valor do item 2 é R$ " + valor_item2); 

    // c) Declare uma outra variável para armazenar o custo total dos itens.
    //    Utilize o operador de adição para realizar o cálculo e imprima o resultado.
    
    float custo_total = valor_item1 + valor_item2;
    System.out.println("O valor total dos itens é de R$ " + custo_total);

    // d) Crie uma constante para armazenar a taxa de 8.25 % que deve ser
    //    cobrada sobre o valor total. Armazene o cálculo numa variável chamada
    //    taxaCalculada e imprima o resultado.

    final float TAXA = 8.25f;
    float taxaCalculada = custo_total*(TAXA / 100);
    System.out.println("A taxa calculada é de R$ " + taxaCalculada);

    // e) Adicione ao valor de cada item o valor da taxa calculado. 
    //    Use a menor linha de código possível para fazer isso. 
    //    Some novamente os dois valores e atribua o resultado a 
    //    uma variável chamada novoCusto.
    
    float novoCusto = (valor_item1 + taxaCalculada) + (valor_item2 + taxaCalculada);

    // f) Crie uma variável booleana chamada muitoCaro. Escreva uma assertiva lógica 
    //    para setar essa variável para true se novoCusto for maior que 10 e para false, 
    //    caso contrário. Imprima o valor obtido em muitoCaro. 
    //    (Não utilize if para escrever a assertiva.)
    
    boolean muitoCaro = novoCusto > 10;
    System.out.println("É muito caro: " + muitoCaro);
       
  }
}
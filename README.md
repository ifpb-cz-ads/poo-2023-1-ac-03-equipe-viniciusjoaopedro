## 3.03 Atividade colaborativa

## 🤝 Alunos: Vinícius da Silva Ribeiro e Joao Pedro Oliveira Santos

- Batista & Moraes (2013): exercícios 01 a 04 (páginas 42 a 44);
- Chagas, Baruque & Baruque (2010): atividades práticas 2 (pg. 59), 3 (pg. 60) e 4 (pg. 62)

## ✔️ Questão 1 do livro Batista & Moraes (2013): Analise as seguintes declarações de variáveis e assinale (V) para Verdadeiro e (F) para Falso.

`a) (F) byte x = 300;`  

* É falso porque para o tipo de dado byte o intervalo permitido é de -128 a 127. Como o valor 300 está fora desse intervalo, resultará erro de compilação.

`b) (V) short $mom = 43;`

* É verdadeiro porque embora seja possível usar o caractere $ para nomear variáveis, não é considerado uma boa prática. Pois usar caracteres especiais em nome de veriáveis pode dificultar a leitura do código por outras pessoas.

`c) (F) int num = 2.5;`

* É falso porque o tipo int é um tipo de dado inteiro e só pode armazenar valores inteiros. Ao tentar atribuir o valor 2.5 ocorrerá um erro de compilação, pois há perda de precisão na conversão do valor de ponto flutuante para um valor inteiro.

`d) (V) double d = 20;`

* É verdadeiro porque o tipo double é um tipo de dado de ponto flutuante de precisão dupla que pode armazenar valores inteiros e de ponto flutuante com uma alta precisão. Ao atribuir uma valor inteiro em uma variável do tipo double o valor é automaticamente convertido para um valor de ponto flutuante.

`e) (V) char c = 25;`

* É verdadeiro porque em Java é possível atribuir valor inteiro a uma variável do tipo char, mas ele deve variar de 0 a 65535. O tipo char é um tipo de dado que representa um único caractere Unicode de 16 bits. Ao atribuir uma valor inteiro nela eler é automaticamente convertido para o caractere Unicode correspondente.

`f) (F) boolean epar = (4 % 2 = 0);`

* É falso porque em Java não é possível utilizar o operador de atribuição = dentro de uma expressão booleana como no exemplo (4 % 2 = 0). Pois para retornar um booleano em uma comparação é usao o ==. O = é para atribuição. Estaria correto se estivesse assim: boolean epar = (4 % 2 == 0).

`g) (F) char nome = “Maria”;`

* É falso porque o tipo char armazena só um caractere Unicode de 16 bits, e tem que ser entre aspas simples. Para atribuir um valor de texto em aspas duplas teria que ser do tipo String.

`h) (V) String b = “1”`

* É verdadeiro porque como o 1 está entre espas ele passa a ser uma string válida.

`i) (F) float x = 2.7;`

* É falso porque o correto seria float x = 2.7f (tipo float tem no final o sufixo f).

`j) (F) int a = false;`

* É falso porque o tipo int não pode armazenar valores booleanos (true ou false). Para armazenarmos valores booleanos em java nós devemos usar o tipo de dados boolean.



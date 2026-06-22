# Avaliação de Testes - Jorge Amado Belo

Projeto Java desenvolvido para praticar versionamento com Git/GitHub e testes unitários com JUnit.

## Funcionalidades

* Soma de dois números inteiros
* Divisão de dois números inteiros
* Teste de divisão por zero

## Tecnologias utilizadas

* Java
* JUnit 5
* IntelliJ IDEA
* Git/GitHub

## Como executar os testes

Abra o projeto no IntelliJ IDEA, acesse o arquivo `CalculadoraTest.java` e execute os testes pelo botão verde de execução.

## Resultados dos testes

| Cenário Testado | Resultado Esperado          | Resultado Obtido             | Status |
| --------------- | --------------------------- | ---------------------------- | ------ |
| Soma 5 + 5      | 10                          | 10                           | Passou |
| Divisão 10 / 2  | 5                           | 5                            | Passou |
| Divisão 10 / 0  | Exceção ArithmeticException | Exceção lançada corretamente | Passou |

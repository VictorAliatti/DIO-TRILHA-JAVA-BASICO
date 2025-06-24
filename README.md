# ContaBanco - Simulador de Conta Corrente via Terminal

Projeto simples em Java para simular a criação de uma conta bancária via terminal.  
Este é um exercício de aprendizado com foco em entrada de dados com `Scanner`, tipos primitivos e mensagens personalizadas.

---

## Descrição

O programa solicita ao usuário, via terminal, os seguintes dados:

- Número da conta (ex: `1021`)
- Número da agência (ex: `067-8`) 
- Nome do cliente (ex: `MARIO ANDRADE`)
- Saldo inicial (ex: `237.48`)

Após inserir todos os dados, o sistema exibe uma mensagem confirmando a criação da conta.

---

## Tecnologias Utilizadas

- [Java JDK 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- Scanner (`java.util.Scanner`)
- VS Code como IDE

---

## Como Executar

### Pré-requisitos

- Ter o Java instalado e configurado corretamente no seu sistema.
- Ter o VS Code (ou outra IDE) configurado com o JDK.

### Executando via terminal:
### Exemplo de Saída

javac ContaTerminal.java
java ContaTerminal

Por favor, digite o número da Agência: 067-8
Por favor, digite o número da Conta: 1021
Por favor, digite o nome do Cliente: MARIO ANDRADE
Por favor, digite o saldo: 237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco.
Sua agência é 067-8, conta 1021 e seu saldo R$ 237.48 já está disponível para saque.

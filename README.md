# java-poo-exBanco
💳 Banco Simples em Java
Este projeto simula um sistema bancário básico utilizando conceitos de Programação Orientada a Objetos (POO) em Java.

📚 O que o projeto faz
Gerencia Contas Poupança e Contas Corrente.
Permite depósitos, saques e atualizações de saldo com aplicação de taxas ou juros.
Simula uso de cheque especial em contas correntes.
Calcula rendimentos para contas poupança.
Gera demonstrativos para cada tipo de conta.

🏛️ Estrutura das classes
Conta: Classe abstrata que define as operações básicas (depositar, sacar, atualizar, fechar mês, demonstrativo).
Poupanca: Especialização de conta que aplica rendimentos ao saldo.
Corrente: Especialização de conta que gerencia saldo e limite de cheque especial.
Banco: Classe principal que cria instâncias de contas e realiza operações simuladas.

🎯 Conceitos aplicados
-Herança
-Abstração
-Polimorfismo
-Encapsulamento
-Manipulação de saldo bancário
-Uso de super para acessar métodos da classe-pai

# 🏦 BancoPOO

Projeto desenvolvido em Java utilizando os conceitos de Programação Orientada a Objetos (POO).

---

## 🚀 Tecnologias utilizadas

- ☕ Java
- 💻 IntelliJ IDEA
- 🌱 Git
- 🐙 GitHub

---

## 📚 Conceitos praticados

✅ Classes e Objetos  
✅ Encapsulamento  
✅ Métodos  
✅ Construtores  
✅ Getters e Setters  
✅ Entrada de dados com Scanner  
✅ Estruturas condicionais (`if/else`)  
✅ Orientação a Objetos  

---

## 🧠 Funcionalidades

✨ Criar conta bancária  
✨ Realizar depósito inicial  
✨ Depositar valores  
✨ Realizar saque  
✨ Taxa de saque automática  
✨ Exibir dados da conta  

---

## 📂 Estrutura do projeto

```bash
src/
├── application/
│   └── Program.java
│
└── entities/
    └── Cliente.java
```

---

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/DanySanches/BancoPOO.git
```

2. Abra no IntelliJ IDEA

3. Execute o arquivo:

```bash
Program.java
```

---

## 💡 Exemplo de uso

```text
Digite o número da Conta:
1234

Digite o nome do cliente:
Nina

Deseja realizar o depósito inicial(s/n)?
s

Qual valor você deseja depositar:
500.00
```

---

## 📸 Conceitos aplicados no código

### 💰 Depósito

```java
public void deposito(double valor) {
    this.saldo += valor;
}
```

### 🏧 Saque

```java
public void saque(double valor) {
    this.saldo -= valor + TAXA;
}
```

---

## 🎯 Melhorias futuras

- [ ] Validação de saldo negativo
- [ ] Múltiplos clientes
- [ ] Persistência de dados
- [ ] Interface gráfica

---

## 👩‍💻 Autora

Feito por Danielle Sanches

🔗 GitHub:
https://github.com/DanySanches

---

## ⭐ Projeto para estudos de Java e POO

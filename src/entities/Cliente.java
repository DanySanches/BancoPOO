package entities;

public class Cliente {

    private int conta;
    private String nome;
    private double saldo;
    private final double TAXA = 5.00;

    public Cliente(int conta,String nome) {
        this.conta = conta;
        this.nome = nome;

    }


    public Cliente( int conta, String nome, double valorInicial) {
        this.conta = conta;
        this.nome = nome;
        deposito(valorInicial);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

   /* public void setSaldo(double saldo) {
        this.saldo = saldo;
    }*/


    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void deposito(double valor) {

        this.saldo += valor;

    }

    public void saque(double valor) {
        this.saldo -= valor + TAXA;
    }

    public String toString(){

        return "Conta: "
                + conta
                + ", Nome: "
                + nome
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }



}

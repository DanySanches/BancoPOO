package entities;

public class Cliente {

    private String nome;
    private double saldo;
    private int CONTA;
    private final double TAXA = 5.00;

    public Cliente(String nome, double saldo, int CONTA) {
        this.nome = nome;
        this.saldo = saldo;
        this.CONTA = CONTA;
    }

    public Cliente() {

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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public int getCONTA() {
        return CONTA;
    }

    public void setCONTA(int CONTA) {
        this.CONTA = CONTA;
    }

    public void deposito(double valor) {

        this.saldo += valor;

    }

    public void saque(double valor) {
        this.saldo -= valor + TAXA;
    }

    public String toString(){

        return "Conta: "
                + CONTA
                + ", Nome: "
                + nome
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }



}

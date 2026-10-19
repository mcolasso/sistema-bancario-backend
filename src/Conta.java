public class Conta {

    private int numeroConta;
    private int agencia;
    private double saldo;
    private Cliente titular;

    public Conta(int numeroConta, int agencia, Cliente titular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0.0; // Toda conta começa zerada por padrão
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
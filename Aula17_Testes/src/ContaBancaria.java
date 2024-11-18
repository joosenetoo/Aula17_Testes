public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor de depósito inválido.");
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) throw new IllegalArgumentException("Saldo insuficiente.");
        saldo -= valor;
    }
}

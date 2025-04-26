package exBanco;

abstract class Conta {
    private String cpf;
    private double saldo;

    public Conta(String cpf, double depositoInicial)
    {
        this.cpf = cpf;
        this.saldo = depositoInicial;
    }

    public abstract void Depositar(double valor);

    public abstract boolean Sacar(double valor);

    public abstract void Atualizar(double taxa);

    public abstract void FecharMes();

    public abstract void Demonstrativo();

    public String getCpf()
    {
        return cpf;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    

}

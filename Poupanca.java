package exBanco;

// Contas poupança permitem saques dentro do valor do saldo
public class Poupanca extends Conta 
{    
    private double acumRendimentos;
    private double saldoFuturo;

    
    public Poupanca(String cpf, double depositoInicial)
    {
        super(cpf, depositoInicial);
    }
    
    @Override
    public void Depositar(double valor)
    {
        this.setSaldo(this.getSaldo()+valor);
    }

    @Override
    public boolean Sacar(double valor)
    {
        if(this.getSaldo()<valor)
        {
            return false;
        }else{
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
    }
    
    @Override
    public void Atualizar(double taxa)
    {
        if(this.getSaldo()>0)
        {
            this.setSaldo(this.getSaldo() * (1+(taxa/100)));
            this.acumRendimentos+=(this.getSaldo()*(taxa/100));
        }
        this.saldoFuturo=getSaldo()+this.acumRendimentos;
    }
    
    @Override
    public void FecharMes()
    {
        this.setSaldo(this.getSaldo()+acumRendimentos);
        this.acumRendimentos=0;
    }

    @Override
    public void Demonstrativo()
    {
        System.out.println("\nTipo:........................Conta Poupança");
        System.out.printf("\nCPF:.........................%s", this.getCpf());
        System.out.printf("\nSaldo:.......................%.2f", this.getSaldo());
        System.out.printf("\nRendimentos:.................%.2f", this.acumRendimentos);
        System.out.printf("\nSaldo Fut.:..................%.2f\n", this.saldoFuturo);
        System.out.println("\n----------------------------------------------\n"); 
    }

}

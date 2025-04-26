package exBanco;

// Contas correntes permitem saques que excedam o saldo e que serão tirados do Cheque Especial
// por isso não pode exceder o valor do Cheque Especial

public class Corrente extends Conta
{
    private double chequeEspc;
    private double acumJuros;
    private double saldoFuturo;


    public Corrente(String cpf, double depositoInicial, double chequeEspc)
    {
        super(cpf, depositoInicial);
        this.chequeEspc=chequeEspc;
    }

    @Override
    public void Depositar(double valor)
    {
        super.setSaldo(super.getSaldo()+valor);
    }

    @Override
    public boolean Sacar(double valor)
    {
        if(this.getSaldo()>=valor)
        {
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }else if((this.chequeEspc+this.getSaldo())>=valor){
            this.chequeEspc-=(valor-this.getSaldo());
            this.setSaldo(0);
            return true;
        }else if(valor>(this.getSaldo()+this.chequeEspc)){
            this.setSaldo(0-(valor-(this.getSaldo()+this.chequeEspc)));
            this.chequeEspc=0;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void Atualizar(double taxa)
    {
        if(this.getSaldo()<0)
        {
            this.acumJuros=(-1 * (this.getSaldo()*(taxa/100)));
        }
        this.saldoFuturo=-(Math.abs(getSaldo())+this.acumJuros);
    }

    @Override
    public void FecharMes()
    {
        this.setSaldo(this.getSaldo()-this.acumJuros);
        this.acumJuros=0;
    }

    public void AlterarLimite(double chequeEspc)
    {
        this.chequeEspc=chequeEspc;
    }

    public void Demonstrativo()
    {
        System.out.println("\nTipo:........................Conta Corrente");
        System.out.printf("\nCPF:.........................%s", this.getCpf());
        System.out.printf("\nSaldo:.......................%.2f", this.getSaldo());
        System.out.printf("\nCheque Espc.:................%.2f", this.chequeEspc);
        System.out.printf("\nAcum. Juros:.................%.2f", this.acumJuros);
        System.out.printf("\nSaldo Fut.:..................%.2f\n", this.saldoFuturo);
        System.out.println("\n----------------------------------------------\n");
    }

}



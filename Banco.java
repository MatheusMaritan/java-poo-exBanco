package exBanco;

public class Banco
{
    public static void main(String[] args)
    {
        Poupanca p1 = new Poupanca("46408498850", 15000);
        p1.Depositar(2000);
        p1.Depositar(3000);
        p1.Atualizar(10);
        //p1.FecharMes();
        p1.Demonstrativo();
        
        Corrente c1 = new Corrente("11122233344", 7500, 5000);
        c1.Depositar(4000);
        c1.Sacar(11000);
        c1.Sacar(7000);
        c1.Atualizar(15);
        //c1.FecharMes();
        c1.Demonstrativo();
    }    
}

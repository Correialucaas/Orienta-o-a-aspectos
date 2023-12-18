public class Contabancaria {
    private String tipoConta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public aspect VerificacaoSaldoAspect

    {
        pointcut verificarSaldo;
        execution(* Contabancaria.* (..))

        before():verificarSaldo(){

    }
    }

    public class Main {
        Contabancaria contaCorrente = new Contabancaria();


    contaCorrente.deposito(1000);
    contaCorrente.saque(500);
    }
}

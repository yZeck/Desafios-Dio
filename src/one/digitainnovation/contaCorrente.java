package one.digitainnovation;

public class contaCorrente extends Conta {
    public contaCorrente(Clientes1 cliente) {
        super(cliente);
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato da conta corrente===");
        super.imprimirInfosComuns();


    }
}

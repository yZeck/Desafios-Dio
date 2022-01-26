package one.digitainnovation;

public class contaPoupanca extends Conta{
    public contaPoupanca(Clientes1 cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato da conta poupança===");
        super.imprimirInfosComuns();



    }

}

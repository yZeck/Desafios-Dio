package one.digitainnovation;

public class Main {
    public static void main(String[] args) {
        Clientes1 venilton = new Clientes1();

        venilton.setNome("Venilton");
        Conta cc = new contaCorrente(venilton);
        Conta cp = new contaPoupanca(venilton);
        cc.depositar(100.00);
        cc.transferir(100.00,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

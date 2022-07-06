public class App {
    public static void main(String[] args) throws Exception {
       
        Cliente melck = new Cliente();
        melck.setName("melck");

        Conta cc1 = new ContaCorrente(melck);
        cc1.depositar(100);

        Conta cp1 = new ContaPoupanca(melck);

        cc1.transferir(10, cp1);
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
    }
}

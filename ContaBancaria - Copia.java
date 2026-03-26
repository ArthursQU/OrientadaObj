public class ContaBancaria { 
    private double saldo;
    
    public ContaBancaria() {
        saldo = 0.0;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void mostrarValor() {
        System.out.println("Saldo: " + saldo);
    }
    
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();
        
        c1.depositar(1000.0);
        c1.mostrarValor();
        
        c1.sacar(585.0);
        c1.mostrarValor();
        
        c2.depositar(2200.0);
        c2.mostrarValor();
    }
}
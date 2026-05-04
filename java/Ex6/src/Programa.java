public class Programa {
    public static void main(String[] args) {
        CalculadoraInt calc = new CalculadoraInt();
        int res;
        res = calc.somar(5, 3);
        System.out.println("Soma de 2 inteiros" + res);
        res= calc.somar(1, 2,3);
        System.out.println("Soma de 3 inteiros" + res);
    }
}

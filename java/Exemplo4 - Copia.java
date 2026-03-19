public class Exemplo4 {
	String msg;
	public Exemplo4() {
	msg = "";
	}
	public static void main (String[] args) {
		Exemplo4 e1 = new Exemplo4();
		Exemplo4 e2;
		e2=e1;
		/*
		e1.msg = "Este é um texto";
		Exemplo4 e2 = new Exemplo4() ;
		e2.msg = "Este é um texto";
		*/
		System.out.println("Comparando os objetos: ");
		System.out.println(e1.equals(e2));
	}
}
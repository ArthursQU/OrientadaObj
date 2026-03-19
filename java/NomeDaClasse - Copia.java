public class NomeDaClasse {
	private string msg;   //este é um atributo; o modificador dele é privado
	public NomeDaClasse() { //este é o construtor sem parâmetros
		msg = "valor inicial do atributo mensagem";
	}
	public void mostrarMensagem() { ///este é um método de instância
		system.out.println(msg);
	}
}
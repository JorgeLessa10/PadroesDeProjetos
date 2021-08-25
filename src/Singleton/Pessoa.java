package Singleton;

public class Pessoa {

	private static Pessoa uniqueInstance = new Pessoa();

	private Pessoa() {
	}
	
	String nome;
	String email;
	
	public static Pessoa getInstance() {
		return uniqueInstance;
	}
	
}

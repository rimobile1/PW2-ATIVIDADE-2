
public class Validar {

	public static void main(String[] args) {
		
		String CPF = "47617807627";
		
		if (Cliente.ehCPFvALIDO(CPF)== true)
			System.out.printf("%s ,CPF Valido !! \n", Cliente.imprimeCPF(CPF));
		
		else System.out.println("Erro, CPF invalido ! \n");
	}
}

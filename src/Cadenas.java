
public class Cadenas {

	public static void main(String[] args) {
		String frase="Avast antivirus. Solo con sus n�meros te puedes hacer una idea de lo bueno que es este antivirus. M�s de 150 millones de usuarios en todo el mundo (el antivirus gratuito m�s utilizado).";
		String frase_res=frase.substring(0,frase.length());
		System.out.println(frase_res);
		
		System.out.println(frase.equals(frase_res));
		System.out.println(frase.equalsIgnoreCase(frase_res));

	}

}

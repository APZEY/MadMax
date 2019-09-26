import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		
		String keyConnu ="arbe";
		Files file = new Files();
		String stringDico = "";
		
		//String keyUnknow;
		String txt = "Bubu c'est le plus fort je le trouve vraiment génial! Est-ce qu'il est réel?"
				+ "Je suis sur que ce programme va fonctionner";
		String txtCrypt;
		BrutForce result = new BrutForce();
		
		//Je crypte la chaine et stock le resultat dans un String
		Crypt crypt = new Crypt();
		txtCrypt = crypt.crypter(txt, keyConnu);
		//Je charge le dico dans une String
		stringDico = file.loadFile("C:\\Users\\utilisateur\\Desktop\\liste_francais.txt");
		//Je convertie le dico String en Arraylist
		//stringDico = stringDico.replace('\r', ' ');
		//System.out.println(stringDico);
		String[] tab = stringDico.split("  ");
		ArrayList<String> arrayDico = new ArrayList<String>(Arrays.asList(tab));
		System.out.print(arrayDico);
//	     System.out.println("Eléménts de L2:");
//	     for(String o:arrayDico)
//	      System.out.println(o);
		
		//Je suis dans le cas ou le fichier crypter à été stocker dans une variable
		//Je vais donc tenter un mot de passe avec du brut force puis essayer de voir si c'est du francais.
		result.startloop(txtCrypt, arrayDico);

	}

}

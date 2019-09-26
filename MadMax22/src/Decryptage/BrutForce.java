import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BrutForce {
	
	//String starter = "";
	
	String stringTxtDecrypt = "";
	StringBuilder string = new StringBuilder("");
	int min = 97, max = 122;
	//BrutForce brutforce = new BrutForce();
	Crypt decrypt = new Crypt();
	
	
	public void startloop(String txtcrypt, ArrayList<String> arrayDico){
		while(true) {
			string.append((char)min);
			for(int i = 0; i < string.length() - 1; i++) {
				for(int j = min; j  < max; j++) {
					string.setCharAt(i, (char) j);
					loop(i + 1, string, txtcrypt, arrayDico);
				}
			}
	
		}
	}
	
	
	public void loop(int index, StringBuilder string, String txtcrypt, ArrayList<String> arrayDico) {
		for(int i = 97; i < 123; i++) {
			string.setCharAt(index, (char) i);
			if(index < string.length() - 1)
				loop(index + 1 ,string, txtcrypt, arrayDico);
			//System.out.println(starter + string);
			//System.out.println(string);
			stringTxtDecrypt = decrypt.crypter(txtcrypt, string.toString());	//string.toString pour StringBuilder -> String"	
			System.out.println(string);
			//Convertion du décriptage en arraylist
			String[] tab = stringTxtDecrypt.split(" ");
			ArrayList<String> arrayTxtDecrypt = new ArrayList<String>(Arrays.asList(tab));
			//if((starter+string.toString()).equals(key))
			if(testCrypt(arrayTxtDecrypt, arrayDico)) {
				System.err.println("password found: " + string); // + starter + 
				System.exit(0);
			}
		}
	}
		//créer une Arraylist de mot à partir d'une string
		public ArrayList<String> textToWords(String testTxtDecrypt){
			String[] tab = testTxtDecrypt.split(" ");
		    ArrayList<String> WordArrayList = new ArrayList<String>(Arrays.asList(tab));  
			return WordArrayList;		
			}
		
		public boolean testCrypt(ArrayList<String> arrayTxtDecrypt, ArrayList<String> arrayDico) {
			double x = 0, n = 0; //x le nombre de fois ou j'ai trouver un mot du dico |||| n l'inverse (non)
			//On va comparer notre decryptage avec le contenu du dico
		     ArrayList<String> L3 = new ArrayList<String>();
		     for(String o :  arrayTxtDecrypt){
			      if(arrayDico.contains(o)) {
			    	  L3.add("1");
			    	  x = x + 1;
			      }
			      else {
			    	  L3.add("0");
			    	  n = n + 1;	      
			     }
			  }
			  System.out.println(n +" "+x);
			  System.out.println("L3 = "+L3);
			  System.out.println(arrayTxtDecrypt);
//			     System.out.println("Eléménts de decrypt:");
//			     for(String o:arrayTxtDecrypt)
//			      System.out.println(o);
//			  System.out.println(arrayDico);
			  if(x > n )
				  return true;
			return false;
		}
		     
	
//	//Fonction qui permet d'eliminer un decryptage si celui ci possede des Ascii "mémoires"
//	public boolean testCrypt(String testTxtDecrypt){
//	//testTxtDecrypt = crypter(txtcrypt, (starter+string.toString()));
//	char[] charArray = testTxtDecrypt.toCharArray();
//	System.out.println(testTxtDecrypt);
//	for(char c: charArray) {
//	    if((int)c == 125 || (int)c == 62 || c < 20)
//	    	return false;
//	}
//	return true;
//	}
}

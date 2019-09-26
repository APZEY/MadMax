
public class Crypt {

	public String crypter(String texte, String Key) {
		String chaineCryptee = "";
		
		for(int i = 0, j = 0; i < texte.length(); i++)
		{
			chaineCryptee += (char)((int)texte.charAt(i) ^ (int)Key.charAt(j));
			j++;
			
			if(j>=Key.length()) j = 0;
		}
		return chaineCryptee;
	}
	
}

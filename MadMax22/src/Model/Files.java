package Model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;


public class Files {

	private BufferedReader buf;
		
	
	public String lireFichierSimple(String path) {
		String txtFile = null;
		try{
			 buf = new BufferedReader(new FileReader(path));
			 txtFile = buf.readLine();
//			 
//			FileReader file = new FileReader(path);
//			txtFile = file.read();
			 
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return txtFile;
	}
	
	//ouvre le fichier
		 public static void OpenFile(String[] arg) throws IOException {
				JFileChooser dialogue = new JFileChooser(new File("."));
				File fichier;
	//attribuer le document ouvert à la variable fichier 			
				if (dialogue.showOpenDialog(null)== 
				    JFileChooser.APPROVE_OPTION) {
				    fichier = dialogue.getSelectedFile();
				  
				}
			}

}

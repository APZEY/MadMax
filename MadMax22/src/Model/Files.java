package Model;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Files {

		
		 public static void OpenFile(String[] arg) throws IOException {
				JFileChooser dialogue = new JFileChooser(new File("."));
				File fichier;
				
				if (dialogue.showOpenDialog(null)== 
				    JFileChooser.APPROVE_OPTION) {
				    fichier = dialogue.getSelectedFile();
				  
				}
			}

}

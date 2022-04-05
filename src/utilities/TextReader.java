/**
 * 
 */
package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Jonatan
 *
 */
public class TextReader {
	
	/**
	 * @throws IOException 
	 * 
	 */
	public static ArrayList<String> read(String path) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(new File(path)));
		ArrayList<String> temp = new ArrayList<>();
		String aux = buffer.readLine();
		while (aux != null) {
			temp.add(aux);
			aux = buffer.readLine();			
		}
		buffer.close();
		return temp;
	}
	
}

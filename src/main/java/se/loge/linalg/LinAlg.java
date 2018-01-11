package se.loge.linalg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LinAlg {
  public static void main(String args[]){
    System.out.println("Hello World, linalg");
    LinAlg obj = new LinAlg();
    System.out.println(obj.getFile("file/MVA_DATA.txt"));
    
  }
  
  private String getFile(String fileName) {
	  
	  StringBuilder result = new StringBuilder("");

		//Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.toString();
	  
  }
  
  
  
  
}

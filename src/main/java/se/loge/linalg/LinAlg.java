package se.loge.linalg;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

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
		InputStream stream = classLoader.getResourceAsStream(fileName);
		InputStreamReader streamReader = new InputStreamReader(stream);
		BufferedReader reader = new BufferedReader(streamReader);
		
		Iterable<CSVRecord> records = null;
		
		try {
			records = CSVFormat.TDF.parse(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		int numberColumns = records.iterator().next().size();
		
		for (CSVRecord record : records) {
			for(int i = 0; i < numberColumns; i++) {
				System.out.println(record.get(i));
			}
			
		}

		Scanner scanner = new Scanner(reader);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			result.append(line).append("\n");
		}

		scanner.close();


		return result.toString();
	  
  }
  
  
  
  
}

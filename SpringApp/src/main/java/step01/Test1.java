package step01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Test1 {

	public int task1(int a, int b) {
	    return a + b;
	}

	public int task2(int a, int b) {
	    int sum = a  + b;
	    return sum;
	}
	
	public void printData(List<String> data) {
	    if (data != null && !data.isEmpty()) {
	        for (String value : data) {
	            System.out.println(value);
	        }
	    }
	}
	
	public String readFile(String filePath) throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader(filePath));
	    StringBuilder content = new StringBuilder();
	    String line;
	    while ((line = reader.readLine()) != null) {
	        content.append(line);
	    }
	    return content.toString();
	}
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Extract {

public static void main(String[] args)
{
    
	
	String filePath = "D:\\Covid_19 Drug Repurposing\\Procyanidin2.txt";
	
    BufferedReader br; String line = "";
	    String split= "";
	
	
	int count=0;
	 
    try {    br = new BufferedReader(new FileReader(filePath));
		
		

   try {       while((line = br.readLine()) != null)        { 
				
				//System.out.println(line);
Pattern reu = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)", Pattern.MULTILINE | Pattern.COMMENTS);
Matcher reMatcher = reu.matcher(line);
while (reMatcher.find()) {
    if(reMatcher.group().contains("<aquaporin>"))
	System.out.println(reMatcher.group());
}
								  
			} 
		
																
												
					 br.close();

				}									       
		
		   catch (IOException e) {       // TODO Auto-generated catch block       e.printStackTrace();
								}
		
   
    
    } catch (FileNotFoundException e) {   // TODO Auto-generated catch block   e.printStackTrace();
									  }

}
}
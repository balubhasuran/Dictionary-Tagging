import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class PatternExtract {

public static void main(String[] args)
{
    
	
   String filePath = "D:\\Covid_19 Drug Repurposing\\Last1.txt";
    
	
    BufferedReader br; String line = "";
	    String split= "";
	
	
	
	 

    try {    br = new BufferedReader(new FileReader(filePath));
		
		

   try {       while((line = br.readLine()) != null)        {            
				
				int count=0;
				ArrayList<String> list = new ArrayList<String>();
				Pattern re = Pattern.compile("<aquaporin>(.*?)</aquaporin>");
								Matcher reMatcher = re.matcher(line);
								while(reMatcher.find()) {
								    count++;
			                         String protein= reMatcher.group(1).trim();    
							         if(!list.contains(protein))
									    list.add(protein);
							  
								}
								if(count>=2)
								{
								for(String abs:list)
								{
								System.out.print(abs+"\t");
								}
				System.out.println();	
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
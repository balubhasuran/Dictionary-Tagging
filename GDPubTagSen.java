import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class GDPubTagSen {

public static void main(String[] args)
{
    String filePath = "F:\\Eutag.txt";
	BufferedReader br;
    String line = "";
	

    try {
         br = new BufferedReader(new FileReader(filePath));
		
	        try {
            while((line = br.readLine()) != null)
             {
			
              String [] result =line.split("\t");
			  String [] sent =result[1].split("\\s(?=\\{)|(?<=\\})\\s");
              String[]gene=result[3].split("|");;
			  String[]disease=result[2].split("|");;
			  
					  for(String str:sent)
					  {
                        
						    String(String genes:gene)
							{
							String findMe=genes;
							genes="<Gene>"+genes+"</Gene>";
							String pat="(?i)\\b"+findMe+"\\b";
						
							Pattern res = Pattern.compile(pat);
							Matcher reMatchers = res.matcher(str);
								if(reMatchers.find()) {
			                              
							  
							   str= str.replaceAll(pat,genes);
							}	
							}
							String(String diseases:disease)
							{
						String findMe=diseases;
							diseases="<Disease>"+diseases+"</Disease>";
							String pat="(?i)\\b"+findMe+"\\b";
						
							Pattern res = Pattern.compile(pat);
							Matcher reMatchers = res.matcher(str);
								if(reMatchers.find()) {
			                              
							  
							   str= str.replaceAll(pat,diseases);
															}
						}
						if(str.contains("<Gene>")&& str.contains("<Disease>"))
						{
								System.out.println(result[0]+"\t"+result[2]+"\t"+result[3]+"\t"+str);
								
						}
				
				}									
            
			 br.close();
			
		
        } catch (IOException e) {
            
            e.printStackTrace();
								}
		
   
    
    } catch (FileNotFoundException e) {
       
        e.printStackTrace();
									  }

  }
}
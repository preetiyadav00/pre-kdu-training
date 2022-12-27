
import java.io.*;

import java.util.*;
import java.util.stream.Collectors;

public class prg3 {
   
   
   public static void read(String csvFile) {

      HashMap<String,Integer>mp=new HashMap<>();    
      
      try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String[] tempArr; //string array
         while((line = br.readLine()) != null) {   //line by line reader till file is empty
            
            tempArr = line.split(",");
            for(String s: tempArr) {
               if(mp.containsKey(s))
               {
                  mp.put(s,mp.get(s)+1);
               }
               else
               {
                  mp.put(s,1);
               }
            }
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }

         //mp.forEach((k,v)->System.out.println(k+" "+v));

         List<String> keys = mp.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
        
         
         for(int i=0;i<keys.size();i++)
         {
            System.out.println(keys.get(i));
         }
         

   }
   public static void main(String[] args) {
      // csv file to read
      String csvFile = "input.csv";
      prg3.read(csvFile);
   }
}
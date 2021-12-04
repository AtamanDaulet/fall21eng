package day33maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapsPractice01 {
	 /*
    Type code to print non-repeated elements from an Array
    String s[] = {"A", "Z", "A", "K", "T", "K"};  ==> You will print just "Z" and "T"
  */
	public static void main(String[] args) {
		
		String[] strArr = {"A","Z","A","K", "T", "K"};
		// my code
		/*
		 HashMap<String, Integer> hm1 = new HashMap<>();
		 
		 for (String s : strArr) {
			
			 Integer count = hm1.getOrDefault(s, 0);
			 hm1.put(s, ++count);
		}
		 System.out.println(hm1);
		 
		 for (String key : hm1.keySet()) {
			
			 int accur = hm1.get(key);
			 if(accur == 1) {
				 System.out.println(key +"="+accur);
			 }
		}*/
		
		// 2 way
		
		 String s[] = {"A", "Z", "A", "K", "T", "K"};
		 
		HashMap<String, Integer> resultMap = new HashMap<>();
        
        for(String w : s) {
            
            Integer numOfOccurences = resultMap.get(w);
            
            if(numOfOccurences==null) {
                resultMap.put(w, 1);
            }else {
                resultMap.put(w, numOfOccurences+1);
            }
    
        }
        
        System.out.println(resultMap);//{A=2, T=1, Z=1, K=2}
        
        for(Entry<String, Integer> w : resultMap.entrySet()) {
            
            if(w.getValue()==1) {
                
                System.out.println(w.getKey());                
            }            
        }
		
		 
	}

}

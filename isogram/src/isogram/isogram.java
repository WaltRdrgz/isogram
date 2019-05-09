package isogram;

public class isogram {
    public static boolean  isIsogram(String str) {
 
        int l = str.length();
        
        String nstr = str.toLowerCase();
        
        for(int i = 0; i < l; i++){
            for(int j = i + 1; j < l; j++){
                      if(nstr.charAt(i)==nstr.charAt(j)){
                        return false;
                      }            
            }     
        }     
        return true;
    } 
}
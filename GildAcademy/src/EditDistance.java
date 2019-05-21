import java.util.HashMap;

public class EditDistance {
	 static HashMap<String,Integer> map= new HashMap();
public static void main(String[] args) {
	String word1="horse";
	String word2="ros";
	
	System.out.println(minDistance(word1,word2));
}
public static int  minDistance(String word1, String word2) {
	// TODO Auto-generated method stub
	
	char []a= word1.toCharArray();
    char []b = word2.toCharArray();
    int m= a.length-1;
    int n=b.length-1;
    return helper(a,b,m,n);
	
}
public static int  helper(char[] a, char[] b, int i, int j) {
	// TODO Auto-generated method stub
	 String key=Integer.toString(i)+":"+Integer.toString(j);
     
     if(map.containsKey(key)){
         return map.get(key);
     }
     if(i<0){
         return j;
     }
     
     if(j<0){
         return i;
     }
    
     
     if(map.containsKey(key)){
         return map.get(key);
     }
       if(a[i]==a[j]){
        int val= helper(a,b,i-1,j-1);
         map.put(key,val);
       return val;
     }
     else{
          int ins= 1+helper(a,b,i,j-1);
          int del= 1+helper(a,b,i-1,j);
          int rev= 1+helper(a,b,i-1,j-1);
          int sol= min(ins,del,rev);
          map.put(key,sol);
     
          return sol;
      
     }
            
}
public static int min(int a, int b, int c) {
	 if(a<=b&& a<=c) return a;
     if(b<=a && b<=c) return b;
      return c;
}

}

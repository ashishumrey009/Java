import java.io.IOException;
import java.util.Stack;

public class ParenthesesScore {
	public static void main(String[] args) throws IOException {

		String s = "()";
		int ret = longestValidParentheses(s);

		System.out.print(ret);
	}

	private static int longestValidParentheses(String s) {
			Stack<Character> stack = new Stack<>();
	       
	        int count = 1;
	        for (int i = 0; i < s.length(); i++){
	            if (s.charAt(i) == '('){
	                stack.push(s.charAt(i));
	            }
	            else{
	            	 if (!stack.isEmpty()){
	                     stack.pop();
	                     
	                     
	                 }
	                 if (stack.isEmpty()){
	                     //stack.push(i);
	                     count=count*2;
	                     
	                 }
	                 
	               
	            }
	           
	       
	        
	        
	        }
			return count;
	        
	 }
}
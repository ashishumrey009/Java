import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


   


public class MainClass {
   
    
    public static void main(String[] args) throws IOException {
       
           String s="))()";
            int ret = longestValidParentheses(s);
            
            
            
            System.out.print(ret);
        }

	private static int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                
                if (!stack.isEmpty()){
                    stack.pop();
                    
                }
                if (stack.isEmpty()){
                    stack.push(i);
                    
                }
            }
            max = Math.max(max, i-stack.peek());
             
        }
        
        return max;
	}
    }

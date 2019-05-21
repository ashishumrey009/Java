
public class StackArray {
	 private Object [] objArray;
	    private int stackSize;

	    public StackArray(){
	        objArray = new Object[50];
	        stackSize = 0;
	    }

	    public StackArray(int size){
	        objArray = new Object[size];
	        stackSize = 0;
	    }

	   
	    public void push(Object o){
	        if(stackSize < objArray.length){
	            objArray[stackSize] = o;
	            stackSize ++;
	        }else{
	            System.out.println("Stack Overflow");
	        }
	    }

	    public Object pop(){
	        if(stackSize != 0){
	            stackSize--;
	            return(objArray[stackSize]);
	        }else{
	        	System.out.println("Stack underflow");
	        	return -1;
	        }
	    }

	    public Object top(){
	        if(stackSize != 0){
	            return(objArray[stackSize-1]);
	        }else{
	        	System.out.println("Stack Overflow");
	        	return -1;
	        }
	    }
	    
	    public void printvalues() {
	    	for(int i=0;i<stackSize;i++) {
	    		System.out.println(objArray[i]);
	    	}
	    	
	    }

	    public boolean empty(){
	        return (stackSize == 0);
	    }

	    public void clear(){
	        stackSize = 0;
	    }
	    
	    
	    public static void main(String args[]) {
	    	StackArray stk = new StackArray();
	    	stk.push(1);
	    	stk.push(2);
	    	stk.printvalues();
	    	stk.pop();
	    	stk.printvalues();
	    }
	}





import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.RequestingUserName;

public class SumNumber {
	static HashMap<String, Integer> map=  new HashMap();
public static void main(String[] args) {
	int a[]= {1,2,4};
	int len=a.length-1;
	
	System.out.println(count(a,len,5));
	
}

public  static int count(int[] a, int len, int n) {

if(len<0)
	return 0;

if (n<0)
	return 0;
if(n==1)
	return 1;


//return count(a,len-1,n)+count(a,len,n-a[len]);
//String key=String.valueOf(len-1)+":"+String.valueOf(n);
//if(!map.containsKey(key)) {
//	map.put(key, count(a,len-1,n));
//}
//
//String key1=String.valueOf(len)+":"+String.valueOf(n-a[len]);
//{
//	if(!map.containsKey(key)) {
//		map.put(key, count(a,len,n-a[len]));
//	}
//
//
//}
//return count(a,len-1,n)+count(a,len,n-a[len]);

if(!map.containsKey(""+len+n)) {
	System.out.println(len+""+n);
	map.put(""+len+n, count(a, len-1, n)+count(a, len, n-a[len]));
	
}
for(Map.Entry<String,Integer> entry:map.entrySet()) {
	System.out.println(entry.getKey()+"   "+entry.getValue());
}
return map.get(""+len+n);
//String key= ""+(len-1)+n;
//
//if(!map.containsKey(key)) {
//	map.put(key, count(a,len,n-a[len]));
//}
//
//String key1=""+(len)+(n-a[len]);
//if(!map.containsKey(key1)) {
//	map.put(key1,count(a, len, n-a[len]));
//}
//
//return map.get(""+len+n);
}

}

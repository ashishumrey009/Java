
public class CircularTour {

	public static void main(String[] args) {
		int [] petrol = { 4,6,7,3 };
        int [] dist = { 6,5,3,5 };
        
        int r= calculatetour(petrol,dist);
        System.out.println(r);
	}

	private static int calculatetour(int[] petrol, int[] dist) {
		// TODO Auto-generated method stub
		int start = 0, diff = 0, cac = 0;
	    for(int i = 0; i < petrol.length; i++){
	        cac += petrol[i] - dist[i];
	        if(cac < 0){
	            start = i + 1;
	            diff += cac;
	            cac = 0;
	        }
	    }
	    return (cac + diff > 0) ? start : -1;
    }
		
	}


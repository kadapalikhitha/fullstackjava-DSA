public class Selection{
	public static void main(String[] args) {
	    int[] a = {5 , 6 , 8 , 7 , 4 , 9 };
	    
	    for (int i = 0; i < a.length ; i++){
	        int min = i;
	        for(int j = i; j < a.length ; j++){
	            if (a[j] < a [min]){
	                min = j;
	            }
	                int temp = a[i];
	                a[i] = a [min];
	                a[min] = temp;
	            }
	        }
	    for(int b:a){
		System.out.println(b);
	}
}
}


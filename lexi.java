public class lexi{
    static void lexicographical(int current , int n){
        if(current > n){
            return;
        }
            System.out.println(current + " ");
            
        for(int i = 0; i <= 9; i ++){
            int next = current * 10 + i;
            if(next > n){
                return;
            }
            lexicographical(next , n);
        }
    }
	public static void main(String[] args) {
	    int n = 13;
	    for(int i = 1; i <= 9; i ++){
	        lexicographical(i , n);
	    }
	}
}
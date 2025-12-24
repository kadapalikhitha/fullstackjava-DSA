public class prob3{
    static void Towerofhanioi(int n , char source , char helper , char destination){
        if(n == 1){
            System.out.println(" move the 1 from" + source + " to " + destination);
            return;
        }
        Towerofhanioi(n - 1 , source , destination , helper);
        System.out.println(" move the" + n + " from " + source + " to " + destination);
        Towerofhanioi(n - 1 , helper , source , destination);
    }
	public static void main(String[] args) {
	    int n = 3;
	    Towerofhanioi(n , 'A' , 'B' , 'c');
		
	}
}

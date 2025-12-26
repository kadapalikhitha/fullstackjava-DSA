import java.util.*;
  public class comsum2{
    static void combination (int[]a , int index ,  int target , String p){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = index ; i < a.length ; i++){
            if(i > index && a[i] == a[i - 1]){
           continue; 
        }
        if(a[i] > target){
            break;
        }
        combination(a , index + 1 , target - a[i] , p + a[i] + " , " );
        }

    }
    public static void main (String[] args){
        int[] a = {3 , 4 , 5 , 6 , 7 , 2};
        Arrays.sort(a);
        combination(a , 0 , 7 , " ");
    }
}

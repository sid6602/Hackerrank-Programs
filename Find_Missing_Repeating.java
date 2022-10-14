
import java.util.*;
public class Find_Missing_Repeating {
	public static void main(String[] args) {
		int arr[] = {2,2};
        int a[] = new int[2];
        int duplicate = 0,miss=0;
        long sum =0,sum1=0;
        int n = arr.length;
        sum =  (n*(n+1))/2;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                duplicate = arr[i];
                
            }
        }
        for(Integer w: set){
            sum1+=w;
        }
        miss = (int) ((Long) sum-sum1);
        a[0] = duplicate;
        a[1] = miss;
        System.out.println(Arrays.toString(a));
	}
}

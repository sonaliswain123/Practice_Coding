import java.util.*;
public class May3Prob2 {
    public static void main(String args[]){
        int arr[]={7, 3, 2, 4, 9, 12, 56};
        int m=5,n=arr.length;
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;

        for(int i=0;i<n-m+1;i++){
            int maximum_val=arr[i+m-1];
            int minimum_val=arr[i];
            res=Math.min(res,maximum_val-minimum_val);

        }
        System.out.println(res);
    }
}

import java.lang.Math;
public class May1_Problem4 {
    public static void main(String[] args) {
        int arr[]={-1,5,-6,7,8};
        int n=arr.length;
        int Max_Value=0;
        for(int start =0;start<n;start++){  //outer loop
            int current_max=0;
            for(int end=start;end<n;end++){
                current_max=current_max+arr[end];
                Max_Value=Math.max(current_max,Max_Value);
                
            }
            
        }
        System.out.println("Maximum value :"+ Max_Value);
    }
}

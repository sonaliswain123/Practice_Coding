import java.util.Arrays;

public class May1_Problem2 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

        
    }
}

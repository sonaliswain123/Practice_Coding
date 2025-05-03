public class May1_Problem3 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};
        int n=arr.length;
        for(int start =0;start<n;start++){  //outer loop
            for(int end=start;end<n;end++){
                for(int i=start;i<=end;i++){
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

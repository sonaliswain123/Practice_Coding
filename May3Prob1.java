public class May3Prob1 {
    public static void main(String[] args) {
        int arr[]={3,2,1,1};
        boolean res=false;
        for(int start=0;start<arr.length;start++){
            for(int end=start+1;end<arr.length;end++){
                if(arr[start]==arr[end]){
                  res=true;
                  break;  
                    
                }
            }
        }
        System.out.println(res);
    }
}

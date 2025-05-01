class problem1{
    public static void main(String args[]){
        int arr[]={14,12,100,23,10};
        //let max and min as the first element of an array
        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value of this array is :"+ max);

        for(int j=1;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println("Minimum value of this array is :"+ min);

    }
}
class SumEvenNoinArrayList {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,9,7,6,5,3,4,20,40,50,100};
        int sum = 0;

        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
    System.out.println("Sum of all Even No in Array is: "+sum);
    }
}
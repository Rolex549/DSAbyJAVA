import java.util.Scanner;
public class sorting{
    public static void main(String[] args) {
        int [] arr = new  int[10];
         System.out.println("enter 10 numbers");
         Scanner sc = new Scanner(System.in);
        for(int i= 0; i<10; i++){
             arr[i] =sc.nextInt();
        }

        //Bubble sort
        // for(int i= 0; i< arr.length-1 ; i++){
        //     for( int j =0; j<arr.length-i-1 ; j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp =arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }



        // selection sort
        // for (int i = 0; i <10; i++) {
        //     int smallest = arr[i];
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[j] < smallest){
        //             smallest = arr[j];
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        // }

        //     }
        //     }

 for (int i = 0; i < arr.length; i++) {
                int current = arr[i];
                int j = i-1;
                while( j>=0 && current < arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }

        //printing sorted array
        for (int i=0 ;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }







       
            }
}
import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        
        int[] array = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i=0; i<5 ; i++ ){
            array[i] = sc.nextInt();
        }

        
        System.out.println("enter your desired number");
        int num = sc.nextInt();
        int count = 1;
        for(int i =0 ; i<5 ; i++){
            
            if(array[i] == num){
                System.out.println("Number found at index : "+ count);
                break;
            }
            else{
                if(count < 5){
                   count++;
                }
                else{
                    System.out.println("Number not found");
                    break;
                }
            }
        }
        

    }
}
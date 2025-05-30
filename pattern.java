public class pattern{

    public static void main(String[] args) {
        // int n = 8;
        // int m = 8;



//rectangle pattern
        //outer loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop
        //     for (int j = 1; j <= m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }



//hollow rectangle pattern
       //outer loop
    //     for (int i = 1; i <= n; i++) {
    //         //inner loop
    //         for(int j = 1; j <= m; j++){
    //             if(i == 1 || j == 1 || i == n|| j==m){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.print("\n");
            
    //     }

    //Right angle triangle pattern

    //  for (int i = 1; i < n; i++) {
    //     //inner loop
    //     for(int j =1; j <= m ; j++){
    //         if(j<= i){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.print("\n");
    //  }



//inverted half pyramid pattern

int n = 5;
 for (int i = n; i >= 1; i--) {
        //inner loop
        for(int j =1; j <= i ; j++){
           
                System.out.print("*");
            }
            System.out.print("\n");
          
        }
      
     









    }


}
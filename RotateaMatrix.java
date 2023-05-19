
 import java.util.*;

public class RotateaMatrix{
    
    public static void main(String[]args){
        int arr[][] = {{3,2,1}
                      ,{4,5,6}
                      ,{7,8,9}};
        int n=arr[0].length;//no of coulm 
        int m = arr.length;// no of rows no of 1d array
        System.out.println(arr.length);
        System.out.println("arr[0].length");

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = arr[i][j];
                 arr[i][j] =arr[j][i];
                 arr[j][i] = temp;
            }
        }
        //swaping coulums 
        for(int i=0;i<m;i++){
           int fi = 0;
            int li  = n-1;
            int temp;
            while(fi<li){
                temp = arr[i][fi];
                arr[i][fi]= arr[i][li];
                arr[i][li]= temp;
            }      
        }
        // printing
        for(int x []: arr){
            for(int y:x){
            System.out.print(y);
            }
            System.out.println();
        }

    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
}
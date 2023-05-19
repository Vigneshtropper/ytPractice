import java.util.*;
public class arrSort{
    public static void main(String[]args){
        int [] arr= {1,5,-2,8,-6,1,7,6,3,5,8,-88,5,-7,5,45,6,-5,0,4,-9,9};
        Arrays.sort(arr);
        for(int x: arr){
            System.out.print(x+",");
        }
    }
}
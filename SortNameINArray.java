import java.util.Scanner;
public class SortNameINArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of the array ");
        int n = sc.nextInt();
        int i ;
        String temp;
            String[]array =new String[n];
            System.out.println("Enter the elements of array");
            for( i=0;i<n;i++){
                array[i] = sc.next();
            }
            // shorting the array lexicographically Dictionary  based 
            for(i =0;i<n;i++){
                for(int j=i+1;j<n;j++){ 
                    if(array[i].compareTo(array[j])>0); {
                     temp = array[i];
                     array[i] =array[j];
                     array[j] = temp;

                    }                                
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Here we have Shorted array ");
            for(String s:array){
            System.out.println(s);}

    }
}
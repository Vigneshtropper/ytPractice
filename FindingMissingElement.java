public class FindingMissingElement {
    public static void main(String[]args){
        int sum = 0;
       
        int a[] = {1,2,3,4,5,6,7,9};
        int l = a.length;

        int SumOfNaturlNo = ((l+1)*(l+2))/2;
        for(int x:a){
            sum += x;
        }

        System.out.println("Missing no is = " +( SumOfNaturlNo-sum));
        
    }
}

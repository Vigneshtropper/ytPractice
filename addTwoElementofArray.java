import java.util.Scanner;

class sum{
    public int sumarr(int arr[][],int r1,int c1,int r2 , int c2 ){
        int sum = 0;
        for(int i=r1;i<r2;i++){
            for(int j =c1;j<c2;j++){
                sum += arr[i][j];
            }

        } 
        return sum;
    } 
}

public class addTwoElementofArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row from where you want addition ");
        int r1 = sc.nexttInt();
        System.out.println("Enter Coulmn from where you want addition ");
        int c1 = sc.nextInt();
        System.out.println("Enter row  where to u want sum  ");
        int r2 = sc.nextInt();
        System.out.println("Enter coulmn where to u want sum ");
        int c2 = sc.nextInt();
     
        int arr []={{1,1,1,1},
                    {1,1,1,1},
                    {1,1,1,1},
                    {1,1,1,}};    

                    
        sum s1 = new sum();
        int result =  s1.sumarr(arr , r1, c1, r2, c2);
        System.out.println(result);
}
}
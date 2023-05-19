    public  class DuplicateElement{
    public static void main(String[]args){
        int []a = {1,23,4,5,6,7,8,9};
         int i ;
         boolean flag = true;
        for(i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate element is "+ a[i]);
                  flag=false;
                }

            }}
            if(flag== true ){System.out.println("No Duplicate Exist  ");}
        }
}
import java.util.*;
class sort{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        String arr[]=new String[n];
        System.out.println("enter the strings : ");
        for(int i=0;i<n;i++){
            arr[i]=s.next();
        }
        Arrays.sort(arr);
        System.out.println("sorted string is ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
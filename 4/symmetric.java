import java.util.Scanner;
public class symmetric {
    public static void main(String []args){
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row");
        r=sc.nextInt();
        System.out.println("enter the number of cols");
        c=sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("enter the number ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean issym=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]!=arr[j][i]){
                    issym=false;
                    break;
                }
            }
            if(!issym) break;
        }
        if(issym){
            System.out.println("sym");
        }
        else{
            System.out.println("not sym");
        }
        }
}

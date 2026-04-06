package Arithmetic;

interface int_arith{
    public float add(int a,int b);
    public float sub(int a ,int b);
    public float mul(int a,int b);
    public float div(int a ,int b);
}
public class oprtn implements int_arith{
    public float add(int a,int b){
        return a+b;
    } 
        public float sub(int a,int b){
        return a-b;
    } 
        public float mul(int a,int b){
        return a*b;
    } 
        public float div(int a,int b){
        return a/b;
    } 

}
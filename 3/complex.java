class complex{
    int real;
    int img;
    
complex(int r,int i){
    real=r;
    img=i;
}
public static void main( String []args){
    complex c1=new complex(2,4);
    complex c2=new complex(4,5);
    int realsum=c1.real+c2.real;
    int imgsun=c1.img+c2.img;
    System.out.println("the sum is "+realsum+"+"+imgsun+"i");
}
}
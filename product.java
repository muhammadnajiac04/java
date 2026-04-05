public class product{
    int pcode;
    String pname;
    int price;
    
    product(int c, String b, int p){
        pcode=c;
        pname=b;
        price=p;
    }
    public static void main(String []args){
        product p1= new product(1,"laptop",1000);
        product p2=new product(2,"pc",2000);
        product p3=new product(3,"phone",3000);
        if (p2.price<p1.price && p2.price<p3.price){
        System.out.println("lowest price is "+p2.pname);}
        else if(p3.price<p1.price && p3.price<p2.price){
        System.out.println("lowest price is "+p3.pname);}
        else{
        System.out.println("lowest price is "+p1.pname +"with price"+p1.price);     }  
    } 
    
}

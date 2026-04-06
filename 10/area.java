public class area{
    public double area(double r){
        return Math.PI*r*r;
    }
    public double area(int l,int b){
        return l*b;
    }
    public static void main(String []args){
        area obj=new area();
        System.out.println(obj.area(3));

    }
}

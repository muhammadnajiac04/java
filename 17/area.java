interface interGraph{
    int rec(int l, int b);
    double tri(int b,int h);
    float sqr(int a);
    double cir(int r);
}
public class area implements interGraph{
    public int rec(int l, int b){
        return l*b;
    } 
        public double tri(int b, int h) {
        return 0.5 * b * h;
    }

    public float sqr(int a) {
        return a * a;
    }

    public double cir(int r) {
        return Math.PI * r * r;
    } 
}
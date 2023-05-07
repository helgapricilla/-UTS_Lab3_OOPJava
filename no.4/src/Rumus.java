public class Rumus {
    private int n, r;
    private double m,v;
    public Rumus(int n, int r) {
        this.n = n;
        this.r = r;
    }
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public int permutasi(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public Rumus (double m, double v){
        this.m = m;
        this.v = v;
    }
    public double rho(double m, double v){
        return m/v;
    }
}

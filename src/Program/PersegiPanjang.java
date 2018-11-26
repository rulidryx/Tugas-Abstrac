
package Program;

public class PersegiPanjang implements BangunDatar{

    private int p;
    private int l;
    private String Luas;
    private String Keliling;

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    
    @Override
    public void luas() {
        float luas= p*l;
        System.out.println("Luas Persegi Panjang: " +Luas); 
    }

    @Override
    public void keliling() {
        float keliling = 2*(p+l);
        System.out.println("Keliling Persegi Panjang: " +Keliling);
    } 
}

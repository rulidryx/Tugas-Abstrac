package Program;

public class Lingkaran implements BangunDatar {
    private int r;
    private double phi = 3.14;
    private String Luas;
    private String Keliling;

    public Lingkaran(int r) {
        this.r = r;
    }

 
    
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double Phi) {
        this.phi = phi;
    }
    
    @Override
    public void luas() {
        double luas= phi*r*r;
        System.out.println("Luas Lingkaran: " +Luas); 
    }

    @Override
    public void keliling() {
        double keliling = 2*phi*r;
        System.out.println("Keliling Lingkaran: " +Keliling);
    } 

}


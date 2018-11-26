package Program;


public class Persegi implements BangunDatar{
    private int s;
    private String Luas;
    private String Keliling;

    public Persegi(int s) {
        this.s = s;
        
    }
    
    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    @Override
    public void luas() {
        float luas= s*s;
        System.out.println("Luas Persegi: " +Luas); 
    }

    @Override
    public void keliling() {
         float keliling = 4*s;
        System.out.println("Keliling Persegi: " +Keliling);
    } 

}

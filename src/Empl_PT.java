/**
 * Created by toshiba on 13/11/2016.
 */
public class Empl_PT extends Employe {
    private double Prime;
    public Empl_PT() {
        super();
        Prime=0;
    }
    public Empl_PT(String N,String F,double SS){
        super(N,F,SS);
        this.Prime=0;
    }
    public double getSalaire(){
        return super.getSalaire();
    }
    public double setSalaier(){
        return super.getSalaire();
    }
    public void setPrime(double p){
        this.Prime=p;
    }
    public double getPrime(){
        return Prime;
    }
    public void setSalaire(double s){
        super.setSalaire((s*4)+getPrime());
    }
    public void Cheque(){
        super.Cheque();
    }

}

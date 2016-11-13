/**
 * Created by toshiba on 13/11/2016.
 */
public class Empl_TPT extends Employe {
    private int Heures;
    public Empl_TPT() {
        super();
        this.Heures=0;
    }
    public Empl_TPT(String N,String F,double SH,int Heures){
        super(N,F,SH);
        this.Heures=Heures;
    }
    public double getSalaire(){
        return super.getSalaire();
    }
    public void setHeures(int H){
        this.Heures=H;
    }
    public int getHeures(){
        return Heures;
    }
    public void setSalaire(double s){
        super.setSalaire(s*getHeures());
    }
    public void Cheque(){
        super.Cheque();
    }

}

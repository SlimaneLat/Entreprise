/**
 * Created by toshiba on 13/11/2016.
 */
public class Employe {
    protected String Name,Fonction;
    protected double Salaire ;
    public Employe(){
        this.Fonction=this.Name=null;
        this.Salaire=0.0;
    }
    public Employe(String N,String F,double S) {
        this.Name=N;
        this.Fonction=F;
        this.Salaire=S;
    }
    public String getName(){
        return Name;
    }
    public String getFonction(){
        return Fonction;
    }
    public double getSalaire(){
        return Salaire;
    }
    public void setName(String N){
        this.Name=N;
    }
    public void setFonction(String F){
        this.Fonction=F;
    }
    public void setSalaire(double S){
        this.Salaire=S;
    }
    public void Cheque(){
        System.out.println("Payer à l'ordre de"+getName()+"("+getFonction()+")"+"***"+getSalaire());
    }
}

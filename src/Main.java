/**
 * Created by toshiba on 13/11/2016.
 */
import java.util.Scanner;
public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        String inS;
        double inI;
        int inIH;
        Employe Tab[]=new Employe[3];
               Employe Tab[]= new Employe[3];
      
        Tab[0] = new Employe();

        Tab[1] = new Empl_PT();
        Tab[2] = new Empl_TPT();

        for(int i=0;i<3;i++){
            System.out.println("SVP donnez le nom de votre Employe");
            inS = s.nextLine();
            Tab[i].setName(inS);
            System.out.println("SVP donnez la Fonction de Votre Employe");
            inS = s.nextLine();
            Tab[i].setFonction(inS);

        }
        System.out.println("SVP donnez une Prime pour MRS "+Tab[1].getName()+"s'il métite Bien sur XD");
        inI = s.nextDouble();
        ((Empl_PT) Tab[1]).setPrime(inI);
        System.out.println("SVP donnez les Sommet d'heures de travaille pour MRS "+Tab[2].getName());
        inIH = s.nextInt();
        ((Empl_TPT) Tab[2]).setHeures(inIH);
        for(int i = 0;i<3;i++){
            System.out.println("SVP donnez le Salaire de Base de Votre Employe");
            inI = s.nextDouble();
            Tab[i].setSalaire(i);
        }
        for(int i=0;i<3;i++){
            Tab[i].Cheque();
        }
    }

}

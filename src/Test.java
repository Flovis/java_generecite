import java.util.*;


public class Test {
    public static void main( String[] args ) {

        //On instancie la classe humain
        //En determinant le type d'entree qui est  un string et int(generecite)
        //et en donnant des valeur au constructeur

        Humain <String, Integer> personne1 = new Humain<>("Flo", 12);
        Humain <String, Integer> personne2 = new Humain<>("personne1",25);
        Humain <String, Integer> personne3 = new Humain<>("personne2",35);
        Humain <String, Integer> personne4 = new Humain<>("personne3",45);


        //on implemente Hashtable et on lui donne egalement le type des valeurs

        Hashtable<Integer, String> table= new Hashtable<Integer, String>();

       //on remplie la table cle et valeur
       table.put(personne1.getAge(),personne1.getNom());
       table.put(personne2.getAge(), personne2.getNom());
       table.put(personne3.getAge(), personne3.getNom());
       table.put(personne4.getAge(), personne4.getNom());


        //on utilise itterrator pour afficher
        Iterator<Map.Entry<Integer, String>> itr = table.entrySet().iterator();
        Map.Entry<Integer, String> entry = null;
        while(itr.hasNext()){
            entry = itr.next();
            System.out.println( entry.getValue() + " à " + entry.getKey() + " ans" );
        }
    }
}

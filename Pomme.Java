/**
 *
 * @author roudet
 */
public class Pomme {
    private double prix;
    private String origine;
	
    public Pomme() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Pomme(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Pomme de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Pommes sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Pomme or = (Pomme) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Pomme a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Pomme");
	Pomme o = new Pomme(1.5,"France");
	System.out.println(o.toString());
	System.out.println();
	Pomme o1 = new Pomme(1.2,"Luxembourg");
	if(o1.equals(o)){
		System.out.print(o1.toString());
		System.out.print(" et ");
		System.out.print(o.toString());
		System.out.println(" ont les mêmes prix");
	}else{
		System.out.print(o1.toString());
		System.out.print(" et ");
		System.out.print(o.toString());
		System.out.println(" ont des prix differents");
	}
   }
}

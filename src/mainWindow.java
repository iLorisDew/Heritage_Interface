import com.heritage_interface.comportement.*;

public class mainWindow 
{

	public static void main(String[] args) 
	{
		Guerrier rifflouz = new Guerrier();
		System.out.println("************************************");
		
		rifflouz.setNom("Sergent Rifflouz");
		System.out.println(rifflouz.toString());
		rifflouz.seDeplacer();
		rifflouz.soigner();
		rifflouz.combattre();
		System.out.print("Changement d'arme et de statut combattant.");
		rifflouz.setEspritCombatif(new CombatCouteau());
		rifflouz.combattre();
		System.out.println("************************************");
		System.out.println("");
		System.out.println("************************************");
		
		Medecin crocro = new Medecin();
		crocro.setNom("Doc Crocro.");
		System.out.println("Instance de la classe: "+crocro.getClass().getName());
		System.out.println("Je m'appelle "+crocro.toString()+".");
		crocro.seDeplacer();
		crocro.combattre();
		crocro.soigner();
		System.out.print("Changement de statut de médecin, je suis devenu un chirurgien.");
		System.out.println("");
		crocro.setSoin(new Operation());
		crocro.soigner();
		System.out.println("************************************");
		System.out.println("");
		System.out.println("************************************");
		
		Personnage momotte = new PlongeurDeCombat("Motte de combat Jean Moulamotte");
		System.out.println("Instance de la classe: "+momotte.getClass().getName());
		System.out.println(momotte.toString());
		momotte.seDeplacer();
		momotte.combattre();
		momotte.soigner();
		((PlongeurDeCombat)momotte).combattre();

		
		
	}

}

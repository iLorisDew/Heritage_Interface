import com.heritage_interface.comportement.*;

public class PlongeurDeCombat extends Personnage
{
	public PlongeurDeCombat()
	{
		this.espritCombatif = new CombatSousEau();
		this.deplacement = new Nager();
	}						
	
	public PlongeurDeCombat(String nom) 
	{
		super(nom);
		this.espritCombatif = new CombatSousEau();
		this.deplacement = new Nager();
	} 
	
	public PlongeurDeCombat(EspritCombatif esprit, Soin soin, Deplacement dep, String nom)
	{
		super(esprit, soin, dep, nom);
	}
}

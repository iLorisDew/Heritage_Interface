
import com.heritage_interface.comportement.*;

public class Guerrier extends Personnage
{
	public Guerrier() 
	{
		this.espritCombatif = new CombatPistolet();
	}
	
	public Guerrier(String nom) 
	{
		super(nom);
		this.espritCombatif = new CombatPistolet();
	}
	
	public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep,  String nom) 
	{
//		this.espritCombatif = esprit;
//		this.soin = soin;
//		this.deplacement = dep;
		
		super(esprit, soin, dep, nom);
	}
}

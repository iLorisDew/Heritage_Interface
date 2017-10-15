import com.heritage_interface.comportement.*;

public class Sniper extends Personnage
{
	public Sniper()	
	{
		this.espritCombatif = new CombatSniper();
	}
	
	public Sniper(String nom) 
	{
		super(nom);
		this.espritCombatif = new CombatSniper();
	}
	
	public Sniper(EspritCombatif esprit, Soin soin, Deplacement dep, String nom)
	{
		super(esprit, soin, dep, nom);
	}
}

import com.heritage_interface.comportement.*;


public class Medecin extends Personnage
{
	public Medecin()
	{
		this.soin = new PremierSoin();
	}
	public Medecin(String nom) 
	{
		super(nom);
		this.soin = new PremierSoin();
	}
	
	public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep,  String nom)
	{
		super(esprit, soin, dep, nom);
	}
}

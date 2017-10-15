
import com.heritage_interface.comportement.*;

public abstract class Personnage 
{
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Soin soin = new AucunSoin();
	protected Deplacement  deplacement = new Marcher();
	protected String v_nom;
	
	Personnage() {}
	
	Personnage(String nom)
	{
		this.setNom(nom);
	}
	
	Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement, String nom)
	{
		this.espritCombatif = espritCombatif;
		this.soin = soin;
		this.deplacement = deplacement;
		this.v_nom = nom;
	}
	
	public void seDeplacer() 
	{
		deplacement.deplace();
	}
	
	public void combattre() 
	{
		espritCombatif.combat();
	}
	
	public void soigner() 
	{
		soin.soigne();
	}


	public void setEspritCombatif(EspritCombatif espritCombatif) 
	{
		this.espritCombatif = espritCombatif;
	}


	public void setSoin(Soin soin) 
	{
		this.soin = soin;
	}

	public void setDeplacement(Deplacement deplacement) 
	{
		this.deplacement = deplacement;
	}

	public void setNom(String nom) 
	{
		this.v_nom = nom;
	}
	public String getNom() 
	{
		return v_nom;
	}
	
	public String toString() 
	{
		String str = "Nom:"+this.getNom()+".";
		return str;	
	}
	
}

import com.heritage_interface.comportement.*;

public class Civil extends Personnage
{
	public Civil()	{	}
	
	public Civil(String nom)
	{
		super(nom);
	}
	
	public Civil(EspritCombatif esprit, Soin soin, Deplacement dep,  String nom)
	{
		super(esprit, soin, dep, nom);
	}
}


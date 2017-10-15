package com.heritage_interface.comportement;

public class Marcher implements Deplacement
{

	@Override
	public void deplace() 
	{
		System.out.println("Je me deplace en marchant.");
	}

}

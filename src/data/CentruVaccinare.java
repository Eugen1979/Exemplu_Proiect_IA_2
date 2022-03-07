package data;

import java.util.ArrayList;
import java.util.Vector;

public class CentruVaccinare 
{
	
	Vector<FluxVaccinare> fluxuri;
	Vector<Medic> medici;
	
	ArrayList<PersoanaVaccinata> persoaneVaccinate;
	
	public CentruVaccinare(int nr_fluxuri, int nr_medici)
	{
		fluxuri = new Vector<FluxVaccinare>(nr_fluxuri);
		medici = new Vector<Medic>(nr_medici);
		
		persoaneVaccinate =  new ArrayList<PersoanaVaccinata>();
	}

	public Boolean AfisarePacientiPrimaDoza(DataCalendaristica d)
	{
		Boolean persoanaVaccinata = new Boolean(false);
		for(int i = 0; i < persoaneVaccinate.size();i++)
		{
			if (persoaneVaccinate.get(i).dateVaccinari.get(0).equals(d))
			{
				persoaneVaccinate.get(i).Afisare();
				persoanaVaccinata = true;
			}
		}
		
		return persoanaVaccinata;
	}
	
	public static void main(String[] args) 
	{
		if(args.length >= 2)
		{
			System.out.println("Centru de vaccinare " + args[0] + " " + args[1]);
		}
		
		CentruVaccinare polivalenta =  new CentruVaccinare(4, 3);
		DataCalendaristica data = new DataCalendaristica(2022, 02, 28);
		if(!polivalenta.AfisarePacientiPrimaDoza(data))
		{
			System.out.println("In data de " + data.toString() + 
			" nu s-a vaccinat nici o persoana cu prima doza ");
		}
	}

}

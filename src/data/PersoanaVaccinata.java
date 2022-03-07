package data;

import java.util.Vector;

public class PersoanaVaccinata extends Persoana  
{
	Vaccin vaccin;
	Vector<DataCalendaristica> dateVaccinari;
	
	public void Afisare()
	{
		super.Afisare();
		System.out.println("Data primei vacinnari ");
		dateVaccinari.get(0).Afisare();
	}
}

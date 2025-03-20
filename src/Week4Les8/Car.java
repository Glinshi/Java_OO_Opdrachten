package Week4Les8;

public class Car 
{
	    public String brand = "Jaguar"; //Toegangsmodifier: Aangezien brand public is, kan deze vanuit elke andere klasse worden benaderd, ongeacht de package.
	    int manufactureYear = 2020; //Toegangsmodifier: Omdat er geen modifier is opgegeven, heeft deze variabele de default access modifier. Dit betekent dat manufactureYear alleen toegankelijk is binnen dezelfde package (Week4Les8). 
	    protected String color = "Green"; //Toegangsmodifier: Het gebruik van protected betekent dat deze variabele toegankelijk is binnen dezelfde package en ook toegankelijk is voor subklassen, zelfs als ze zich in andere packages bevinden.
	    String fuel = "Gas";//Toegangsmodifier: Het gebruik van private betekent dat deze variabele alleen toegankelijk is binnen de Car klasse zelf. Geen andere klasse, zelfs niet binnen dezelfde package, kan deze variabele benaderen.
	 
	}



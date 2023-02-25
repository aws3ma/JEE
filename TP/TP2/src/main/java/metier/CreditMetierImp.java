package metier;

public class CreditMetierImp implements ICreditMetier{

	@Override
	public double calculeMensu(double cap, double taux, int duree) {
		double x,y;
		 x=cap*((taux/100)/12);
		 y=1-Math.pow((1+((taux/100)/12)),-duree);

		 return(x/y);
	}

}

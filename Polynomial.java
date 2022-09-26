public class Polynomial {
	//Array of double
	public double coef[];
		
	//no-argument constructor that sets the polynomial to zero 
	public Polynomial(){
		coef = new double[100];	
		for (int i = 0; i < coef.length; i++){
			coef[i] = 0.0;
		}
	}

	//constructor that takes an array of double as an argument and sets the coefficients accordingly
	public Polynomial(double[] setcoef){
		for (int i = 0; i < setcoef.length; i++){
			coef[i] = setcoef[i];
		}
	}

	//It has a method named add that takes one argument of type Polynomial and returns the polynomial resulting from adding the calling object and the argument
	public Polynomial add(Polynomial objectPoly) {
      	double[] finalPoly = new double[100]; 
		for (int i = 0; i < coef.length; i++){
			finalPoly[i] = coef[i] + objectPoly.coef[i];
		}
		return new Polynomial(finalPoly);
	}

	//It has a method named evaluate that takes one argument of type double representing a value of x and evaluates the polynomial accordingly.
	public double evaluate(double X){
		double finalX = 0;
		for (int i = 0; i < coef.length; i++){
			finalX += coef[i] * Math.pow(X, i);
		}
		return finalX;
	}

	//It has a method named hasRoot that takes one argument of type double and determines whether this value is a root of the polynomial or not. N
	public boolean hasRoot(double Y){
		double finalY = 0;
		for (int i = 0; i < coef.length; i++){
			finalY += coef[i] * Math.pow(Y, i);
		}
		return (finalY == 0.0);
	}
}
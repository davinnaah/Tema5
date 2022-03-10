
public class Complex {
	private double r;
	private double im;
	private static int contor = 0;
	
	public Complex(double r, double im) {
		this.r = r;
		this.im = im;
		contor ++;
	}
	
	public double ModulNr(Complex z) {
		double calcul = Math.sqrt((z.r*z.r+z.im*z.im));
		return calcul;
	}
	
	public void Show() {
		System.out.println(r + " + i* " +im  );
	}
	
	public Complex Sum(Complex z) {
		Complex E = new Complex(z.r, z.im);
		E.r = E.r + r;
		E.im = E.im +im;
		return E;
		
	}
	
	public int AmountComplexe() {
		return contor;
		
	}
	

}

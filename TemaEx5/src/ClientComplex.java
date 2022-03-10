
public class ClientComplex {

	public static void main(String[] args) {
		Complex a = new Complex(8,8);
		Complex a2 = new Complex(10,10);
		
		a.Show();
		double modul = a.ModulNr(a);
		System.out.println(modul);
		
		int cont = a.AmountComplexe();
		System.out.println(cont);
		
		Complex a3 = a.Sum(a2);
		
		a3.Show();
		a.AmountComplexe();

	}

}

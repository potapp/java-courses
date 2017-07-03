public class Calculate{
	public static void main (String[] args){
		System.out.println("Calculate...");
		double first1 = Double.valueOf (args[0]);
		double second1 = Double.valueOf (args[1]);
		//int first = Integer.valueOf (args[0]);
		//int second = Integer.valueOf (args[1]);
		double summ = first1 + second1;
		double subtract = first1 - second1;
		double multiplication = first1 * second1;
		//double first1 = Double.valueOf (args[0]);
		//double second1 = Double.valueOf (args[1]);
		double divide = first1 / second1;
		double involution = Math.pow (first1, second1);
		System.out.println("Summ " + summ);
		System.out.println("Subtract " + subtract);
		System.out.println ("Multiplication " + multiplication);
		System.out.println("Divide " + divide);
		System.out.println("Involution " + involution);
	}
}
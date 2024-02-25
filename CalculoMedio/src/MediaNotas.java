
public class MediaNotas {
	
	public static void main(String[] args) {
		double nota1 = 8;
		double nota2 = 6;
		double nota3 = 3;
		double nota4 = 5;
		double media = 0;
		
		System.out.println("Média das notas: " + calculaMedia(nota1, nota2, nota3, nota4));
	}
	
	public static double calculaMedia(double n1, double n2, double n3, double n4) {
		return (n1 + n2 + n3 + n4) / 4;
		 
	}
}
 
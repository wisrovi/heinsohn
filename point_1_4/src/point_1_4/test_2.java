package point_1_4;

import java.util.ArrayList;


public class test_2 {
	public static void main(String[] args) {

		int rta = Evaluar_mayor(5,15,9);
		System.out.print(rta);
    }
	
	public static int Evaluar_mayor(int num_1, int num_2, int num_3) {
		int numeros[] = {num_1, num_2, num_3};
		int mayor = numeros[0];
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>mayor) {
				mayor=numeros[i];
			}
		}
		return mayor;
	}
}

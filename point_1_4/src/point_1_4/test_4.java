package point_1_4;

import java.util.ArrayList;
import java.util.Arrays;


public class test_4 {
	public static void main(String[] args) {
		
		int lista[] = {64, 34, 25, 12, 22, 11, 90};

		bubbleSort(lista, lista.length);
		System.out.print(Arrays.toString(lista));
    }
	
	//primero pense en usar el metodo de la burbuja con for encadenados, pero opté mejor por usar la recursividad
	
	public static void bubbleSort(int lista[], int size) {
		if(size==1) {
			return;
		}
		
		for(int i=0;i<size-1;i++) {
			if(lista[i]>lista[i+1]) {
				int temporal = lista[i];
				lista[i] = lista[i+1];
				lista[i+1] = temporal;
			}
		}
		bubbleSort(lista, size-1);
	}
	//mas sobre mi algoritmo en mi repo de github en el apartado de quick_sort en:
	//https://colab.research.google.com/github/wisrovi/03MAIR---Algoritmos-de-Optimizacion---2019/blob/master/AG1/WilliamSteveRodriguezVillamizar_AG1.ipynb
}

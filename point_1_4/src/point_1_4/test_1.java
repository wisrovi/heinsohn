package point_1_4;

import java.util.ArrayList;
import java.util.Iterator;

public class test_1 {	
	public static void main(String[] args) {				
		int cantidad_generar_numeros = 8;
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(byte i=0;i<cantidad_generar_numeros;i++) {
			lista.add(getRandom());
		}
		System.out.println("Data: " + lista);
		
		ArrayList<Integer> lista_convertida = Transfor(lista, 2);
		System.out.println("Resultado: " + lista_convertida);
		
    }	
	
	public static ArrayList<Integer> Transfor(ArrayList<Integer> array, int permutaciones){		
		for(int i=0;i<permutaciones;i++) {
			ArrayList<Integer> lista = new ArrayList<Integer>();
			for(int j=0;j<array.size();j++) {
				int anterior = 0;
				int posterior = 0;
				
				if(j>0) {
					anterior = array.get(j-1);
				}
				if(j<(array.size()-1)) {
					posterior = array.get(j+1);
				}
				
				if(anterior==posterior) {
					lista.add(0);
				}else {
					lista.add(1);
				}
			}
			array = lista;
		}
		return array;
	}
	
	public static int getRandom() {		
        return (Math.random() < 0.5) ? 1:0;
    }
}

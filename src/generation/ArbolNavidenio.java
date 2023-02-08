package generation;


public class ArbolNavidenio {

	public static void main(String[] args) {

		        
		// tamanio del Arbol
        int tamanioArbol = 20;
// bucle for para los arbustos
        for(int i=0; i<tamanioArbol+(tamanioArbol/2); i++) {
            for(int j=tamanioArbol+(tamanioArbol/2); j>i; j--) {
                System.out.print(" ");
            }
            for(int indice=1; indice<=2*i-1; indice++) {
                System.out.print("\u001B[32m*");
            }
            System.out.println("");
        }
        for(int i=0; i<tamanioArbol-(tamanioArbol/2); i++) {
            for(int j=tamanioArbol+(tamanioArbol/2); j>2; j--) {
                System.out.print(" ");
            }
            System.out.println("\u001B[33m***");
        }
    }
}


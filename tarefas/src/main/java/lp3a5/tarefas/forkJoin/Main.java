package lp3a5.tarefas.forkJoin;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		//cria um pool de threads Fork/Join
        ForkJoinPool pool = new ForkJoinPool();
        
        //array que será ordenado
        int[] A = {5, 2, 7, 6, 2, 1, 0, 3, 9, 4};
        
        //imprime o vetor desordenado
        System.out.println("A (desordenado) = " + arrayToString(A));
        
        //***TESTA O QUICKSORT DE CORMEN***
        //tarefa ForkJoin para ordenar o vetor A
        QuickSort quicksortTaskCormen = new QuickSort(A);
        //executa a tarefa utilizando o pool
        pool.invoke(quicksortTaskCormen);
        System.out.println("A (ordenado com Quicksort de Cormen) = " + arrayToString(A));
	}
	
	//Método auxiliar para imprimir os arrays
    private static String arrayToString(int[] array){
        String aux = "[" + array[0];
        for(int i = 1; i < array.length; i++){
            aux += ", " + array[i];
        }
        return aux + "]";
    }

}

package PortoSeguro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes1 {

	public static void main(String[] args) {
		// criação do List
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		//inserção dos elementos do meu ArrayList --> minhaLista
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(8);
		minhaLista.add(5);
		minhaLista.add(1);
		//Vou percorrer todos os elementos da minhaLista
		for(Integer listaElemento:minhaLista)
		{
			System.out.println(listaElemento);
		}
		
		System.out.println("\nRemovendo um elemento da lista..");
		System.out.println();//limpando o cash de memória
		//eletar um elemento da minha lista
		minhaLista.remove(0);
		
		for(Integer listaElemento:minhaLista)
		{
			System.out.println(listaElemento);
		}
		//pegar um elemento da minha lista através do seu índice
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento da minha lista é: "+primeiroElemento);
		
		System.out.println();//limpando o cash de memória
		
		for(int i=0;i<minhaLista.size();i++)
		{
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);//Irá ordenar os elementos da minha lista em ordem crescente
		System.out.println("\nDepois de ordenada a minha lista, temos: ");
		System.out.println(minhaLista);
		
		System.out.println();//limpando o cash de memória
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(2);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext())
		{ 
			System.out.println(iMeuSet.next());
		}

	}
}

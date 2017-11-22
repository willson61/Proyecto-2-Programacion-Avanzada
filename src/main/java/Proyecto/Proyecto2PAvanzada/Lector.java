package Proyecto.Proyecto2PAvanzada;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
    
	public static void lectura(String name)  throws FileNotFoundException, IOException {
		String linea;
		String ruta = "C:\\Users\\Public\\TestFolder\\";
		String delimitador = " ";
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    ruta = ruta + name + ".txt";
		archivo = new File(ruta);
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		while((linea = br.readLine()) != null) {
			if(linea.trim().equals("stack")) {
				linea = br.readLine();
				String[] M = linea.split(delimitador);
				Main.valoresStack = new int[M.length];
				for(int i = 0; i < M.length; i++) {
					Main.valoresStack[i] = Integer.parseInt(M[i]);
				}
			}
			if(linea.trim().equals("queue")) {
				linea = br.readLine();
				String[] M = linea.split(delimitador);
				Main.valoresQueue = new int[M.length];
				for(int i = 0; i < M.length; i++) {
					Main.valoresQueue[i] = Integer.parseInt(M[i]);
				}
			}
			if(linea.trim().equals("btree")) {
				linea = br.readLine();
				String[] M = linea.split(delimitador);
				Main.valoresBTree = new int[M.length];
				for(int i = 0; i < M.length; i++) {
					Main.valoresBTree[i] = Integer.parseInt(M[i]);
				}
			}
			if(linea.trim().equals("linkedlist")) {
				linea = br.readLine();
				String[] M = linea.split(delimitador);
				Main.valoresLinkedList = new int[M.length];
				for(int i = 0; i < M.length; i++) {
					Main.valoresLinkedList[i] = Integer.parseInt(M[i]);
				}
			}
			if(linea.trim().equals("circularlinkedlist")) {
				linea = br.readLine();
				String[] M = linea.split(delimitador);
				Main.valoresCircularLinkedList = new int[M.length];
				for(int i = 0; i < M.length; i++) {
					Main.valoresCircularLinkedList[i] = Integer.parseInt(M[i]);
				}
			}
			if(linea.trim().equals("doublelinkedlist")) {
				linea = br.readLine();
				String[] M = linea.split(delimitador);
				Main.valoresDoubleLinkedList = new int[M.length];
				for(int i = 0; i < M.length; i++) {
					Main.valoresDoubleLinkedList[i] = Integer.parseInt(M[i]);
				}
			}
		}
		br.close();
	}
}

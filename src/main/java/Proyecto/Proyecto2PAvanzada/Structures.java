package Proyecto.Proyecto2PAvanzada;

/**
 * @author Will
 */

import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.attribute.Records.*;
import static guru.nidi.graphviz.model.Compass.*;

import guru.nidi.graphviz.attribute.Attributes;
import guru.nidi.graphviz.attribute.Records;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.Node;
import guru.nidi.graphviz.parse.Parser;
import Estructuras.Position;

public class Structures {
	static Position<String> r;
	/**
	 * Metodo que crea las estructuras de los grafos en base al arreglo de la lectura de datos
	 */
	public static void crearEstructuras() {
		for(int i = 0; i < Main.valoresStack.length; i++) {
			Main.listStack.push(Integer.toString(Main.valoresStack[i]));
		}
		for(int i = 0; i < Main.valoresQueue.length; i++) {
			Main.listQueue.enqueue(Integer.toString(Main.valoresQueue[i]));
		}
		for(int i = 0; i < Main.valoresLinkedList.length; i++) {
			Main.listLinked.addFirst(Integer.toString(Main.valoresLinkedList[i]));
		}
		for(int i = 0; i < Main.valoresDoubleLinkedList.length; i++) {
			Main.listDoubeLinked.addFirst(Integer.toString(Main.valoresDoubleLinkedList[i]));
		}
		for(int i = 0; i < Main.valoresCircularLinkedList.length; i++) {
			Main.listCircularLinked.addFirst(Integer.toString(Main.valoresCircularLinkedList[i]));
		}
		Position<String> root, l;
		int cont = 0;
		root = Main.listBinaryTree.addRoot(Integer.toString(Main.valoresBTree[cont]));
		for(cont = 1; cont < (Main.valoresBTree.length - 1); cont = cont + 2) {
			l = Main.listBinaryTree.addLeft(root, Integer.toString(Main.valoresBTree[cont]));
			r = Main.listBinaryTree.addRight(root, Integer.toString(Main.valoresBTree[cont + 1]));
			root = r;
		}
	}
	/**
	 * Metodo de creacion de grafo de pila en base a su estructura de datos
	 * @throws IOException
	 */
	public static void crearStackGrafo() throws IOException{
		String[] temp = new String[Main.listStack.size()];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = Main.listStack.pop();
		}
		Node stack = node("Stack").with(Records.of(turn(temp)));
		Graph g = graph("grafoStack").directed().with(stack);
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/grafoStack.png"));
	}
	/**
	 * Metodo de creacion de grafo de cola en base a su estructura de datos
	 * @throws IOException
	 */
	public static void crearQueueGrafo() throws IOException{
		String[] temp = new String[Main.listQueue.size()];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = Main.listQueue.dequeue();
		}
		Node queue = node("Queue").with(Records.of(temp));
		Graph g = graph("grafoStack").directed().with(queue);
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/grafoQueue.png"));
	}
	/**
	 * Metodo de creacion de grafo de lista enlazada en base a su estructura de datos
	 * @throws IOException
	 */
	public static void crearLinkedListGrafo() throws IOException{
		Attributes l = Records.of(turn(rec(Main.listLinked.removeFirst()), rec("")));
		Node lLinked = node("l").with(l);
		int cont = 0;
		while(Main.listLinked.size() > 0) {
			Node temp = node(Integer.toString(cont)).with(Records.of(turn(rec(Main.listLinked.removeFirst()), rec(""))));
			lLinked = temp.link(lLinked);
			cont++;
		}
		Graph g = graph("grafoLinkedList").directed().with(lLinked);
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/grafoLinkedList.png"));
	}
	/**
	 * Metodo de creacion de grafo de lista doblemente enlazada en base a su estructura de datos
	 * @throws IOException
	 */
	public static void crearDoubleLinkedListGrafo() throws IOException{
		Attributes l = Records.of(turn(rec(""), rec(Main.listDoubeLinked.removeFirst()), rec("")));
		Node lLinked = node("l").with(l);
		int cont = 0;
		while(Main.listDoubeLinked.size() > 0) {
			Node temp = node(Integer.toString(cont)).with(Records.of(turn(rec(""), rec(Main.listDoubeLinked.removeFirst()), rec(""))));
			lLinked = lLinked.link(temp);
			lLinked = temp.link(lLinked);
			cont++;
		}
		Graph g = graph("grafoDoubleLinkedList").directed().with(lLinked);
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/grafoDoubleLinkedList.png"));
	}
	/**
	 * Metodo de creacion de grafo de lista circular en base a su estructura de datos
	 * @throws IOException
	 */
	public static void crearCircularLinkedListGrafo() throws IOException{
		Attributes l = Records.of(rec(Main.listCircularLinked.removeFirst()), rec(""));
		Node lLinked = node("l").with(l);
		Node lTemp = lLinked;
		Node temp;
		int cont = 0;
		while(Main.listCircularLinked.size() > 0) {
			temp = node(Integer.toString(cont)).with(Records.of(rec(Main.listCircularLinked.removeFirst()), rec("")));
			lLinked = temp.link(lLinked);
			cont++;
		}
		lLinked = lTemp.link(lLinked);
		Graph g = graph("grafoCircularLinkedList").directed().with(lLinked);
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/grafoCircularLinkedList.png"));
	}
	/**
	 * Metodo de creacion grafo de arbol binario en base a estructura de arbol binario
	 * @throws IOException
	 */
	public static void crearBinaryTreeGrafo() throws IOException{
		Node lLinked = node(r.getElement());
		Position<String> root = Main.listBinaryTree.root();
		int cont = 0;
		while(r.getElement() != root.getElement()){
			Node brother = node(Main.listBinaryTree.sibling(r).getElement());
			Node parent = node(Main.listBinaryTree.parent(r).getElement());
			lLinked = parent.link(lLinked);
			lLinked = lLinked.link(brother);
			r = Main.listBinaryTree.parent(r);
		}
		Graph g = graph("grafoBinarytree").directed().with((lLinked));
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/grafoBinaryTree.png"));
	}
}

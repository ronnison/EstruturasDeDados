/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class ListaDupla {
	private class No {
		private int valor;
		private No prox;
		private No ant;
		
		public No (int valor) {
			this.valor = valor;
			this.prox = null;
			this.ant = null;
		}
	}
	
	private No inicio;
	private No fim;
	private int tamanho;
	
	public ListaDupla() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public boolean isEmpty(){
		return this.tamanho == 0;//this.inicio == null && this.fim == null;
	}
	
	public void insereNoFim(int valor){
	    No novoNo = new No(valor);
	    novoNo.ant = this.fim;
	    
	    if (this.inicio == null) {
	        this.inicio = novoNo;
	    }
	    
	    if (this.fim != null) {
	        this.fim.prox = novoNo;
	    }
	    
	    this.fim = novoNo;
	    this.tamanho++;
	}
	
	public int size() {
	    return this.tamanho;
	}
	
	public String exibeLista() {
	    String str = "";
	    if(this.isEmpty()) {
	        return "Lista Vazia!\n";
	    }
	    for(No nodo = this.inicio; nodo != null; nodo = nodo.prox) {
	        str += " " + nodo.valor;
	    }
	    return str += "\n";
	}
	
	public String exibeListaReversa() {
	    String str = "";
	    if(this.isEmpty()){
	        return "Lista Vazia!\n";
	    }
	    for(No nodo = this.fim; nodo != null; nodo = nodo.ant) {
	        str += " " + nodo.valor;
	    }
	    
	    return str += "\n";
	}
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ListaDupla l1 = new ListaDupla();
		System.out.println(l1.exibeLista());
		System.out.println(l1.isEmpty());
		l1.insereNoFim(5);
		l1.insereNoFim(10);
		l1.insereNoFim(2);
		l1.insereNoFim(34);
		System.out.println(l1.size());
		System.out.println(l1.exibeListaReversa());
		System.out.println(l1.exibeLista());
		
	}
}

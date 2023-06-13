class ListaSimplesEncadeda
{
    class No
    {
        private int valor;
        private No prox;
        
        public No(int valor)
        {
            this.valor = valor;
            this.prox = null;
        }
        
        public void setValor(int valor)
        {
            this.valor = valor;
        }
        
        public int getValor()
        {
            return this.valor;
        }
        
        public void setProx(No novoNo)
        {
            this.prox = novoNo;
        }
        
        public No getProx()
        {
            return this.prox;
        }
    }
    
    private No inicio;
    
    public ListaSimplesEncadeda()
    {
        this.inicio = null;
    }
    
    public boolean isEmpty()
    {
        return this.inicio == null;
    }
    
    public void inserir(int valor)
    {
        this.inicio = this.inserir(this.inicio, valor);
    }
    
    public No inserir(No inicio, int valor)
    {
        No novo = new No(valor);
        if(this.isEmpty()){
            inicio = novo;
        } else {
            novo.setProx(inicio);
            inicio = novo;
        }
        return inicio;
    }
    
    public void remover(){
        this.inicio = this.remover(this.inicio);
    }
    
    public No remover(No inicio)
    {
        if(inicio == null)
        {
            System.out.println("Lista Vazia");
        } else {
            inicio = inicio.getProx();
        }
        return inicio;
    }
    
    public void buscar(int valor) {
        int i = 0;
        i = this.buscar(this.inicio, valor, i);
    }
    
    public int buscar(No inicio, int valor, int i) {
        if(inicio == null)
        {
            System.out.println("Lista Vazia ou elemento não se encontra na lista.");
        } else {
            if(inicio.getValor() == valor) {
                System.out.println("O elemento existe na lista, e é o "+ (i+1) +"º elemento");
            } else {
                i++;
                this.buscar(inicio.getProx(), valor, i);
            }
        }
        return i;
    }
    
    public void getLista()
    {
        if(this.isEmpty()){
            System.out.println("Arvore vazia");
        } else {
            this.getLista(this.inicio);
        }
    }
    
    public void getLista(No inicio)
    {
        if(inicio != null) {
            System.out.print(inicio.getValor() + " ");
            this.getLista(inicio.getProx());
        }
    }
    
    public void getListaInvertida()
    {
        if(this.isEmpty()){
            System.out.println("Arvore vazia");
        } else {
            this.getListaInvertida(this.inicio);
        }
    }
    
    public void getListaInvertida(No inicio)
    {
        if(inicio != null) {
            this.getListaInvertida(inicio.getProx());
            System.out.print(inicio.getValor() + " ");
        }
    }
    
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ListaSimplesEncadeda lse = new ListaSimplesEncadeda();
		System.out.println(lse.isEmpty());
		lse.inserir(5);
		lse.inserir(7);
		lse.inserir(46);
		lse.getLista();
		System.out.println("");
		//lse.getListaInvertida();
		//lse.remover();
		//lse.remover();
		System.out.println("");
		lse.getLista();
		System.out.println("");
		lse.buscar(7);
	}
}

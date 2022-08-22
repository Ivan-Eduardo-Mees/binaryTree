package testeArvBi;


public class arv {
	
	
	
	public class No {
		char valor;
		No esq;
		No dir;
		
		public No(char valor) {
			this.valor = valor;;
		}
		
		
		public char getValor() {
			return valor;
		}
		public void setValor(char valor) {
			this.valor = valor;
		}
		public No getEsq() {
			return esq;
		}
		public void setEsq(No esq) {
			this.esq = esq;
		}
		public No getDir() {
			return dir;
		}
		public void setDir(No dir) {
			this.dir = dir;
		}
	}
	

	private No raiz;
	
	public No insereRaiz(char valor){	
		raiz = new No(valor);
		return raiz;
	}
	
	public No getRaiz(){
		return raiz;
	}
	

	public void insereEsquerda(char valor, No no){
		No novoNo = new No(valor);
		no.setEsq(novoNo);	
	}
	
	public void insereDireita(char valor, No no){
		No novoNo = new No(valor);
		no.setDir(novoNo);
	}
	

	public void Preordem(No no) {
		if(no != null) {
			System.out.print(no.getValor() + "\t");
			Preordem(no.getEsq());
			Preordem(no.getDir());
		}
	}
	
	public void Emordem(No no) {
		if(no != null) {
			Emordem(no.getEsq());
			System.out.print(no.getValor() + "\t");
			Emordem(no.getDir());
			
		}
	}
	
	public void Pósordem(No no) {
		if(no != null) {
			Pósordem(no.getEsq());
			Pósordem(no.getDir());
			System.out.print(no.getValor() + "\t");
		}
	}
	  
	  
	

	

	
	public static void main(String[] args) {
		arv a = new arv();
		
//		a.insereRaiz('*');
//		a.insereEsquerda('+', a.getRaiz());
//		a.insereEsquerda('a', a.getRaiz().getEsq());
//		a.insereDireita('/', a.getRaiz().getEsq());
//		a.insereEsquerda('b', a.getRaiz().getEsq().getDir());
//		a.insereDireita('c', a.getRaiz().getEsq().getDir());
//		
//		a.insereDireita('-', a.getRaiz());
//		a.insereEsquerda('d', a.getRaiz().getDir());
//		a.insereDireita('*', a.getRaiz().getDir());
//		a.insereEsquerda('e', a.getRaiz().getDir().getDir());
//		a.insereDireita('f', a.getRaiz().getDir().getDir());
		
		a.insereRaiz('-');
		a.insereEsquerda('/', a.getRaiz());
		a.insereEsquerda('x', a.getRaiz().getEsq());
		a.insereEsquerda('+', a.getRaiz().getEsq().getEsq());
		a.insereEsquerda('3', a.getRaiz().getEsq().getEsq().getEsq());
		a.insereDireita('1',  a.getRaiz().getEsq().getEsq().getEsq());
		a.insereDireita('3', a.getRaiz().getEsq().getEsq());
		a.insereDireita('+', a.getRaiz().getEsq());
		a.insereEsquerda('-', a.getRaiz().getEsq().getDir());
		a.insereEsquerda('9', a.getRaiz().getEsq().getDir().getEsq());
		a.insereDireita('5', a.getRaiz().getEsq().getDir().getEsq());
		a.insereDireita('2', a.getRaiz().getEsq().getDir());
		a.insereDireita('+', a.getRaiz());
		a.insereEsquerda('x', a.getRaiz().getDir());
		a.insereEsquerda('3', a.getRaiz().getDir().getEsq());
		a.insereDireita('-', a.getRaiz().getDir().getEsq());
		a.insereEsquerda('7', a.getRaiz().getDir().getEsq().getDir());
		a.insereDireita('4', a.getRaiz().getDir().getEsq().getDir());
		a.insereDireita('6', a.getRaiz().getDir());
		
		System.out.println("Preordem");
		a.Preordem(a.getRaiz());
		
		System.out.println("\n");
		
		System.out.println("Emordem");
		a.Emordem(a.getRaiz());
		
		System.out.println("\n");
		
		System.out.println("Pósordem");
		a.Pósordem(a.getRaiz());

	}
	
	
	
}

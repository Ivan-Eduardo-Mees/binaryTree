package testeArvBi;


public class arv {
	
	/* 
	 * 
	 * Crio uma classe 'No' que tem o objetivo de armazenar o valor de cada N� e alem disso direcionar a cria��o dos N�s para esquerda e direita.
	 * Armazenando ent�o o valor do No e sua referencia.
	 * 
	 * */
	
	
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
	
	/* 
	 * 
	 * Crio uma variavel especifica para a raiz j� que nela so sera feito o apontamento uma vez sendo o primeiro n� da minha arvore.
	 * 
	 * obs a variavel raiz � do tipo No logo podendo armazenar valor ao N�
	 * 
	 * */
	private No raiz;
	
	public No insereRaiz(char valor){	
		raiz = new No(valor);
		return raiz;
	}
	
	public No getRaiz(){
		return raiz;
	}
	
	/* 
	 * 
	 * 2 classes, uma que faz a inser��o a esquerda e outro a direita. seguimos a seguinte logica nelas, recebemos 2 parametros um que � o valor que sera colocado no n� e outro � onde estara este n�
	 * e � ai que fica a grande sacada j� que podemos chamar os metodos da classe n� varias vezes assim indicando a posi��o de cada N� e ent�o armazenando que este N� esta a direita ou a esquera e seu
	 * respectivo valor. 
	 * 
	 * */
	public void insereEsquerda(char valor, No no){
		No novoNo = new No(valor);
		no.setEsq(novoNo);	
	}
	
	public void insereDireita(char valor, No no){
		No novoNo = new No(valor);
		no.setDir(novoNo);
	}
	
	/* 
	 * 
	 * Para imprimimos em Preordem, Emordem ou P�sordem fazemos um metodo recursivo que chama ele mesmo percorrendo todos os n�s da �rvore e printando os respectivos valores.
	 * o grande detalhe neste caso � de sempre � sempre verificar se h� algum N� a esquerda e depois h�  diretia e onde esta o raiz seja no Preordem, Emordem ou P�sordem fazer o print.  
	 *  
	 * 	Ex.	
	 * 		Preordem (R,E,D) Raiz na primeira linha printamos, depois vamos a esquerda e so depois a direita, como estamos fazendo uma chamada recursiva toda a vez que tiver um a esquerda ou direita
	 * ele vai realizar o print e quando chegar em um ponto que n�o h� mais esquerda direita null ele para a recurs�o. 
	 * 
	 * 		Emordem (E,R,D) Esquerda na primeira linha ent�o vamos primeiro a esquerda quando n�o tiver mais printamos o valor ai vamos a direita depois chama o metodo novamente verifica primeiro se tem
	 * esquerda caso n�o houver printa e depeois direita ate que n�o tenha mais seja null e pare a recurs�o.
	 * 
	 * 		P�sorder (E,D,R) Esquerda na primeira linha ent�o procuramos a esquerda ate que n�o tenha mais esquerda ent�o vamos a direita e printamos a esquerda ai depois novamente vemos se n�o tem esquerda
	 * ate o fim como n�o � possivel ter direita j� que chegamos ao fim vamos a direita novamente e printamos ate que seja null e a recurs�o pare. 
	 *
	 * */
	
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
	
	public void P�sordem(No no) {
		if(no != null) {
			P�sordem(no.getEsq());
			P�sordem(no.getDir());
			System.out.print(no.getValor() + "\t");
		}
	}
	  
	  
	

	

	
	public static void main(String[] args) {
		arv a = new arv();
		
		/* 
		 * 
		 * 
		 * para inser��o seguimos a regra raiz depois esquerda ai direita.
		 * afim de evitar erros do tipo get em um N� que ainda n�o foi criado logo n�o tendo sua referencia resultando em exception 
		 * j� que nosso programa n�o trata a situa��o... 
		 * 
		 * Obs � possivel chamar getEsq, getDir varias vezes j� que getRaiz retorna um objeto do tipo No 
		 * 
		 * */
			//Ex da pag 24 do pdf �rvore - Introdu��o
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
		
			//Ex da pag 25 do pdf �rvore - Introdu��o
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
		
		System.out.println("P�sordem");
		a.P�sordem(a.getRaiz());

	}
	
	
	
}

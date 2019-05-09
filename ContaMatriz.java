package SD;

public class ContaMatriz {
	private int[] data;
	private int round = 0;
	private int passos = 0;
	private int somando = 1;
	private int operando = 0;
	private int resultado = 0;
	
	
	
	public ContaMatriz() {
		int[] abc = {1,3,5,2,4,6,7,8,3,4,1,2,4,6,6,0};
		data = abc;
	}
	
	public void percorreData() {
		boolean baixo = false;
		boolean lado = false;
		if(round == 0) {
			
			for(int a = 0;passos<=2;passos++ ) {
//				if (passos == 3 && (!baixo)) {
//					passos = 0;
//					baixo = true;
//					a=0;
//				}
				
				if (passos == 0) 
					a=0;
//					if (baixo)
//						a= a+4;
				if(passos == 1)
					a=5;
				if(passos == 2)
					a=10;
				if(baixo)
					a=a+4;
//				if(baixo && (passos == 3)) {
//					passos = 4;
	//			}
				this.operando = data[a];
				this.somando = this.somando * this.operando;
				System.out.println(this.somando);
				
					
				
			}
			
			round++;
	}
		
		if(round == 1) {
			
			
			round++;
		}
		if(round == 2) {
			
			
			round++;
		}		
		if(round == 3) {
			
			
			round++;
		}		
		if(round == 4) {
			
			
			round++;
		}
		
	}
	
}

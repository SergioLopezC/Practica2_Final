public class PrimeraClase  {
int npasajeros;
		int nvagones=0;
		public int getNpasajeros() {
			return npasajeros;
		}
		public void setNpasajeros(int npasajeros) {
			this.npasajeros = npasajeros;
		}
		public int getNvagones() { 
			return nvagones;
		}
		public void setNvagones(int nvagones) {
			this.nvagones = nvagones;
		}
		
	public void CalcularVagones(int suben,int bajan){
		npasajeros = npasajeros+suben-bajan; 
		int ayuda = npasajeros%10; 
		if (ayuda==0) { 
				  nvagones=npasajeros/10; 
				}else{ 
				  nvagones=(npasajeros+(10-ayuda))/10;
				  }   
	}
	
	

}

public class PrimeraClase  {

int npasajeros;
		int nvagones=0;
		int suben;
		int bajan;
		
		public int getSuben() {
			return suben;
		}
		public void setSuben(int suben) {
			this.suben = suben;
		}
		public int getBajan() {
			return bajan;
		}
		public void setBajan(int bajan) {
			this.bajan = bajan;
		}
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
				  nvagones=1; 
				}else{ 
				  nvagones=(npasajeros+(10-ayuda))/10;
				  }   
	}	

}

public class TerceraClase {
int npasajeros;
	int nvagones;
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
		int ayuda = npasajeros%40; 
		if (ayuda==0) { 
				  nvagones=npasajeros/40; 
				}else{ 
				  nvagones=(npasajeros+(40-ayuda))/40;
				  }   
	}	
}

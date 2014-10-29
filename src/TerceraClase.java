public class TerceraClase extends VagonPasajero {
	
	public void CalcularVagones(int suben,int bajan){
		npasajeros = npasajeros+suben-bajan; 
		int ayuda = npasajeros%40; 
		if (ayuda==0) { 
				  nvagones=1; 
				}else{ 
				  nvagones=(npasajeros+(40-ayuda))/40;
				  }   
	}

}

public class PrimeraClase extends VagonPasajero{

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

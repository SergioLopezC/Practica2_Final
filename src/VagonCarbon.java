
public class VagonCarbon {
int recorrido;
int nvagones;
public VagonCarbon(){
	
}

	public int getRecorrido() {
	return recorrido;
}

public void setRecorrido(int recorrido) {
	this.recorrido = recorrido;
}

public int getNvagones() {
	return nvagones;
}

public void setNvagones(int nvagones) {
	this.nvagones = nvagones;
}
	public void CalcularVagones(int primera, int tercera, int distancia) {
		int comprobador =(100-((primera+tercera)*10))-distancia; 
		 		  int resto=0; 
		 		  //analiza la distancia
          		  if (distancia<100) { 
          			resto=100-distancia;
	       		  }
          		  else{  
	       			resto=distancia%100; 
		    	  } 
		 	      if (primera==0 && tercera==0) { // si no hay vagones de pasajeros
				   nvagones=(distancia+resto)/100; 
				  }else{ //si hay
				        if (comprobador>0) { //significa que solo nesecito un vagon
		 			     nvagones=1;
		 	      	    }
				        else{
		 			    nvagones=((-comprobador)/100)+2;
		 	            } 

	     }
	}
}

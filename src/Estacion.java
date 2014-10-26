public class Estacion {
Estacion derecha;
	Estacion izquierda;
	
	PrimeraClase p=new PrimeraClase();
    TerceraClase t = new TerceraClase();
    VagonCarbon c =new VagonCarbon();
	String nombre;
	int id;
	int distancia;
	int subenc1;
	int bajanc1;
	int subenc3;
	int bajanc3;
	int pasajeroPrimera;
    int pasajeroTercera;
	int nvagonesCarbon;
	int nvagonesPrimera=0;
	int nvagonesTercera=0;
	
    public int getPasajeroPrimera() {
		return pasajeroPrimera;
	}

	public void setPasajeroPrimera(int pasajeroPrimera) {
		this.pasajeroPrimera = pasajeroPrimera;
	}

	public int getPasajeroTercera() {
		return pasajeroTercera;
	}

	public void setPasajeroTercera(int pasajeroTercera) {
		this.pasajeroTercera = pasajeroTercera;
	}

	public Estacion(){
    	this.derecha=null;
    	this.izquierda=null;
    }

	public Estacion(String nombre, int id, int distancia, int subenc1,
			int bajanc1, int subenc3, int bajanc3) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.distancia = distancia;
		this.subenc1 = subenc1;
		this.bajanc1 = bajanc1;
		this.subenc3 = subenc3;
		this.bajanc3 = bajanc3;
	}
	public int getnvagonesCarbon(){
		return nvagonesCarbon;
		
	}
	public int getnvagonesPrimera(){
		return nvagonesPrimera;
		
	}
	public int getnvagonesTercera(){
		return nvagonesTercera;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getSubenc1() {
		return subenc1;
	}

	public void setSubenc1(int subenc1) {
		this.subenc1 = subenc1;
	}

	public int getBajanc1() {
		return bajanc1;
	}

	public void setBajanc1(int bajanc1) {
		this.bajanc1 = bajanc1;
	}

	public int getSubenc3() {
		return subenc3;
	}

	public void setSubenc3(int subenc3) {
		this.subenc3 = subenc3;
	}

	public int getBajanc3() {
		return bajanc3;
	}

	public void setBajanc3(int bajanc3) {
		this.bajanc3 = bajanc3;
	}

	public void imprimir_datos(){
        System.out.println("Nombre: "+ nombre+", Edad:"+"id "+id+"distancia:"+distancia+subenc1+bajanc1+" "+subenc3+bajanc3);
    }
	public void armarTren(){
		 p.CalcularVagones(subenc1,bajanc1);   
	     t.CalcularVagones(subenc3,bajanc3);
	     nvagonesPrimera=p.getNvagones();
	     nvagonesTercera=t.getNvagones();
	     c.CalcularVagones(p.getNvagones(),t.getNvagones(),distancia);
	     nvagonesCarbon=c.getNvagones();
	}
	public void armarTren(){
		CalcularTercera();
		CalcularPrimera();
		CalcularCarbon();
	
	public void CalcularTercera(){
		pasajeroTercera = pasajeroTercera+subenc3-bajanc3; 
		int ayuda = pasajeroTercera%40; 
		if (ayuda==0) { 
				  nvagonesTercera=pasajeroTercera/40; 
				}else{ 
				  nvagonesTercera=(pasajeroTercera+(40-ayuda))/40;
				  }   
	}
	public void CalcularPrimera(){
		pasajeroPrimera = pasajeroPrimera+subenc1-bajanc1; 
		int ayuda = pasajeroPrimera%10; 
		if (ayuda==0) { 
				  nvagonesPrimera=pasajeroPrimera/10; 
				}else{ 
				  nvagonesPrimera=(pasajeroPrimera+(10-ayuda))/10;
				  }   
	}
	public void CalcularCarbon(){
		int comprobador =(100-((nvagonesPrimera+nvagonesTercera)*10))-distancia; 
		 		  int resto=0; 
		 		  //analiza la distancia
          		  if (distancia<100) { 
          			resto=100-distancia;
	       		  }
          		  else{  
	       			resto=distancia%100; 
		    	  } 
		 	      if (nvagonesPrimera==0 && nvagonesTercera==0) { // si no hay vagones de pasajeros
				   nvagonesCarbon=(distancia+resto)/100; 
				  }else{ //si hay
				        if (comprobador>0) { //significa que solo nesecito un vagon
		 			     nvagonesCarbon=1;
		 	      	    }
				        else{
		 			    nvagonesCarbon=((-comprobador)/100)+2;
		 	            } 

	     }
	}
	
}

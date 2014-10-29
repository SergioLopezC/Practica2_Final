public class Estacion {
        Estacion derecha;
	Estacion izquierda;
	
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
    
	public int getNvagonesPrimera() {
		return nvagonesPrimera;
	}

	public void setNvagonesPrimera(int nvagonesPrimera) {
		this.nvagonesPrimera = nvagonesPrimera;
	}

	public int getNvagonesTercera() {
		return nvagonesTercera;
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
			int bajanc1, int subenc3, int bajanc3 ,int nvagonesCarbon,int nvagonesPrimera,int nvagonesTercera) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.distancia = distancia;
		this.subenc1 = subenc1;
		this.bajanc1 = bajanc1;
		this.subenc3 = subenc3;
		this.bajanc3 = bajanc3;
		this.nvagonesCarbon=nvagonesCarbon;
		this.nvagonesPrimera=nvagonesPrimera;
		this.nvagonesTercera=nvagonesTercera;
	  
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
         System.out.println("Nombre: "+ nombre+", Edad:"+"id: "+id+", Distancia: "+distancia+", Suben clase 1: "+subenc1+", Bajan clase 1: "+bajanc1+", Suben clase 3: "+subenc3+", Bajan clase 3: "+bajanc3);
        }

	public void setNvagonesTercera(int nvagonesTercera) {
		this.nvagonesTercera = nvagonesTercera;
		
	}

	public int getNvagonesCarbon() {
		return nvagonesCarbon;
	}

	public void setNvagonesCarbon(int nvagonesCarbon2) {
		this.nvagonesCarbon = nvagonesCarbon2;
	}
}

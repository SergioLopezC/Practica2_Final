public class BaseDatos {
private String nombreEstacion;
private String id;
private String distancia;
private String subenc1;
private String bajanc1;
private String subenc3;
private String bajanc3;
public String getNombreEstacion() {
	return nombreEstacion;
}
public void setNombreEstacion(String nombreEstacion) {
	this.nombreEstacion = nombreEstacion;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDistancia() {
	return distancia;
}
public void setDistancia(String distancia) {
	this.distancia = distancia;
}
public String getSubenc1() {
	return subenc1;
}
public void setSubenc1(String subenc1) {
	this.subenc1 = subenc1;
}
public String getBajanc1() {
	return bajanc1;
}
public void setBajanc1(String bajanc1) {
	this.bajanc1 = bajanc1;
}
public String getSubenc3() {
	return subenc3;
}
public void setSubenc3(String subenc3) {
	this.subenc3 = subenc3;
}
public String getBajanc3() {
	return bajanc3;
}
public void setBajanc3(String bajanc3) {
	this.bajanc3 = bajanc3;
}
public void probar(){
	System.out.println(nombreEstacion+" "+id+" "+distancia+" "+subenc1+" "+bajanc1+" "+subenc3+" "+bajanc3);
}

}


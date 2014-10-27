public class ListaDoble {
 	 Estacion inicio;
	 Estacion fin;
	 Estacion moverse;
	private int tamano;
	
 public ListaDoble(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
	 
public boolean vacio()
	    {
	        return(this.inicio == null);
	    }
	    
public void agregar(){
	
}

public void agregar(Estacion nuevo){
	 if(vacio())
     {
         inicio = nuevo;
         fin = nuevo;
         tamano = 1;
         moverse=inicio;
     }
     else{
         fin.derecha= nuevo;
         nuevo.izquierda=fin;
         fin=nuevo;
         tamano++;
     }
} 

	
public int tamano(){
    return this.tamano;
}
public void imprimir()
{
	//String print="";
	   if(!vacio())
       {
           Estacion actual =inicio;
           while(actual != fin)
           {
        	   actual.imprimir_datos();
               //print=print+actual.getNombre()+" ";
               actual = actual.derecha;
           }
        // print=print+actual.getNombre();
           //System.out.println(print);
 }
	   
}

public String buscar(int id){//no lo he usado pero creo que servira XD
	Estacion temp=inicio;
	while(temp!=null){
		if (temp.getId()==id){
			return temp.getNombre();
		}
		temp=temp.derecha;
	}
	return "Nose encontro";
}
public Estacion moverse(int estado){
	if(estado==1){
		moverse=moverse.derecha;
	}
	else{
		moverse=moverse.izquierda;
	}
	return moverse;
	}
public void tren(){
	if (vacio()){ 
	System.out.println("la lista esta Vacia" ); 
	} 
	else{ 
		Estacion Actual=inicio; 
		while(Actual != null){ 
		 			Actual.armarTren();
	 				Actual=Actual.derecha; 
	 			} 
		 	} 
	    } 	

}

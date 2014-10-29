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
	if (vacio()){
		System.out.println("la lista esta Vacia" );
	}
	else{
		Estacion Actual=inicio;
		while(Actual != null){
		    Actual.imprimir_datos();;
			Actual=Actual.derecha;
		}
		System.out.println();
	}
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
public Estacion eliminar(int id)
{
    Estacion eliminar = null;
    if(!vacio())
    {      Estacion actual = inicio;
           Estacion  anterior =inicio;
        for(int i =0;i<this.tamano;i++)
        {
            if(actual.id == id)
            {
                if(actual == inicio)
                {
                    inicio = actual.derecha;
                }
                if(actual == fin)
                {
                    fin =anterior;
                    if(anterior == null)
                        fin = inicio;
                }else{
                    anterior.derecha = actual.derecha;
                    
                }
                this.tamano--;
            }
            anterior = actual;
            actual = actual.derecha;
        }
                        
    }
    return eliminar;
}
public Estacion obtener(int a){
    Estacion actual = inicio;
      for(int pos =0;pos<a;pos++){
          if(actual != null){
          actual = actual.derecha;
          }
          else 
              return null;
      }
    
    return actual;
 }

 
}

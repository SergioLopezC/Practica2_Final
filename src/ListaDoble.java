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
public boolean eliminar_pos(int a){
 Estacion actual = inicio; 
 Estacion pivote = null;
   for(int pos =0;pos<a;pos++){
       if(actual != null){
       actual = actual.derecha;
       }
       else
        return false;
   }
   if(actual.derecha != null){   
    pivote = actual.derecha;
    pivote.izquierda = actual.izquierda;
   } 
   else{
   fin = actual.izquierda;
   }
  if(actual.izquierda != null){   
    pivote = actual.izquierda;
    pivote.derecha = actual.derecha;
   } 
   else{
   inicio = actual.derecha;
   }
 return true;
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

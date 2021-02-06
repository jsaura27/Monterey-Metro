package Metro;

import java.util.*;

import Excepciones.*;

public class Estacion {
	private String nombre;
	private List<Estacion[]> transbordos;
	private Linea linea;
	private int pos;	//posicion relativa de la estacion 'nombre' dentro de la linea 'linea'

	public Estacion(String nombre, Linea linea, int pos){
		this.nombre = nombre;
		this.linea = linea;
		this.pos = pos;
	}

	public String getNombre() {
		return nombre;
	}

	public Linea getLinea(){
		return linea;
	}

	public int getPos(){
		return pos;
	}

	public List<Estacion[]> getTransbordos (){
		return this.transbordos;
	}

	public void setTransbordos(List<Estacion[]> transbordos){
		this.transbordos = transbordos;
	}

	/*private boolean checkIfContains(Object arrayObj[], Object obj){
		for(int i = 0; i<arrayObj.length;i++){
			if(arrayObj[i].equals(obj)){return true;}
		}
		return false;
	}*/

	public String toString(){
		String res =  "Estacion " + this.nombre + "\t Linea " + this.linea + "\nTransbordo a lineas: ";
		if(transbordos==null){res+="NINGUNA";}
		else{
			Iterator<Estacion[]> it = transbordos.iterator();
			while(it.hasNext()){
				Estacion[] aux = it.next();
				res+=aux[0].getLinea() + " ";
			}
		}
		return res;
	}
}

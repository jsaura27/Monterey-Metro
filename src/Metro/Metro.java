package Metro;

import java.util.*;
//import java.util.List;

import Excepciones.NotSameLineException;

public class Metro {

	//Estaciones linea A
	private static Estacion Talleres_A = new Estacion("Talleres", Linea.A, 0);
	private static Estacion San_Bernabe_A = new Estacion("San Bernardo", Linea.A, 1);			
	private static Estacion Unidad_Modelo_A = new Estacion("Unidad Modelo", Linea.A, 2);				
	private static Estacion Aztlan_A = new Estacion("Aztlan", Linea.A, 3);					
	private static Estacion Penitenciaria_A = new Estacion("Penitenciaria", Linea.A, 4);					
	private static Estacion Alfonso_Rey_A = new Estacion("Alfonso Rey", Linea.A, 5);		
	private static Estacion Mitras_A = new Estacion("Mitras", Linea.A, 6);							
	private static Estacion Simon_Bolivar_A = new Estacion("Simon Bolivar", Linea.A, 7);							
	private static Estacion Hospital_A = new Estacion("Hospital", Linea.A, 8);					
	private static Estacion Edison_A = new Estacion("Edison", Linea.A, 9);				
	private static Estacion Central_A = new Estacion("Central", Linea.A, 10);		
	private static Estacion Cuauhlemoc_A = new Estacion("Cuauhlemoc", Linea.A, 11);		
	private static Estacion Del_Golfo_A = new Estacion("Del Golfo", Linea.A, 12);				
	private static Estacion Felix_U_Gomez_A = new Estacion("Felix U Gomez", Linea.A, 13);
	private static Estacion Parque_Fundidora_A = new Estacion("Parque Fundidora", Linea.A, 14);
	private static Estacion Y_Griega_A = new Estacion("Y Griega", Linea.A, 15);
	private static Estacion Eloy_cavazas_A = new Estacion("Eloy cavazas", Linea.A, 16);
	private static Estacion Lerdo_De_Tejera_A = new Estacion("Lerdo De Tejera", Linea.A, 17);
	private static Estacion Exposicion_A = new Estacion("Exposicion", Linea.A, 18);
	

	//Estaciones linea B
	private static Estacion Sendero_B = new Estacion("Sendero", Linea.B, 0);
	private static Estacion Santiago_Tapia_B  = new Estacion("Santiago Tapia", Linea.B, 1);
	private static Estacion San_Nicolas_B = new Estacion("San Nicolas", Linea.B, 2);
	private static Estacion Anahuao_B = new Estacion("Anahuao", Linea.B, 3);
	private static Estacion Universidad_B = new Estacion("Universidad", Linea.B, 4);
	private static Estacion Ni�os_Heroes_B = new Estacion("Ni�os Heroes", Linea.B, 5);
	private static Estacion Regina_B = new Estacion("Regina", Linea.B, 6);
	private static Estacion General_Anaya_B = new Estacion("General Anaya", Linea.B, 7);
	private static Estacion Cuauhlemoc_B = new Estacion("Cuauhlemoc", Linea.B, 8);
	private static Estacion Alameda_B = new Estacion("Alameda", Linea.B, 9);
	private static Estacion Fundadores_B = new Estacion("Fundadores", Linea.B, 10);
	private static Estacion Padre_Mier_B = new Estacion("Padre Mier", Linea.B, 11);
	private static Estacion General_I_Zaragoza_B = new Estacion("General I Zaragoza ", Linea.B, 12);
	

	//estaciones C
	private static Estacion Hospital_Metropolitano_C = new Estacion("Hospital Metropolitano", Linea.C, 0);
	private static Estacion Los_Angeles_C = new Estacion("Los Angeles", Linea.C, 1);
	private static Estacion Ruiz_Cortines_C = new Estacion("Ruiz Cortines", Linea.C, 2);
	private static Estacion Violeta_C = new Estacion("Violeta", Linea.C, 3);
	private static Estacion Conchello_C = new Estacion("Conchello", Linea.C, 4);
	private static Estacion Felix_U_Gomez_C = new Estacion("Felix U Gomez", Linea.C, 5); 
	private static Estacion Adolfo_Prieto_C = new Estacion("Adolfo Prieto", Linea.C, 6);
	private static Estacion Santa_Lucia_C = new Estacion("Santa Lucia", Linea.C, 7);
	private static Estacion General_I_Zaragoza_C = new Estacion("General I Zaragoza", Linea.C, 8);
	
	
	//Transbordos
	private ArrayList<Estacion[]> transbordosCu_A = new ArrayList<Estacion[]>();
	private ArrayList<Estacion[]> transbordosCu_B = new ArrayList<Estacion[]>();
	private ArrayList<Estacion[]> transbordosFe_A = new ArrayList<Estacion[]>();
	private ArrayList<Estacion[]> transbordosFe_C = new ArrayList<Estacion[]>();
	private ArrayList<Estacion[]> transbordosGen_B = new ArrayList<Estacion[]>();
	private ArrayList<Estacion[]> transbordosGen_C = new ArrayList<Estacion[]>();
	
	//Linea A del metro
	private static Estacion[] A = {Talleres_A, San_Bernabe_A, Unidad_Modelo_A, Aztlan_A, Penitenciaria_A, Alfonso_Rey_A, Mitras_A, Simon_Bolivar_A, Hospital_A,
			Edison_A, Central_A, Cuauhlemoc_A, Del_Golfo_A, Felix_U_Gomez_A, Parque_Fundidora_A, Y_Griega_A, Eloy_cavazas_A, Lerdo_De_Tejera_A,
			Exposicion_A};

	//Linea B del metro
	private static Estacion[] B = {Sendero_B, Santiago_Tapia_B, San_Nicolas_B, Anahuao_B, Universidad_B, Ni�os_Heroes_B, Regina_B, General_Anaya_B, Cuauhlemoc_B,
			Alameda_B, Fundadores_B, Padre_Mier_B, General_I_Zaragoza_B};

	//Linea C del metro
	private static Estacion[] C = {Hospital_Metropolitano_C, Los_Angeles_C,Ruiz_Cortines_C, Violeta_C, Conchello_C, 
			Felix_U_Gomez_C, Adolfo_Prieto_C, Santa_Lucia_C, General_I_Zaragoza_C,};

	
	public Metro(){
		//Inicializamos los transbordos
		//Cuauhlemoc desde A
		transbordosCu_A.add(B);
		
		//Cuauhlemoc desde B		
		transbordosCu_B.add(A);
		

		//Felix U. Gomez desde A
		transbordosFe_A.add(C);

		//Felix U. Gomez desde C
		transbordosFe_C.add(A);
		
		//General I. Zaragoza desde B
		transbordosGen_B.add(C);

		//General I. Zaragoza desde C
		transbordosGen_C.add(B);
		


		//añadimos los posibles transbordos de la linea A
		for(int i = 0; i<A.length; i++){
			if(A[i].getNombre().compareTo("Cuauhlemoc") == 0){
				A[i].setTransbordos(transbordosCu_A);
			}
			else if(A[i].getNombre().compareTo("Felix U Gomez") == 0){
				A[i].setTransbordos(transbordosFe_A);
			}
		}//for A

		//añadimos los posibles transbordos de la linea B
		for(int i = 0; i<B.length; i++){
			if(B[i].getNombre().compareTo("Cuauhlemoc") == 0){
				B[i].setTransbordos(transbordosCu_B);
			}
			else if(B[i].getNombre().compareTo("General I Zaragoza") == 0){
				B[i].setTransbordos(transbordosGen_B);
			}
		}//for B

		//añadimos los posibles transbordos de la linea C
		for(int i = 0; i<C.length; i++){
			if(C[i].getNombre().compareTo("Feliz U Gomez") == 0){
				C[i].setTransbordos(transbordosFe_C);
			}
			else if(C[i].getNombre().compareTo("General I Zaragoza") == 0){
				C[i].setTransbordos(transbordosGen_C);
			}
		}//for C

		
			
	}//Constructor Metro

	/*Mediante el algoritmo A* generamos el camino más corto entre dos estaciones
	 * RETURN: Lista no vacía con el itinerario de estaciones
	 * */
	public List<Estacion> aEstrella(Estacion org, Estacion dest) throws NotSameLineException{
		List<Estacion> closed = new ArrayList<Estacion>(); //lista donde iremos metiendo las estaciones visitadas (La ruta)
		List<Estacion> open = new ArrayList<Estacion>(); //lista de estaciones posibles
		int recorrido = 0;
		int heuristica;

		//Primero incluimos en la lista open las estaciones accesibles desde la estacion dest
		switch(dest.getLinea()){
		case A:
			if(dest.getPos() == 0){
				open.add(A[dest.getPos()+1]);
			}else if(dest.getPos()==A.length-1){
				open.add(A[dest.getPos()-1]);
			}else{
				open.add(A[dest.getPos()+1]);
				open.add(A[dest.getPos()-1]);
			}
			break;
		case B:
			if(dest.getPos() == 0){
				open.add(B[dest.getPos()+1]);
			}else if(dest.getPos()==B.length-1){
				open.add(B[dest.getPos()-1]);
			}else{
				open.add(B[dest.getPos()+1]);
				open.add(B[dest.getPos()-1]);
			}
			break;
		default://caso C
			if(dest.getPos() == 0){
				open.add(C[dest.getPos()+1]);
			}else if(dest.getPos()==C.length-1){
				open.add(C[dest.getPos()-1]);
			}else{
				open.add(C[dest.getPos()+1]);
				open.add(C[dest.getPos()-1]);
			}
			break;
		
			
		}//end switch
		closed.add(dest);
		Estacion estacionSig = null;
		while(!closed.contains(org)){
			Iterator<Estacion> itOpen = open.iterator();
			while(itOpen.hasNext()){
				Estacion estAux = itOpen.next();
				if(open.get(0).getNombre().compareTo(estAux.getNombre())==0){
					estacionSig = estAux;
				}else{
					int fActual = recorrido + 1 + generarHeuristica(estacionSig, org);
					int fPosible = recorrido + 1 + generarHeuristica(estAux, org);
					if(fPosible<fActual){
						//si la f del elemento es menor que la que 
						//tenemos elegimos este elemento como siguiente estacion
						estacionSig = estAux;
					}//end if
				}//end if
			}//end while
			closed.add(estacionSig);//añadimos a closed la mejor opcion
			recorrido++;
			if(estacionSig.getLinea().equals(dest.getLinea())){recorrido = recorrido+2;}
			switch(estacionSig.getLinea()){
			case A:
				if(estacionSig.getPos() == 0){
					if(!open.contains(A[estacionSig.getPos()+1])){open.add(A[estacionSig.getPos()+1]);}
				}else if(estacionSig.getPos()==A.length-1){
					if(!open.contains(A[estacionSig.getPos()-1])){open.add(A[estacionSig.getPos()-1]);}
				}else{
					if(!open.contains(A[estacionSig.getPos()+1])){open.add(A[estacionSig.getPos()+1]);}
					if(!open.contains(A[estacionSig.getPos()-1])){open.add(A[estacionSig.getPos()-1]);}
				}
				break;
			case B:
				if(estacionSig.getPos() == 0){
					if(!open.contains(B[estacionSig.getPos()+1])){open.add(B[estacionSig.getPos()+1]);}
				}else if(estacionSig.getPos()==B.length-1){
					if(!open.contains(B[estacionSig.getPos()-1])){open.add(B[estacionSig.getPos()-1]);}
				}else{
					if(!open.contains(B[estacionSig.getPos()+1])){open.add(B[estacionSig.getPos()+1]);}
					if(!open.contains(B[estacionSig.getPos()-1])){open.add(B[estacionSig.getPos()-1]);}
				}
				break;
			default://caso C
				if(estacionSig.getPos() == 0){
					if(!open.contains(C[estacionSig.getPos()+1])){open.add(C[estacionSig.getPos()+1]);}
				}else if(estacionSig.getPos()==C.length-1){
					if(!open.contains(C[estacionSig.getPos()-1])){open.add(C[estacionSig.getPos()-1]);}
				}else{
					if(!open.contains(C[estacionSig.getPos()+1])){open.add(C[estacionSig.getPos()+1]);}
					if(!open.contains(C[estacionSig.getPos()-1])){open.add(C[estacionSig.getPos()-1]);}
				}
				break;
			
			}//end switch
			List<Estacion[]> posiblesTrans = estacionSig.getTransbordos();
			if(posiblesTrans!=null){
				Iterator<Estacion[]> itTrans = posiblesTrans.iterator();
				while(itTrans.hasNext()){
					Estacion[] transAux = itTrans.next();
					for(int i=0; i<transAux.length; i++){
						if(transAux[i].getNombre().compareTo(estacionSig.getNombre())==0){
							if(!open.contains(transAux[i])){open.add(transAux[i]);}
						}//end if
					}//end for transAux
				}//while(hasNext)
			}//if(hay posibles lineas de transbordo)
		}//end while

		return closed;
	}

	private int generarHeuristica(Estacion org, Estacion dest) throws NotSameLineException{
		//Calculamos la heuristica
		//Si las estaciones están en la misma linea la heuristica es el numero de estaciones que las separan. Distancia(org-dest) = [1, longitud de la linea]
		//Si no buscamos el tranbordo más cercano entre las lineas origen y destino. Distancia(org-dest) = Distancia(org-transbordo) + 1 + Distancia(transbordo-dest)
		//El transbordo suma 1 a la heuristica asi como luego en el algoritmo por el tiempo para realizar dicho transbordo
		int result = 0;
		int pos_dest = dest.getPos();
		int pos_org = org.getPos();
		boolean dest_find = false;
		boolean org_find = false;

		//Comprobamos si ambas estaciones estan en la misma linea o si por el contrario habra que hacer transbordo
		if(org.getLinea().equals(dest.getLinea())){
			/*Estamos en el caso en el que ambas estaciones pertenecen a la misma linea.
			 *Simplemente obtenemos la diferencia absoluta de ambas posiciones  y sumamos 1 por amor al arte
			 * */
			//NOTA: PUEDEN ESTAR EN LA MISMA LINEA AUNQUE EL USUARIO INTRODUZCA LINEAS DISTINTAS
			switch(dest.getLinea()){
			case A:
				for (int i = 0; i < A.length; i++) {
					if(A[i].getNombre().compareTo(org.getNombre())==0){pos_org = A[i].getPos();}
				}
				break;
			case B:
				for (int i = 0; i < B.length; i++) {
					if(B[i].getNombre().compareTo(org.getNombre())==0){pos_org = B[i].getPos();}
				}
				break;
			default://caso C
				for (int i = 0; i < C.length; i++) {
					if(C[i].getNombre().compareTo(org.getNombre())==0){pos_org = C[i].getPos();}
				}
				break;
			
			}
			result = Math.abs(pos_dest-pos_org) + 1;
		}//end if(misma linea)	
		else{
			/*En este caso para obtener la heuristica nos basaremos en que
			 * para dos estaciones A y B en lineas L1 y L2 respectivamente siempre hay una estacion T tal que
			 * T tiene un transbordo valido entre L1 y L2
			 * De esta forma la heuristica sera la distancia entre A y T + la distancia entre T y B + el tiempo de transbordo(+2)
			 * */
			Estacion est_transbordo;
			List<Integer> estaciones_List = new ArrayList<Integer>();
			Integer[] estaciones_pos;
			int pos_min;
			switch(dest.getLinea()){
			case A:
				for(int i = 0; i<A.length; i++){
					List<Estacion[]> transbordos = A[i].getTransbordos();
					if(transbordos != null){
						boolean found = false;
						Iterator<Estacion[]> it = transbordos.iterator();
						while(it.hasNext()&&!found){
							if(org.getLinea().equals(it.next()[0].getLinea())){found = true;}
						}
						if(found){estaciones_List.add(i);}
					}
				}
				estaciones_pos = new Integer[estaciones_List.size()];
				estaciones_pos = estaciones_List.toArray(estaciones_pos);
				pos_min = estaciones_pos[0];
				for(int i = 1; i<estaciones_pos.length-1; i++){
					if(Math.abs(estaciones_pos[i]-pos_dest)<Math.abs(pos_min-pos_dest)){
						pos_min = estaciones_pos[i];
					}//end if(Math.abs(estaciones_pos[i]-pos_dest)<Math.abs(pos_min-pos_dest))
				}//end for(int i = 1; i<estaciones_pos.length-1; i++)
				est_transbordo = A[pos_min];
				break;
			case B:
				for(int i = 0; i<B.length; i++){
					List<Estacion[]> transbordos = B[i].getTransbordos();
					if(transbordos != null){
						boolean found = false;
						Iterator<Estacion[]> it = transbordos.iterator();
						while(it.hasNext()&&!found){
							if(org.getLinea().equals(it.next()[0].getLinea())){found = true;}
						}
						if(found){estaciones_List.add(i);}
					}
				}
				estaciones_pos = new Integer[estaciones_List.size()];
				estaciones_pos = estaciones_List.toArray(estaciones_pos);
				pos_min = estaciones_pos[0];
				for(int i = 1; i<estaciones_pos.length-1; i++){
					if(Math.abs(estaciones_pos[i]-pos_dest)<Math.abs(pos_min-pos_dest)){
						pos_min = estaciones_pos[i];
					}//end if(Math.abs(estaciones_pos[i]-pos_dest)<Math.abs(pos_min-pos_dest))
				}//end for(int i = 1; i<estaciones_pos.length-1; i++)
				est_transbordo = B[pos_min];
				break;
			default://caso C
				for(int i = 0; i<C.length; i++){
					List<Estacion[]> transbordos = C[i].getTransbordos();
					if(transbordos != null){
						boolean found = false;
						Iterator<Estacion[]> it = transbordos.iterator();
						while(it.hasNext()&&!found){
							if(org.getLinea().equals(it.next()[0].getLinea())){found = true;}
						}
						if(found){estaciones_List.add(i);}
					}
				}
				
				estaciones_pos = new Integer[estaciones_List.size()];
				estaciones_pos = estaciones_List.toArray(estaciones_pos);
				pos_min = estaciones_pos[0];
				for(int i = 1; i<estaciones_pos.length-1; i++){
					if(Math.abs(estaciones_pos[i]-pos_dest)<Math.abs(pos_min-pos_dest)){
						pos_min = estaciones_pos[i];
					}//end if(Math.abs(estaciones_pos[i]-pos_dest)<Math.abs(pos_min-pos_dest))
				}//end for(int i = 1; i<estaciones_pos.length-1; i++)
				est_transbordo = C[pos_min];
				break;
			
			}//end switch(dest.getLinea())
			//en 'est_transbordo' tenemos la estacion intermedia
			//obtenemos la linea a la que haremos transbordo
			List<Estacion[]> lineasTransbordo = est_transbordo.getTransbordos();
			Iterator<Estacion[]> it = lineasTransbordo.iterator();
			Estacion[] lineaTrans = null;
			boolean lineFound = false;
			//Recorremos la lista buscando la linea a la que deseamos hacer el transbordo
			while(it.hasNext() && !lineFound){
				Estacion[] aux = it.next();
				if(aux[0].getLinea().equals(org.getLinea())){
					lineaTrans = aux;
					lineFound = true;
				}//end if(hasNext)
			}//end while
			if(lineFound==false){throw new NotSameLineException();}
			//obtenemos la posicion de la estacion de transbordo en la linea de la estacion origen
			int pos_transbordo = 0;
			boolean found = false;
			for(int i = 0; i<lineaTrans.length&&!found;i++){
				if(lineaTrans[i].getNombre().compareTo(est_transbordo.getNombre())==0){
					pos_transbordo =i;
					found = true;
				}//end if
			}//end for
			result = Math.abs(pos_org-pos_transbordo)+Math.abs(pos_dest-pos_min)+2;
		}//end else
		return result;
	}//end  generarHeuristica(org, dest)

	private boolean inSameLine(Estacion e1, Estacion e2){
		boolean res = false;
		switch(e1.getLinea()){
		case A:
			for (int i = 0; i < A.length && !res; i++) {
				if(A[i].getNombre().compareTo(e2.getNombre())==0){res = true;}
			}
			break;
		case B:
			for (int i = 0; i < B.length && !res; i++) {
				if(B[i].getNombre().compareTo(e2.getNombre())==0){res = true;}
			}
			break;
		default://caso C
			for (int i = 0; i < C.length && !res; i++) {
				if(C[i].getNombre().compareTo(e2.getNombre())==0){res = true;}
			}
			break;
		
		}
		return res;
	}
	/////////////////////////////////////////////
	/////////////////GETTERS////////////////////	
	/////////////////////////////////////////////
	public static Estacion getTalleres_A() {
		return Talleres_A;
	}

	public static Estacion getSan_Bernabe_A() {
		return San_Bernabe_A;
	}

	public static Estacion getUnidad_Modelo_A() {
		return Unidad_Modelo_A;
	}

	public static Estacion getAztlan_A() {
		return Aztlan_A;
	}

	public static Estacion getPenitenciaria_A() {
		return Penitenciaria_A;
	}

	public static Estacion getAlfonso_Rey_A() {
		return Alfonso_Rey_A;
	}

	public static Estacion getMitras_A() {
		return Mitras_A;
	}

	public static Estacion getSimon_Bolivar_A() {
		return Simon_Bolivar_A;
	}

	public static Estacion getHospital_A() {
		return Hospital_A;
	}

	public static Estacion getEdison_A() {
		return Edison_A;
	}

	public static Estacion getCentral_A() {
		return Central_A;
	}

	public static Estacion getCuauhlemoc_A() {
		return Cuauhlemoc_A;
	}

	public static Estacion getDel_Golfo_A() {
		return Del_Golfo_A;
	}

	public static Estacion getFelix_U_Gomez_A() {
		return Felix_U_Gomez_A;
	}

	public static Estacion getParque_Fundidora_A() {
		return Parque_Fundidora_A;
	}

	public static Estacion getY_Griega_A() {
		return Y_Griega_A;
	}

	public static Estacion getEloy_cavazas_A() {
		return Eloy_cavazas_A;
	}

	public static Estacion getLerdo_De_Tejera_A() {
		return Lerdo_De_Tejera_A;
	}

	public static Estacion getExposicion_A() {
		return Exposicion_A;
	}

	public static Estacion getSendero_B() {
		return Sendero_B;
	}

	public static Estacion getSantiago_Tapia_B() {
		return Santiago_Tapia_B;
	}

	public static Estacion getSan_Nicolas_B() {
		return San_Nicolas_B;
	}

	public static Estacion getAnahuao_B() {
		return Anahuao_B;
	}

	public static Estacion getUniversidad_B() {
		return Universidad_B;
	}

	public static Estacion getNi�os_Heroes_B() {
		return Ni�os_Heroes_B;
	}

	public static Estacion getRegina_B() {
		return Regina_B;
	}

	public static Estacion getGeneral_Anaya_B() {
		return General_Anaya_B;
	}

	public static Estacion getCuauhlemoc_B() {
		return Cuauhlemoc_B;
	}

	public static Estacion getAlameda_B() {
		return Alameda_B;
	}

	public static Estacion getFundadores_B() {
		return Fundadores_B;
	}

	public static Estacion getPadre_Mier_B() {
		return Padre_Mier_B;
	}

	public static Estacion getGeneral_I_Zaragoza_B() {
		return General_I_Zaragoza_B;
	}

	public static Estacion getHospital_Metropolitano_C() {
		return Hospital_Metropolitano_C;
	}

	public static Estacion getLos_Angeles_C() {
		return Los_Angeles_C;
	}

	public static Estacion getRuiz_Cortines_C() {
		return Ruiz_Cortines_C;
	}

	public static Estacion getVioleta_C() {
		return Violeta_C;
	}

	public static Estacion getConchello_C() {
		return Conchello_C;
	}

	public static Estacion getFelix_U_Gomez_C() {
		return Felix_U_Gomez_C;
	}

	public static Estacion getAdolfo_Prieto_C() {
		return Adolfo_Prieto_C;
	}

	public static Estacion getSanta_Lucia_C() {
		return Santa_Lucia_C;
	}

	public static Estacion getGeneral_I_Zaragoza_C() {
		return General_I_Zaragoza_C;
	}

	

	

	public static Estacion[] getA() {
		return A;
	}

	public static Estacion[] getB() {
		return B;
	}

	public static Estacion[] getC() {
		return C;
	}

	
	///////FIN GETTERS//////////////////////

	//PROBADORRRRRRRRRRRR!!!!
	public static void main (String[] args) throws NotSameLineException{
		Metro m1 = new Metro();
		/*System.out.println("\n\n-------LINEA A------");
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i].toString()+"\n");
		}
		System.out.println("\n\n-------LINEA B------");
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i].toString()+"\n");
		}
		System.out.println("\n\n-------LINEA C------");
		for (int i = 0; i < C.length; i++) {
			System.out.println(C[i].toString()+"\n");
		}*/
		
		
		System.out.println("--------TRAYECTO REGINA -> CENTRAL-------------");
		List<Estacion> l1 = m1.aEstrella(Regina_B, Central_A);
		System.out.println(l1.size());
		ListIterator<Estacion> it1 = l1.listIterator(l1.size());
		while(it1.hasPrevious()){
			Estacion estMostrar = it1.previous();
			if(l1.listIterator().next().equals(estMostrar)){System.out.println(estMostrar.getNombre() + " - Linea "+estMostrar.getLinea());}
			else{System.out.println(estMostrar.getNombre() + " - Linea "+estMostrar.getLinea()+ "\n+");}
		}
		System.out.println("\n\n--------NI�OS HEROES ->TALLERES-------------");
		l1 = m1.aEstrella(Ni�os_Heroes_B, Talleres_A);
		it1 = l1.listIterator(l1.size());
		while(it1.hasPrevious()){
			Estacion estMostrar = it1.previous();
			if(l1.listIterator().next().equals(estMostrar)){System.out.println(estMostrar.getNombre() + " - Linea "+estMostrar.getLinea());}
			else{System.out.println(estMostrar.getNombre() + " - Linea "+estMostrar.getLinea()+ "\n+");}
		}
	}
}

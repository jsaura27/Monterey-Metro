package IG;
import javax.imageio.ImageIO;
import javax.swing.*;

import Excepciones.NotSameLineException;

import java.util.*;
import java.util.List;
import java.awt.*; 
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import Metro.*;

public class MetroIG extends JFrame 
{ 
	private JComboBox origen;
	private JComboBox destino;
	private JLabel txtOrigen;
	private JLabel txtDestino;
	private Metro metro;
	private String origenSelec;
	private String destinoSelec;
	private Estacion estOrigen;
	private Estacion estDest;
	private Linea linDestino;
	private String recorridoString;
	ItemListener accionOrigen;
	ItemListener accionDestino;

	public MetroIG() throws IOException {
		this.metro = new Metro();
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Calculo de ruta");
		//Texto Origen
		JLabel txtOrigen = new JLabel("Origen");
		txtOrigen.setBackground(Color.WHITE);
		txtOrigen.setBounds(40, 10, 58, 14);

		//Texto Destino
		JLabel txtDestino = new JLabel("Destino");
		txtDestino.setBounds(40, 50, 58, 14);

		BufferedImage mapaOriginal =ImageIO.read(new File("monterrey.png"));
		BufferedImage mapaPic = resize(mapaOriginal, 637, 540);
		Graphics2D mapaDibu  = mapaPic.createGraphics();
		mapaDibu.setColor(new Color(10, 20, 40));
		
		JLabel mapa = new JLabel();
		mapa.setBackground(Color.WHITE);
		mapa.setBounds(345, 20, 637, 540);
		mapa.setIcon(new ImageIcon(mapaPic));
		getContentPane().add(mapa);


		final JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(6, 9, 540, 473);
		getContentPane().add(textArea);
		//-----------------
		final JScrollPane thePane = new JScrollPane(textArea);
		thePane.setBounds(40, 133, 273, 338);
		getContentPane().add(thePane);
		
		//Boton para calcular la ruta
		final JButton botonCalcular = new JButton("Calcular");

		//Desplegables
		accionOrigen = new ItemListener() { 
			//metodo que se ejecuta cuando un item es seleccionado
			public void itemStateChanged(ItemEvent e) { 
				if (origen.getSelectedIndex() != -1) {                     
					origenSelec = (String) origen.getItemAt(origen.getSelectedIndex()); 
					System.out.println(origenSelec);
				}
				destino.setEnabled(true);
			} 

		};
		accionDestino = new ItemListener() { 
			//metodo que se ejecuta cuando un item es seleccionado
			public void itemStateChanged(ItemEvent e) { 
				if (destino.getSelectedIndex() != -1) {                     
					destinoSelec = (String) destino.getItemAt(destino.getSelectedIndex()); 
				} 
				Estacion[] A = Metro.getA();
				Estacion[] B = Metro.getB();
				Estacion[] C = Metro.getC();
				
				System.out.println(destinoSelec);
				if(estOrigen == null){
					boolean found3 = false;
					for (int i = 0; i < A.length&&!found3; i++) {
						if(A[i].getNombre().compareTo(origenSelec)==0){
							found3 = true;
							estOrigen = A[i];
						}//end if
					}//end for i
					for (int i = 0; i < B.length&&!found3; i++) {
						if(B[i].getNombre().compareTo(origenSelec)==0){
							found3 = true;
							estOrigen = B[i];
						}//end if
					}//end for i
					for (int i = 0; i < C.length&&!found3; i++) {
						if(C[i].getNombre().compareTo(origenSelec)==0){
							found3 = true;
							estOrigen = C[i];
						}//end if
					}//end for i
					
				}//if(origen == null)
				else{
					boolean found = false;
					for (int i = 0; i < A.length&&!found; i++) {
						if(A[i].getNombre().compareTo(destinoSelec)==0){
							found = true;
							estDest = A[i];
							boolean found2 = false;
							for (int j = 0; j < A.length && !found2; j++) {
								if(A[j].getNombre().compareTo(origenSelec)==0){
									found2 = true;
									estOrigen = A[j];
								}//end if
							}//end for j
						}//end if
					}//end for i
					for (int i = 0; i < B.length&&!found; i++) {
						if(B[i].getNombre().compareTo(destinoSelec)==0){
							found = true;
							estDest = B[i];
							boolean found2 = false;
							for (int j = 0; j < B.length && !found2; j++) {
								if(B[j].getNombre().compareTo(origenSelec)==0){
									found2 = true;
									estOrigen = B[j];
								}//end if
							}//end for j
						}//end if
					}//end for i
					for (int i = 0; i < C.length&&!found; i++) {
						if(C[i].getNombre().compareTo(destinoSelec)==0){
							found = true;
							estDest = C[i];
							boolean found2 = false;
							for (int j = 0; j < C.length && !found2; j++) {
								if(C[j].getNombre().compareTo(origenSelec)==0){
									found2 = true;
									estOrigen = C[j];
								}//end if
							}//end for j
						}//end if
					}//end for i
					
				}//else
				botonCalcular.setEnabled(true);
			} 

		};
		origen = new JComboBox();
		origen.setBounds(110, 8, 140, 20);
		destino = new JComboBox();
		destino.setBounds(110, 48, 140, 20);
		destino.setEnabled(false);
		//Indtroduccion de paradas
		final String[] paradas = new String[] {"", "Adolfo Prieto", "Alameda", "Alfonso Rey", "Anahuao", "Aztlan", "Central",
				 "Conchello", "Cuauhlemoc", "Del Golfo", "Edison", "Eloy Cavazas", "Exposicion", "Felix U Gomez", "Fundadores",
				 "General Anaya", "General I Zaragoza", "Hospital", "Hospital Metropolitano", "Lerdo de Tejera", "Los Angeles", 
				 "Mitras", "Niños Heroes", "Padre Mier", "Parque Fundidora", "Penitenciaria", "Regina", "Ruiz Cortines",
				 "San Bernabe", "San Nicolas", "Santiago Tapia", "Santa Lucia", "Sendero", "Simon Bolivar", "Talleres",
				 "Unidad Modelo", "Universidad","Violeta", "Y Griega"};
		//Indtroduccion de origen en el desplegable
		origen.setModel(new DefaultComboBoxModel(paradas));
		//Indtroduccion de paradas destino en el desplegable
		destino.setModel(new DefaultComboBoxModel(paradas));
		origen.addItemListener(accionOrigen);
		destino.addItemListener(accionDestino);
		getContentPane().setLayout(null);



		//Aniadir elementos
		getContentPane().add(origen); 
		getContentPane().add(txtOrigen);
		getContentPane().add(destino);
		getContentPane().add(txtDestino);

		//edicion del boton y asignacion de funcion

		botonCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==botonCalcular) {
					try {
						System.out.println(estOrigen.toString());
						System.out.println(estDest.toString());
						List<Estacion> recorrido = metro.aEstrella(estOrigen, estDest);
						ListIterator<Estacion> it1 = recorrido.listIterator(recorrido.size());
						recorridoString = "";
						while(it1.hasPrevious()){
							Estacion estMostrar = it1.previous();
							if(recorrido.lastIndexOf(estMostrar) > 1 && recorrido.get(recorrido.lastIndexOf(estMostrar)).getNombre().compareTo(recorrido.get(recorrido.lastIndexOf(estMostrar)-1).getNombre())==0){			
								recorridoString += "Haz transbordo en " + estMostrar.getNombre() + " a la linea " +recorrido.get(recorrido.lastIndexOf(estMostrar)-1).getLinea()+"\n";
							}
							else if(recorrido.listIterator().next().equals(estMostrar)){recorridoString += estMostrar.getNombre() + " - Linea "+estMostrar.getLinea()+"\n";}
							else{recorridoString += estMostrar.getNombre() + " - Linea "+estMostrar.getLinea() +"\n";}
						}
						System.out.println(recorridoString);
						textArea.setText(recorridoString);
						origen.setSelectedIndex(0);
						destino.setSelectedIndex(0);
						origenSelec = null;
						destinoSelec = null;
						estDest = null;
						estOrigen = null;
						destino.setEnabled(false);
						botonCalcular.setEnabled(false);
						final JPanel jp = new JPanel();
				        jp.add(new JComponent() {
				            public void paintComponent(Graphics g) {
				                Graphics2D g2 = (Graphics2D) g;
				                g2.setStroke(new BasicStroke(5));
				               //Linea E
				                g2.setColor(new Color(0, 0, 143));
				                g2.draw(new Line2D.Float(150, 20, 300, 20));
				                g2.draw(new Line2D.Float(300, 20, 330, 60));
				                g2.draw(new Line2D.Float(330, 60, 330, 400));
				                //Linea D
				                g2.setColor(new Color(0, 210, 255));
				                g2.draw(new Line2D.Float(325, 200, 325, 400));
				                g2.draw(new Line2D.Float(325, 400, 150, 400));
				                //g2.draw(new Line2D.Double(p1, p2));
				            }
				        });
				        jp.setBounds(345, 20, 637, 540);
				        jp.setVisible(true);

					} catch (NotSameLineException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		botonCalcular.setBounds(47, 98, 182, 23);
		getContentPane().add(botonCalcular);
		botonCalcular.setEnabled(false);

		final JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(110, 497, 117, 29);
		getContentPane().add(btnSalir);

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnSalir) {
					System.exit(getDefaultCloseOperation());
				}
			}
		});

		//Caracteristicas del frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(1031, 619); 
		setVisible(true); 

	}//Constructor

	/*Metodo birlado de StackOverflow para reescalar imagenes
	 * Gracias David Kroukamp (http://stackoverflow.com/users/1133011/david-kroukamp)
	 * */
	private static BufferedImage resize(BufferedImage image, int width, int height) {
	    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
	    Graphics2D g2d = (Graphics2D) bi.createGraphics();
	    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
	    g2d.drawImage(image, 0, 0, width, height, null);
	    g2d.dispose();
	    return bi;
	}


	public static void main(String[] args) 
	{ 
		try {
			new MetroIG();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	} 
}

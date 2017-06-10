package paquete;

import java.util.ArrayList;

public class Universidad{
	
	private String nombre;
	private ArrayList<Aula> aulas;
	private int cantAulas;
	
	public Universidad (String nom){
		nombre = nom;
		aulas = new ArrayList<Aula>();
		cantAulas = 0;
	}
	
	public String getNombre(){
		return nombre;}

	public int getCantAulas(){
		return cantAulas;}
	
	private void aumentarCantAulas(){
		this.cantAulas++;}
	
	public Aula getAula(int i){
		return aulas.get(i);}
	
	public Aula getUltimaAula(){
		return aulas.get(getCantAulas()-1);}
	
	public void agregarAula()
	{
		Aula nueva = new Aula((00+getCantAulas()+1));
		aulas.add(nueva);
		aumentarCantAulas();
	}
	
	public void agregarMateria (Materia m)
	{
		for (int i=0; i<aulas.size(); i++)
		{
			if (getAula(i).estaLibrePara(m))
			{
				getAula(i).meterMateria(m);
				return;
			}
		}
		agregarAula();
		getUltimaAula().meterMateria(m);
	}
	
	
	public String verFacultad(){
		String retorno="";
		for (int i=0; i<cantAulas; i++){
			retorno=retorno+this.getAula(i).verAula()+"\n";
		}
		return retorno;
	}
	

	public void organizar(MateriasJSON materias)
	{
		for (int i=0; i<materias.tamaño(); i++){
			this.agregarMateria(materias.dame(i));
		}
	}
	

public static void main(String[] args){
	
	Universidad facu = new Universidad("UNGS");
		
	MateriasJSON oferta = new MateriasJSON();
       
    oferta = MateriasJSON.leerJSON("Oferta Academica.json");
		
    facu.organizar(oferta);;
		
    //Imprime materias del JSON
    for (int x=0; x<oferta.tamaño(); x++){
		System.out.println(oferta.dame(x).toString());}
	
	//Imprime aulas	
    System.out.println(facu.verFacultad());}


}

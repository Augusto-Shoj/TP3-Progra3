package paquete;

import java.util.TreeMap;
import java.util.Iterator;

public class Aula {

	private int numero;
	private TreeMap<Integer, String > horarios;
	private int materias;
	
	public Aula(int num)
	{
		this.numero = num;
		this.materias=0;
		this.horarios = new TreeMap<Integer, String>();
			for (int i=8; i<22; i++)
				this.horarios.put(i, null);		
	}
	
	public void meterMateria(Materia m)
	{
		if (estaLibrePara(m)){
			for (int i=m.getHoraInicio(); i<m.getHoraFinal(); i++)
				horarios.put(i, m.getNombreMateria());
			this.materias++;}			
	}
	
	public boolean estaLibrePara(Materia m)
	{		
		for (int i=m.getHoraInicio(); i<m.getHoraFinal(); i++){
			if (horarios.get(i)!= null) 
			return false;}
		return true;
	}
	
	public int getCantMaterias (){
		return materias;}
	
	public String verAula ()
	{
		String retorno ="";
		Iterator<Integer> it = this.horarios.keySet().iterator();
		while(it.hasNext())
		{
		  Integer key = it.next();
		  if (this.horarios.get(key)!=null)
		  retorno = retorno + "Aula " + numero + " - Hora: " + key + ":00 - Materia: " + this.horarios.get(key)+"\n";
		}
		return retorno;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public String getNombre(int i){
		
			return this.horarios.get(i);
			}
		
	
}
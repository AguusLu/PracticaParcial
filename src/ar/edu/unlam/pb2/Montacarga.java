package ar.edu.unlam.pb2;

import java.util.Collection;
import java.util.TreeSet;

public class Montacarga {
	
	private TreeSet<Carga> cargas; 
	private Integer sumatoria;
	
	public Integer getSumatoria() {
		return sumatoria;
	}

	public void setSumatoria(Integer sumatoria) {
		this.sumatoria = sumatoria;
	}

	public void sumatoriaDeCargas(Carga cargas)
	{
		Integer peso;
		peso = cargas.getPeso();
		for(int i=0; i<obtenerCantidadDeCargas();i++)
		{	
			sumatoria = sumatoria + peso;
		}
		
		this.setSumatoria(sumatoria);
	}
	
	public Integer obtenerCantidadDeCargas()
	{
		return this.cargas.size();
	}
	
	public void ingresarCarga(Carga cargas) throws Exception
	{
		if(!this.cargas.add(cargas));
		{
			{
				throw new Exception("No se admiten" + cargas.getPeso());
			}
		}
	}
	
	public TreeSet<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(TreeSet<Carga> cargas) {
		this.cargas = cargas;
	}

}

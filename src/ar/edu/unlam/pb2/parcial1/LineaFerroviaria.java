package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;

public class LineaFerroviaria {
	
	private ArrayList<Sube> listaDeUsuarios;
	public static Double tarifa;
	public static Double tarifaDos = 24.0;

	public LineaFerroviaria() {

		this.tarifa = 24.0;
		this.listaDeUsuarios = new ArrayList<Sube>();

	}
	public Integer tamañoDelistaDeUsuarios() {
		
		return this.listaDeUsuarios.size();
		
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public void setListaDeUsuarios(ArrayList<Sube> listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}

	public Boolean agregarUsuarios(Sube sube) {
		Boolean seAgrego = false;
		if (!this.buscarSube(sube)) {

			listaDeUsuarios.add(sube);
			seAgrego = true;
			return seAgrego;

		}

		return seAgrego;
	}

	public ArrayList<Sube> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public Boolean buscarSube(Sube sube) {
		Boolean subeBuscada = false;
		for (Integer i = 0; i < listaDeUsuarios.size(); i++) {

			if (listaDeUsuarios.get(i).getCodigo().equals(sube.getCodigo())) {
				subeBuscada = true;
				return subeBuscada;
			}
		}

		return subeBuscada;

	}

}

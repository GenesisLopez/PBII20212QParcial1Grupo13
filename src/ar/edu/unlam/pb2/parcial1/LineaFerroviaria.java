package ar.edu.unlam.pb2.parcial1;

public class LineaFerroviaria {
	private Sube[] listaDeUsuarios;
	private Double tarifa;

	public LineaFerroviaria() {
		Integer CantidadadDeUsuario = 1000;
		this.tarifa = 24.0;
		this.listaDeUsuarios = new Sube[CantidadadDeUsuario];

	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public void setListaDeUsuarios(Sube[] listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}

	public Boolean agregarUsuarios(Sube sube) {
		Boolean seAgrego = false;
		if (!this.buscarSube(sube)) {
			for (Integer i = 0; i < listaDeUsuarios.length; i++) {
				if (listaDeUsuarios[i] == null) {
					listaDeUsuarios[i] = sube;
					seAgrego = true;
					return seAgrego;
				}

			}
		}
		return seAgrego;
	}

	public Sube[] getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public Boolean buscarSube(Sube sube) {
		Boolean subeBuscada = false;
		for (Integer i = 0; i < listaDeUsuarios.length; i++) {
			if (this.listaDeUsuarios[i] != null) {
				if (listaDeUsuarios[i].getCodigo().equals(sube.getCodigo())) {
					subeBuscada = true;
					return subeBuscada;
				}
			}
		}
		return subeBuscada;

	}

}

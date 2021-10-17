package ar.edu.unlam.pb2.parcial1;

public class LineaFerroviaria {
	private Sube[] listaDeUsuarios;

	public LineaFerroviaria() {
		Integer CantidadadDeUsuario = 1000;
		this.listaDeUsuarios = new Sube[CantidadadDeUsuario];
	}

	public Boolean agregarUsuarios(Sube sube) {
		Boolean seAgrego = false;
		for (Integer i = 0; i < listaDeUsuarios.length; i++) {
			if (listaDeUsuarios[i] == null ) {
				listaDeUsuarios[i] = sube;
				seAgrego = true;
				return seAgrego;
			}

		}
		return seAgrego;
	}



	public Sube[] getListaDeUsuarios() {
		return listaDeUsuarios;
	}
	public Boolean buscarSube(Sube sube) {
		Boolean subeBuscada=false;
		for(Integer i=0;i<listaDeUsuarios.length;i++) {
			if(this.listaDeUsuarios[i]!=null) {
			if(listaDeUsuarios[i].getCodigo().equals(sube.getCodigo())) {
				subeBuscada=true;
				return subeBuscada;
			}
		}
		}
		return subeBuscada;
	
	}
	
	

}

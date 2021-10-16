package ar.edu.unlam.pb2.parcial1;

public class LineaFerroviaria {
	private Integer listaDeUsuarios[];
	
	
	public LineaFerroviaria() {
		Integer CantidadadDeUsuario=1000;
		this.listaDeUsuarios= new Integer[CantidadadDeUsuario];
	}
	public void agregarUsuarios(Sube sube) {
		for(Integer i =0; i<listaDeUsuarios.length;i++) {
			if(listaDeUsuarios[i]==null ) {
				
			}
		}
	}
	public Integer[] getListaDeUsuarios() {
		return listaDeUsuarios;
	}
	public void setListaDeUsuarios(Integer[] listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}
	public Boolean buscarSube(Sube sube) {
		Boolean estaEnLista= false;
		for(Integer i =0; i<listaDeUsuarios.length;i++) {
			if(listaDeUsuarios[i].equals(sube)&&listaDeUsuarios[i]!=null) {
				estaEnLista=true;
			}
		}
		return estaEnLista;
	}
	
		
	
}

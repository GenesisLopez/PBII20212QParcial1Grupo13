package ar.edu.unlam.pb2.lineaFerroviria;

public class LineaFerroviaria {
	private Sube listaDeUsuarios[];
	
	
	public LineaFerroviaria() {
		Integer CantidadadDeUsuario=1000;
		this.listaDeUsuarios= new Sube[CantidadadDeUsuario];
	}
	public void agregarUsuarios(Sube sube) {
		for(Integer i =0; i<listaDeUsuarios.length;i++) {
			if(listaDeUsuarios[i]==null ) {
				listaDeUsuarios[i] = sube;
				
			}
		}
	}
	
	
	
	public Sube[] getListaDeUsuarios() {
		return listaDeUsuarios;
	}
	
	
	
	public void setListaDeUsuarios(Sube[] listaDeUsuarios) {
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
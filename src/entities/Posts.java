package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentarios> comentarios = new ArrayList<>();

	
	public Posts() {
	
	}


	public Posts(Date momento, String titulo, String conteudo, Integer likes) {
		
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public List<Comentarios> getComentarios() {
		return comentarios;
	}


	public void addComentarios(Comentarios comentario) {
		//a lista de comentarios recebe o comentario
		comentarios.add(comentario);
	}
	
	public void RemoveComentarios(Comentarios comentario) {
		//a lista de comentarios remove o comentario
		comentarios.remove(comentario);
	}


	@Override
	public String toString() {
		
		//stringBuilder concatena as strings
		StringBuilder sb = new StringBuilder();
		sb.append("Posts \n momento= " + momento );
		sb.append(" \n Titulo= " + titulo );
		sb.append("\n Conteúdo= " + conteudo );
		sb.append("\n Likes= " + likes );
		sb.append("\n Comentários= "  );
		
		//percorre a lista de comentarios e concatena no StringBuilder
	    for(Comentarios c :  comentarios) {
	    	sb.append("\n" + c.getTexto());
	    }
	    
	    // retorna todo stringBuilder concatenado
	    return sb.toString();
	}
	
	
	
}


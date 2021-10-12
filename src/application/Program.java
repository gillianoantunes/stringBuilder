package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comentarios;
import entities.Posts;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//este projeto recebe dados no momento da instanciaçao do objeto
		
		//formatar data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// instancia um post com data, titulo e conteudo
				Posts post = new Posts(sdf.parse("21/06/2021 13:42:05"),"Viagem nos Estados Unidos", "Passeio com minha família em outro país",12);
				
				//instancia os comentarios no objeto comentario
				Comentarios comentario1 = new Comentarios(" Parabéns , lugar lindo");
				// a lista comentario recebe novo comentario
				Comentarios comentario2 = new Comentarios("Família linda");
				
				//adiciona no post o comentario
				post.addComentarios(comentario1);
			    //adiciona novamente no post o comentario
			    post.addComentarios(comentario2);
				
				System.out.println(post.toString());
				
				
				// novo post
				
				// instancia um post com data, titulo e conteudo
				Posts post2 = new Posts(sdf.parse("21/06/2021 13:42:05"),"Viagem a Europa", "Passeio com namorada",30);
				
				//instancia os comentarios no objeto comentario
				Comentarios comentario3 = new Comentarios(" Casal Perfeito");
				// a lista comentario recebe novo comentario
			    Comentarios comentario4= new Comentarios("É o amor");
			    
				//adiciona no post o comentario
				post2.addComentarios(comentario3);
			    //adiciona novamente no post o comentario
			    post2.addComentarios(comentario4);
			    
			    
				System.out.println("----------------------");
				System.out.println(post2.toString());
		}

}

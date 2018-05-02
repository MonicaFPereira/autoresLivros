package br.org.site.autores.rest;

import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import br.org.site.autores.modelo.Author;

@Component
public class AuthorsList {
	
	public Optional<Author> request(Author author) {
		
	RestTemplate client = new RestTemplate();
	
    String nome = author.getLastName().replace(" ", "+");
    
	String url = String.format("https://bibliapp.herokuapp.com/api/authors?nome=%s");

	try {
		
		Author autorConsulta = client.getForObject(url, Author.class);
		return Optional.of(autorConsulta);
		
	} catch (RestClientException e) {
		return Optional.empty();
	}
}


}

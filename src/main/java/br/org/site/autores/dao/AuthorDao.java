package br.org.site.autores.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.org.site.autores.modelo.Author;

@Repository
public class AuthorDao {


	    @PersistenceContext
	    private EntityManager manager;


	    public Author findOne(Integer id) {
	        return manager.find(Author.class, id);
	    }

	    public void save(Author author) {
	        manager.persist(author);
	    }

	    public List<Author> findAll(Integer id) {
	    	return manager.createQuery("select f from Author f", Author.class).getResultList();
	    }

	    public void delete(Integer id) {
	        manager.remove(findOne(id));
	    }
}

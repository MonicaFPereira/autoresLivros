package br.org.site.autores.dao;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.org.site.autores.jdbc.ConnectionFactory;


public class BookDao {

	private Connection connection;

	public BookDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

//	public void adiciona(Book book) {
//		
//		String sql = "insert into book " + "(authorId, title, isbn) " + "values (?,?,?,?) ";
//
//		try {
//
//			PreparedStatement stmt = connection.prepareStatement(sql);
//
//			stmt.setInt(1, book.);
//			stmt.setString(2, book.getTitle());
//			stmt.setString(3, book.getIsbn());
//
//			stmt.execute();
//			stmt.close();
//
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}

//	}

//	public List<Book> getLista() {
//		try {
//			List<Livro> livros = new ArrayList<Livro>();
//
//			PreparedStatement stmt = this.connection.prepareStatement("select authorId, title, isbn from book");
//			ResultSet rs = stmt.executeQuery();
//
//			while (rs.next()) {
//				Book book = new Book();
//				book.se(rs.getString("authorId"));
//				book.setEditora(rs.getString("title"));
//				book.setEdicao(rs.getInt("isbn"));
//
//				livros.add(book);
//			}
//			rs.close();
//			stmt.close();
//			return livros;
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}

//	public void altera(Book book) {
//
//		String sql = "update livro set titulo=?, editora=? edicao=?, anoPublicao=? where id=?";
//
//		try {
//
//			PreparedStatement stmt = connection.prepareStatement(sql);
//
//			stmt.setString(1, book.ge());
//			stmt.setString(2, book.getEditora());
//			stmt.setInt(3, book.getEdicao());
//			stmt.setString(4, book.getAnoPublicacao());
//
//			stmt.execute();
//			stmt.close();
//
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}

//	public void remove(Livro livro) {
//
//		try {
//
//			PreparedStatement stmt = connection.prepareStatement("delete from livro where id=?");
//
//			stmt.setLong(1, livro.getId());
//
//			stmt.execute();
//			stmt.close();
//
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//
//	}

}

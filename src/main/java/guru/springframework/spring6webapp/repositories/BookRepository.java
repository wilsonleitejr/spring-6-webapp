package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domains.Book;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
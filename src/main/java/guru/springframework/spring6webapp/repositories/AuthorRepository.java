package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domains.Author;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domains.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}

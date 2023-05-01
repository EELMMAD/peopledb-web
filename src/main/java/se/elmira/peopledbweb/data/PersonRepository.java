package se.elmira.peopledbweb.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.elmira.peopledbweb.biz.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {


}

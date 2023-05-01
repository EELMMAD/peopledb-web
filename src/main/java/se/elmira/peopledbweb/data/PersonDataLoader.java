package se.elmira.peopledbweb.data;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import se.elmira.peopledbweb.biz.model.Person;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Component
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepository personRepository;

    //To Spring: I want you to give me an instance of your person repository after you made one
    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
            List<Person> people= List.of(new Person(10L, "Marita", "Tania", LocalDate.of(1950, 1, 1), new BigDecimal("50000")),
                    new Person(null, "Elmira", "Madadi", LocalDate.of(1960, 2, 2), new BigDecimal("60000")),
                    new Person(null, "Noura", "Nunish", LocalDate.of(1970, 3, 3), new BigDecimal("70000")),
                    new Person(null, "Lena", "Eskandar", LocalDate.of(1980, 4, 4), new BigDecimal("80000")),
                    new Person(null, "Niala", "Parnian", LocalDate.of(1980, 4, 4), new BigDecimal("90000")),
                    new Person(null, "Nahid", "Mark", LocalDate.of(1980, 4, 4), new BigDecimal("10000")),
                    new Person(null, "Azin", "Alice", LocalDate.of(1980, 4, 4), new BigDecimal("11000")),
                    new Person(null, "Peter", "Smith", LocalDate.of(1980, 4, 4), new BigDecimal("120000"))

            );
            personRepository.saveAll(people);
        }
    }
}

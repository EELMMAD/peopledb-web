package se.elmira.peopledbweb.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import se.elmira.peopledbweb.biz.model.Person;
import se.elmira.peopledbweb.data.PersonRepository;

@Controller
@RequestMapping("/people")
public class peopleController {

   private PersonRepository personRepository;


    public peopleController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @ModelAttribute("people")
    public Iterable<Person> getPeople(){
    return personRepository.findAll();
    }

    @GetMapping
    public String showPeoplePage() {
        return "people";
    }
}

package demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lenovo on 2015-06-30.
 */
//@RequestMapping mozna tez dodac nad klase wtedy kazda metoda jest elementem adresu

@RestController
public class MyTestController {

    @RequestMapping(value= "/user", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity(HttpStatus.CREATED);

//        throw new NotFoundException();
    }

//    @ResponseStatus(reason = "cannot find object...", value = HttpStatus.NOT_FOUND)
//    @ExceptionHandler(NotFoundException.class)
//    public void rollback

    @ResponseStatus(reason = "cannot find object...", value = HttpStatus.NOT_FOUND)
    static class NotFoundException extends RuntimeException {

    }

    @RequestMapping(value= "/user", method = RequestMethod.GET)
    public List<User> getUsers() {
        return Arrays.asList(new User("Aneta", "haselko"), new User("Bartek", "haselko"));
    }

//    @RequestMapping(value= "/user/{username}", method = RequestMethod.GET)
//    public User getUser(@PathVariable String username, @RequestParam(required = false) String password) {
//        System.out.println(username);
//        return new User(username, password);
//    }

}

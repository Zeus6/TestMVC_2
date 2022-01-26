package appprueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClasePrueba {
    String dato1;

    @RequestMapping("/")
    //@GetMapping("/")
    public String mainPage() {
        return "Hola";
    }
}

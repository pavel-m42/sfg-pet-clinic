package pavel.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Fhoenix on 2021/03/07.
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String listVets() {
        return "vets/index";
    }
}

package pl.piotrdawidziuk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/i")
    public String index() {
        return "index.html";
    }

}

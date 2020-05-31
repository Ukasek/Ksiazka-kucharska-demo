package ksiazka.demo;

import ksiazka.demo.ksiazka.KsiazkaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private KsiazkaRepository ksiazkaRepository;

    public HomeController(KsiazkaRepository ksiazkaRepository) {
        this.ksiazkaRepository = ksiazkaRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("ksiazki", ksiazkaRepository.findAll());
        return "home";
    }
}

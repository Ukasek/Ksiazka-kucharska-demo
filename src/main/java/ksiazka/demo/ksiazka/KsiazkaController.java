package ksiazka.demo.ksiazka;

import ksiazka.demo.kategorie.Kategoria;
import ksiazka.demo.kategorie.KategoriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class KsiazkaController {

    private KsiazkaRepository ksiazkaRepository;
    private KategoriaRepository kategoriaRepository;

    public KsiazkaController(KsiazkaRepository ksiazkaRepository, KategoriaRepository kategoriaRepository) {
        this.ksiazkaRepository = ksiazkaRepository;
        this.kategoriaRepository = kategoriaRepository;
    }

    @GetMapping("/ksiazka/{id}")
    public String ksiazka(@PathVariable Long id, Model model) {

        Optional<Ksiazka> ksiazkaOptional = ksiazkaRepository.findById(id);

        if (ksiazkaOptional.isPresent()) {
            Ksiazka ksiazka = ksiazkaOptional.get();
            List<Kategoria> kategoria = kategoriaRepository.findByKsiazka(ksiazka);
            model.addAttribute("ksiazka", ksiazka);
            model.addAttribute("kategorie", kategoria);

            return "ksiazka";
        } else {
            return "error";
        }
    }
}
//package ksiazka.demo.kategorie;
//
//import ksiazka.demo.ksiazka.KsiazkaRepository;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//import java.util.Optional;
//
//public class KategoriaController {
//   private KategoriaRepository kategoriaRepository;
//   private KsiazkaRepository ksiazkaRepository;
//
//   public KategoriaController(KategoriaRepository kategoriaRepository, KsiazkaRepository ksiazkaRepository) {
//      this.kategoriaRepository = kategoriaRepository;
//      this.ksiazkaRepository = ksiazkaRepository;
//   }
//   @GetMapping("/ksiazka/{id}")
//   public String ksiazka(@PathVariable Long id, Model model) {
//
//      Optional<Kategoria> kategoriaOptional = kategoriaRepository.findById(id);
//
//      if(kategoriaOptional.isPresent()){
//         Kategoria kategoria = kategoriaOptional.get();
//         List<Kategoria> kategoria2 = kategoriaRepository.findByKsiazka(kategoria);
//      }
//   }
//}

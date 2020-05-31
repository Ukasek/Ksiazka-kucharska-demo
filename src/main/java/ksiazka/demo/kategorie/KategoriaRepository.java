package ksiazka.demo.kategorie;

import ksiazka.demo.ksiazka.Ksiazka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KategoriaRepository extends JpaRepository<Kategoria, Long> {

    List<Kategoria> findByKsiazka(Ksiazka ksiazka);

}

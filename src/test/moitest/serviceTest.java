package moitest;

import moi.Voiture;
import moi.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class serviceTest {
    private service service;
    private Voiture v1;

    @BeforeEach
    void setUp() {
        service = new service();
        v1 = new Voiture("Tesla", 5000);
    }

    @Test
    void testAjouter() {
        service.ajouter(v1);
        assertEquals(1, service.getListeVoiture().size());
        assertEquals(v1, service.getListeVoiture().get(0));
    }

    @Test
    void testPrix() {
        service.ajouter(v1);
        assertEquals(5000, service.prix());
    }
}

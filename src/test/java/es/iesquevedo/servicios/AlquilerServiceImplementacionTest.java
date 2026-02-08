package es.iesquevedo.servicios;

import es.iesquevedo.modelo.Alquiler;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlquilerServiceImplementacionTest {

    @Test
    void listarAlquileres() {
        AlquilerServiceImplementacion alquilerService =
                new AlquilerServiceImplementacion("src/test/resources/_test");

        List<Alquiler> alquileres = alquilerService.listarAlquileres();
    }
}
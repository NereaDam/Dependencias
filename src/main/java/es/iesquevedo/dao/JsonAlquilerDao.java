package es.iesquevedo.dao;

import com.google.gson.reflect.TypeToken;
import es.iesquevedo.modelo.Alquiler;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface JsonAlquilerDao {
    default void load() {}

    default void persist() {}

    Alquiler save(Alquiler alquiler);

    Optional<Alquiler> findById(Long id);

    List<Alquiler> findAll();

    List<Alquiler> findBySocio(String dni);

    List<Alquiler> findActiveByPelicula(String titulo);

    boolean deleteById(Long id);
}

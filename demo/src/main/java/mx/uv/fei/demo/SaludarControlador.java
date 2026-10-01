package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class SaludarControlador {

    String nombre;

    @GetMapping("/saludos")
    public String saludar(){
        return "hola mundo " + nombre;
    } 

    @GetMapping("/despedidas")
    public String despedirse(){
        return "adios mundo";
    }

    @PostMapping ("/nombramientos")
    public void nombre(){
        nombre = "Dana";
    }

    @PutMapping ("/nombramientos")
    public void remplazarNombre(){
        nombre = "Pepis";
    }

    @DeleteMapping ("/nombramientos")
    public void borrarNombre(){
        nombre = null;
    }
}
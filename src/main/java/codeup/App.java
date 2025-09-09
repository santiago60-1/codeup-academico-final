package main.java.codeup.academico;

import main.java.codeup.academico.domain.Estudiante;

public class App {

    public static void main(String[] args) {
        System.out.println("Sistema academico codeUp iniciado correctamente");
        Estudiante estudiante = new Estudiante("1","santiago ortega");
        System.out.println("Estudiante creado: " + estudiante.getNombre() + " (ID: " +estudiante.getId() + ")");
    }

}

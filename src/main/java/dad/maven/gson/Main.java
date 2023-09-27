package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recoger datos desde la consola
        System.out.print("Introduzca su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduzca sus apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Introduzca su edad: ");
        Integer edad = scanner.nextInt();

        // Crear un objeto Persona
        Persona p = new Persona(nombre, apellidos, edad);

        // Mostrar los datos de la persona
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellidos: " + p.getApellidos());
        System.out.println("Edad: " + p.getEdad());

        // Convertir el objeto Persona a JSON
        Gson gson = new Gson();
        String json = gson.toJson(p);

        // Mostrar el JSON en la consola
        System.out.println("Objeto Persona en formato JSON:");
        System.out.println(json);

    }
}
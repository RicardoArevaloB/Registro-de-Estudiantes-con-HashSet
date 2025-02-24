package com.example;

import java.util.HashSet;
import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> estudiantes = new HashSet<>();

        System.out.print("¿Cuántos estudiantes desea registrar? ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            estudiantes.add(nombre);
        }

        System.out.println("\nLista de estudiantes registrados:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        System.out.print("\nIngrese el nombre de un estudiante para verificar si está en la lista: ");
        String buscarNombre = scanner.nextLine();
        if (estudiantes.contains(buscarNombre)) {
            System.out.println("El estudiante '" + buscarNombre + "' SÍ está en la lista.");
        } else {
            System.out.println("El estudiante '" + buscarNombre + "' NO está en la lista.");
        }

        scanner.close();
    }
}

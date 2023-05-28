
package com.mycompany.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduce {

        public static void main(String[] args) {

                List<Double> salaries = Arrays.asList(10.0, 20.0, 25.0, 21.0, 20.0);
                System.out.println("***  Uso de Map en Java.  ***\nLista de salarios: " + salaries);

                // Calcular el cuadrado de cada item en la lista usando .map
                List<Double> squaredSalaries = salaries.stream()
                                .map(x -> x * x)
                                .collect(Collectors.toList());

                System.out.println("Cuadrados de los salarios: " + squaredSalaries);

                // Calcular la suma total de los salarios en la lista (usando .reduce), y hallar
                // su promedio
                Double suma = salaries.stream().reduce(0.0, (partialResult, value) -> partialResult + value);
                Double promedio = suma / salaries.size();

                System.out.println("\n***  Uso de Reduce en Java.  ***\nSuma total de salarios es: " + suma);
                System.out.println("Promedio de salarios es: " + promedio);

                // Trabajemos con diccionarios (python). Se crea la clase Estudiante para hacer
                // una lista de objetos tipo Estudiante
                List<Estudiante> estudiantes = Arrays.asList(
                                new Estudiante("Héctor", true, 4.8),
                                new Estudiante("Diana", false, 3.5),
                                new Estudiante("Jose", true, 4.0),
                                new Estudiante("Maria", false, 4.9));

                // Obtendremos la suma de las notas de todos los estudiantes, usando map, reduce
                // y lambdas
                //
                List<Double> lista_notas = estudiantes.stream().map(estudiante -> estudiante.getPromedio()).collect(Collectors.toList());

                Double suma_promedios = lista_notas.stream()
                .reduce(Double.valueOf(0.0), (valor, nota) -> valor + nota);
                // Double suma_promedios = estudiantes.stream()
                //                 .map(estudiante -> estudiante.getPromedio())
                //                 .reduce(Double.valueOf(0.0), (valor, estudiante) -> valor + estudiante);
                Double p_promedios = suma_promedios / estudiantes.size();
                System.out.println("\n***  Uso de .map, .reduce y lambdas en una lista de objetos.  ***");

                System.out.println("Lista de notas: " + lista_notas);
                System.out.println("Total de notas: " + suma_promedios);
                System.out.println("Promedio de notas de los estudiantes: " + p_promedios);

                // Uso de filtros en una lista
                // Encontraremos los numeros impares en una lista de numeros enteros
                List<Integer> enteros = Arrays.asList(10, 15, 2, 17, 4, 3, 1, 2);
                List<Integer> impares = enteros.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
                System.out.println("\n***  Uso de filtros. Encontrar los numeros impares de una lista.  ***");
                System.out.println("Lissta de numeros enteros: " + enteros);
                System.out.println("Filtro de impares: " + impares);

                // Uso de filtros en una lista de objetos
                // Encontraremos las estudiantes mujeres en la lista de estudiantes
                List<String> lista_estudiantes = estudiantes.stream().map(estudiante -> estudiante.getFormatoString())
                                .collect(Collectors.toList());

                List<String> mujeres = estudiantes.stream().filter(estudiante -> !estudiante.getIsMale())
                                .map(estudiante -> estudiante.getFormatoString()).collect(Collectors.toList());
                System.out.println("\n***  Uso de filtros. Listar las estudiantes mujeres de la lista de estudiantes.  ***");

                System.out.println("Listado de estudiantes: " + lista_estudiantes);
                System.out.println("\nMujeres: " + mujeres);

        }
}

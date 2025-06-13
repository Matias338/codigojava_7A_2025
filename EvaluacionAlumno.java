public class EvaluacionAlumno {
    public static void main(String[] args) {
        // Definir las notas (podés cambiar los valores para probar)
        double nota1 = 1.0;
        double nota2 = 2.5;
        double nota3 = 3.5;

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Evaluar con un solo if
        if (promedio >= 7)
            System.out.println("Aprobado");
        else
            System.out.println("Reprobado");
    }
}


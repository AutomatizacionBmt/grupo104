package sesion01;

import java.util.Scanner;

/*
1. El primer paso es que obtendríamos la cantidad de horas trabajadas.
2. Luego, obtenemos la tarifa de pago por hora.
3. Luego, multiplicamos las horas y la tasa de pago.
4. Finalmente, mostraríamos el resultado.
 */
public class CalculaSalarioBruto {


    public static void main(String[] args) {

        // TipodeDato nombreVariable;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese horas trabajadas");
        int horas = scanner.nextInt();

        System.out.println("Ingrese su tarifa de pago");
        double tarifa = scanner.nextDouble();

        double salario = obtenerSalario(horas, tarifa);

        System.out.println("El Salario bruto calculado es: " + salario);

    }

    public static double obtenerSalario(int horas, double tarifa) {
        return horas * tarifa;
    }

}

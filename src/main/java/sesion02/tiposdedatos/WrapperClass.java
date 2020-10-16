package sesion02.tiposdedatos;



public class WrapperClass {

    public static void main(String[] args) {
        String numeroString = "10";

        Integer miInteger = new Integer("13"); // ocupa mayor memoria
        Integer numeroInt = Integer.parseInt(numeroString);

        if (numeroInt.equals(10)) {
            System.out.println("Son iguales");
        }

        double[] numeros = {10.2, 12.4, 15.8, 20.9};
        for(Double numero : numeros) {
            System.out.println("Numero entero: " + numero.intValue());
        }
    }
}

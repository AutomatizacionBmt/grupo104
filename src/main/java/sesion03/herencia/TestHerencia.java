package sesion03.herencia;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Giancarlo", "123212", "Programador Java");
        Empleado empleado2 = new Empleado("Elvis", 28, "Masculino" , "1233456", "Analista de Calidad");

        empleado.nombre = "Gian";
        empleado.edad = 29;
        empleado.genero = "Masculino";

        System.out.println(empleado);
        System.out.println(empleado2);

        empleado.saludar();
        empleado2.saludar();

        Madre madre = new Madre("Angela");
        System.out.println(madre);
    }
}

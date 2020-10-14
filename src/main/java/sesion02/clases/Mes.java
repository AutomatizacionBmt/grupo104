package sesion02.clases;

public class Mes {

    public static String obtenerMes(int mes, String nombreMes) {
        return "";
    }

    public static String obtenerMes(double mes2) {
        return "";
    }

    public static String obtenerMes(float mes2) {
        return "";
    }

    public static String obtenerMes(int mes) {
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Setiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "Mes invalido";
        }
    }

    public static int obtenerMes(String mes) {
        switch(mes.toUpperCase()) {
            case "ENERO":
                return 1;
            case "FEBRERO":
                return 2;
            case "MARZO":
                return 3;
            case "ABRIL":
                return 4;
            case "MAYO":
                return 5;
            case "JUNIO":
                return 6;
            case "JULIO":
                return 7;
            case "AGOSTO":
                return 8;
            case "SETIEMBRE":
                return 9;
            case "OCTUBRE":
                return 10;
            case "NOVIEMBRE":
                return 11;
            case "DICIEMBRE":
                return 12;
            default:
                return -1;

        }
    }

    public static void main(String[] args) {
        System.out.println(obtenerMes(2));
        System.out.println(obtenerMes("Febrero"));
    }
}

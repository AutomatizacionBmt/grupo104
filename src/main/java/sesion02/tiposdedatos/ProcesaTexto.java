package sesion02.tiposdedatos;

/*
Escriba un método que cuente el número de palabras en una cadena y las imprima individualmente en una nueva línea.

 */
public class ProcesaTexto {

    public static void main(String[] args) {
        contarPalabras("Hola,Amigos,del,curso,de,QA,Automation");
        revertirCadena("Quiero una manzana");
        agregarEspacios("Hola!EstamosAutomatizandoElMundo");
    }

    private static void contarPalabras(String texto) {
        String[] palabras = texto.split(",");

        System.out.println(palabras.length);

        for(String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    /*
    Escriba un método que imprima un String al revés. Por ejemplo, si se da ”quiero una manzana",
    imprime "anaznam anu oreiuq".
     */
    private static void revertirCadena(String texto) {// quiero 5
        for(int i = texto.length() - 1 ; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }

    /*
    Escriba un método que agregue espacios a Strings mezclados donde todas las palabras se
    escriben juntas sin espacios. Cada nueva palabra comienza con una letra mayúscula,
     */
    private static void agregarEspacios(String texto) {
        StringBuilder builder = new StringBuilder(texto);
        System.out.println(builder);

        //Hola!EstamosAutomatizandoElMundo
        //Hola! Estamos Automatizando El Mundo
        for(int i=0; i < builder.length(); i++) {
            if(i!=0 && Character.isUpperCase(builder.charAt(i))) {
                builder.insert(i, " ");
                i++;
            }
        }

        System.out.println(builder);
    }
}

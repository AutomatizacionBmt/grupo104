package sesion03.abstraccion;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class AbstractExample {

    public static void main(String[] args) {
        /*FiguraGeometrica rectangulo = new Rectangulo("Rectangulo", 4, 3);

        rectangulo.dibujar();
        rectangulo.calcularArea();*/

        FiguraGeometrica[] figuras = new FiguraGeometrica[5];
        figuras[0] = new Rectangulo("Rectangulo1", 4, 3);//12
        figuras[1] = new Triangulo("Triangulo1", 4, 3); // 6
        figuras[2] = new Rectangulo("Rectangulo2", 6, 8);//48
        figuras[3] = new Triangulo("Triangulo12", 10, 20);//100
        figuras[4] = new Triangulo("Triangulo123", 5, 4);//10

        //Imprimir en consola el area total de todos los rectangulos
        // Imprimir en consola el area total de todos los triangulos

        double areaRectangulo = 0;
        double areaTriangulo = 0;

        /*for(int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Rectangulo) {
                areaRectangulo = areaRectangulo + figuras[i].calcularArea();
            }
            if(figuras[i] instanceof  Triangulo) {
                areaTriangulo = areaTriangulo + figuras[i].calcularArea();
            }
        }*/

        for (FiguraGeometrica figurita: figuras) {
            if (figurita instanceof Rectangulo){
                areaRectangulo = areaRectangulo + figurita.calcularArea();
            }
            if (figurita instanceof Triangulo){
                areaTriangulo = areaTriangulo + figurita.calcularArea();
            }
        }

        System.out.println("El area de todos los rectangulos es: " + areaRectangulo); //60
        System.out.println("El area de todos los triangulos es: " + areaTriangulo); // 116

        Function<FiguraGeometrica, Integer> miFunction = figura -> figura.tipoFigura.length();

        // Java 8 existen otras formas de reccorer una coleccion
        Arrays.stream(figuras)
                .filter(figura -> figura instanceof Triangulo)
                .map(miFunction)
                .forEach(longitud -> System.out.println("La longitud es: " + longitud));
                //.forEach(figura -> System.out.println(figura));

        AtomicInteger cont = new AtomicInteger(0);
        Arrays.stream(figuras)
        .forEach(p -> {
            cont.incrementAndGet();
        });

        System.out.println("contador: " + cont);
    }
}

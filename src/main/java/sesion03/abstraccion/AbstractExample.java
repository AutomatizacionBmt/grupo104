package sesion03.abstraccion;

public class AbstractExample {

    public static void main(String[] args) {
        /*FiguraGeometrica rectangulo = new Rectangulo("Rectangulo", 4, 3);

        rectangulo.dibujar();
        rectangulo.calcularArea();*/

        FiguraGeometrica[] figuras = new FiguraGeometrica[5];
        figuras[0] = new Rectangulo("Rectangulo", 4, 3);//12
        figuras[1] = new Triangulo("Triangulo", 4, 3); // 6
        figuras[2] = new Rectangulo("Rectangulo", 6, 8);//48
        figuras[3] = new Triangulo("Triangulo", 10, 20);//100
        figuras[4] = new Triangulo("Triangulo", 5, 4);//10

        //Imprimir en consola el area total de todos los rectangulos
        // Imprimir en consola el area total de todos los triangulos

        double areaRectangulo = 0;
        double areaTriangulo = 0;

        for(int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Rectangulo) {
                areaRectangulo = areaRectangulo + figuras[i].calcularArea();
            }
            if(figuras[i] instanceof  Triangulo) {
                areaTriangulo = areaTriangulo + figuras[i].calcularArea();
            }
        }

        System.out.println("El area de todos los rectangulos es: " + areaRectangulo); //60
        System.out.println("El area de todos los triangulos es: " + areaTriangulo); // 116



    }
}

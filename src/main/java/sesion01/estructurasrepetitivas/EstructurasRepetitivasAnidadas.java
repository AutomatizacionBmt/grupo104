package sesion01.estructurasrepetitivas;

public class EstructurasRepetitivasAnidadas {

    public static void main(String[] args) {
        for(int i =0; i <= 3 ; i++) { // 0,1,2,3
            System.out.println("cuando i es:" + i);
           for(int j=0; j <= 5; j++) { // 0,1,2,3,4,5
               System.out.println("cuando j es: " + j);
               int count = 0;
               while(count < 2) {
                   System.out.println(count);
                   count++; // count = count +1;
               }
           }
        }
    }
}

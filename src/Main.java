
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //EJERCICIO 1//

/*        Scanner teclado = new Scanner(System.in);
        int n1, n2, suma;
        System.out.println("Digite el primer valor: ");
        n1 = teclado.nextInt();
        System.out.println("Digite el segundo valor: ");
        n2 = teclado.nextInt();
        suma = n1 + n2;
        System.out.println("El resultado de la suma es: " + suma);

        //EJERCICIO 2//
/*
            import java.util.*;

        public static void main(String[] args) {
            Random ale =new Random();
            int n1,n2,suma;
            n1 = ale.nextInt(51);
            System.out.println("Primer número: "+n1);
            n2 = ale.nextInt(51);
            System.out.println("Segundo número: "+n2);
            suma = n1 + n2;
            System.out.println("La suma de los dos números es: " +suma);
        }

        //EJERCICIO 3//
/*
            import java.util.*;

        public class Main {
            public static void main(String[] args) {
                int i = 0;
                int n1;
                int suma=0;
                while (i <= 100) {
                    Random ale = new Random();
                    n1 = ale.nextInt((200 - 1) + 1) + 1;
                    System.out.println(n1);
                    i++;
                    suma = n1+suma;
                }
                System.out.println("La suma de los números es: "+suma);
            }
        }

        //EJERCICIO 4//        }
/*
        import java.util.*;

        public class Main {
            public static void main(String[] args) {
                int i = 0;
                int n1;
                int suma = 0;
                int suma1 = 0;
                while (i <= 100) {
                    Random ale = new Random();
                    n1 = ale.nextInt((200 - 1) + 1) + 1;
                    System.out.println(n1);
                    i++;
                    if (n1 % 2 == 0) {
                        suma1 = n1 + suma1;}
                    else
                        suma = n1 +suma;
                }
                System.out.println("La suma de los números pares es: " + suma1);
                System.out.println("La suma de los números impares es: " + suma);
            }
        }

    }
    }
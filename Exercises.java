public class Exercises{
    public static void main(String[] args){

        //Casting simple exercise
        /*double x = 8.9;
        int y = (int) x; 
        System.out.println(x);
        System.out.println(y);*/

        // Division casting exercise
        /*int a = 9;
        int b = 4;
        System.out.println(a / b);
        System.out.println((double) a / b);*/

        // Arithmetic operations
        /*int n = 15;
        System.out.println(n + 5);
        System.out.println(n * 2);
        System.out.println(n % 4);*/

        // Boolean exercise
        /*int x = 7;
        int y = 10;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);*/

        // Chained casting exercise
        /*double d = 5.99;
        int i = (int) d;
        double d2 = i;
        System.out.println(d);
        System.out.println(i);
        System.out.println(d2);*/

        // Char and numbers
        /*char c = 'C';
        int i = c;
        System.out.println(i);*/

        //mini-challenge
        /*int x = 5;
        int y = 2;
        int z = x / y;
        double j = (double) x / y;
        int m = x % y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(j);
        System.out.println(m);*/

        // if.. else and switch exercise
        // if ... else method
        /*int day = 2;
        if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");  
        }else if (day == 3){
            System.out.println("Wednesay");
        }else if (day == 4){
            System.out.println("Thursday");
        }else {
            System.out.println("Friday");
        }*/

        // switch method
        /*int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }*/
        // Challenge No. 1 User validation system
            /*String usuario = "admin";
            String password = "1234";
            String usuarioIngresado = "admin";
            String passwordIngresado = "4567";
            boolean bloqueado = false;
            if (usuario.equals(usuarioIngresado) && password.equals(passwordIngresado)){ 
                System.out.println("Bienvenido al sistema");
            } else if (!(usuario.equals(usuarioIngresado)) && !(password.equals(passwordIngresado))){
                System.out.println("Datos incorrectos");
            } else if (usuario.equals(usuarioIngresado) && !(password.equals(passwordIngresado))){
                bloqueado = true;
                System.out.println("Usuario bloqueado");
                }
            }*/
        // Challenge No. 2 Academic grades control
            /*double nota1 = 5.0;
            double nota2 = 4.0;
            double nota3 = 3.5;
            double prom, suma;
            suma = nota1 + nota2 + nota3;
            prom = suma / 3;
            double redondeado = Math.round(prom * 100.0) / 100.0;
            System.out.println("Notas ingresadas:\n\bNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3);
            System.out.println("Promedio redondeado: " + redondeado + "\nPromedio sin redondear: " + prom);
            if (redondeado >= 3.5){
                System.out.println("Aprobado");
            }else if (redondeado >= 2.5 && redondeado < 3.5){
                System.out.println("Recuperacion");
            }else if (redondeado < 2.5) {
                System.out.println("Reprobado");
            }*/
        // Challenge No. 3 ATM simulator
            /*int saldo = 1000;
            int opcion = 1;
            int monto = 500;
            while (opcion <= 4){
                switch(opcion){
                case 1 :
                    System.out.println("Su saldo actual es de " + saldo);
                    break;
                case 2 :
                    System.out.println("¿Cuanto dinero desea retirar? " + monto);
                    break;
                case 3 : 
                    System.out.println("¿Cuanto dinero desea depositar?");
                    break;
                case 4 :
                    System.out.println("¡Gracias por usar nuestro servicio de cajero automatico!");
                    break;  
                }  
            opcion += 1;    
            }*/
           // Challenge No. 4
           /*int[] numeros = {3, -2, 7, 0, -5, 8, 4};
           int cantpos = 0, cantneg = 0, cantceros = 0, sumpos = 0;
           for(int i = 0; i < numeros.length; i++){
                if (numeros[i] > 0){
                    cantpos += 1;
                    sumpos += numeros[i];
                } else if (numeros[i] < 0) {
                    cantneg += 1;
                } else {
                    cantceros += 1;
                }
           }
           System.out.println("La cantidad de numeros positivos es de: " + cantpos + "\nLa cantidad de numeros negativos es de: " + cantneg + "\nLa cantidad de ceros es: " + cantceros + "\nY la suma de los numeros positivos es de: " + sumpos);
            */

       
      
    }   
}











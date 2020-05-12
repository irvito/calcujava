

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        
        int opciones;
       
        System.out.println("Escribe el primer número");

         Scanner numero1 = new Scanner(System.in);
            int num1 = numero1.nextInt(); 
             System.out.println("Escribe el segundo numero");
           
             Scanner numero2 = new Scanner(System.in);
          
                int num2 = numero2.nextInt();

               
           

           


            System.out.println("Opciones: 1.Suma, 2.Resta, 3.multiplicacion, 4.división");
    
            Scanner opcs = new Scanner(System.in);
            opciones = opcs.nextInt();
           
    
    
            int result1 = num1 + num2;
            int result2 = num1 - num2;
            int result3 = num1 * num2;
            int result4 = num1 / num2;
    
            switch (opciones) {
            case 1:
                System.out.println("Suma" + result1); 
                numero1.close(); numero2.close(); opcs.close();
                break;
            case 2:
                System.out.println("Resta:" + result2);
                numero1.close(); numero2.close(); opcs.close();
                break;
    
            case 3:
                System.out.println("Multiplicación: " + result3);
                numero1.close(); numero2.close(); opcs.close();
                break;
            case 4:
                System.out.println("División" + result4);
                numero1.close(); numero2.close(); opcs.close();
                break;
    
            default:
             System.out.println("Error");
                
                break;
    
            }
        }
       
       
        }

    

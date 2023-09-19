import java.util.Scanner;


public class App {
  static final double Dos = 2;
  static final double Pi = 3.141592654;
               
     public static void main(String[] args)  {
     Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese 1 si desea calcular area del prisma");
        System.out.println("Ingrese 2 si desea calcular area del cilindro");
        System.out.println("Ingrese 3 si desea calcular area del piramide");
        System.out.println("Ingrese 4 si desea calcular area del cono");
        System.out.println("Ingrese 5 si desea calcular area del Esfera");
        System.out.println("Ingrese 6 si desea calcular area del Zona esférica");
        System.out.println("Ingrese 7 si desea calcular area del Casquete esférico");
        System.out.println("Ingrese 8 si desea calcular area del Huso esférico y cuña esférica");
        System.out.println("Ingrese 9 si desea calcular area del Ortoedro");
        System.out.println("Ingrese 10 si desea calcular area del Tetraedro");
        System.out.println("Ingrese 11 si desea calcular area del Hexoedro");
        System.out.println("Ingrese 12 si desea calcular area del Ocotaedro");
        System.out.println("Ingrese 13 si desea calcular area del Dodecaedro");
        System.out.println("Ingrese 14 si desea calcular area del Icosaedro");
        System.out.println("Ingrese 15 si desea calcular area del prisma");
        byte opc = lector.nextByte();

        switch (opc) {
            case 1:
            double areaLateral, Perimetro, Haltura;
            double Lados, medidaLados;
            double Areabase, apotemabase, Volumen, areaTotal;
             System.out.println("PRISMA");
              do{
                
                System.out.println("Ingrese el valor de la altura del prisma");
                Haltura = lector.nextDouble();

                 System.out.println("Ingrese el valor de los lados del prisma");
                 Lados = lector.nextDouble();

                  System.out.println("Ingrese el valor de la medida de los lados del prisma");
                  medidaLados = lector.nextDouble();

                 System.out.println("Ingrese el valor de la Apotema base");
                 apotemabase = lector.nextDouble();
            
                  System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
               
                    } while (Haltura < 0 && Lados < 0 && medidaLados < 0 && apotemabase < 0);
                    if (Haltura == 0 && Lados == 0 && medidaLados == 0 && apotemabase == 0) {
                        System.out.println("No puedes ingresar ceros");
                    }
                      
                    if (Haltura != 0 && Lados != 0 && medidaLados != 0 && apotemabase != 0) {
                     Perimetro = Lados * medidaLados;
                     areaLateral = Perimetro * Haltura;
                     Areabase = (Perimetro*apotemabase)/2;
                     areaTotal = areaLateral + (2 * Areabase);
                     Volumen = Areabase * Haltura;

                     System.out.println("El valor del area lateral del prisma es de:  " +areaLateral);
                     System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                     System.out.println("El valor del are total del prisma es de:  " +areaTotal);
                     System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                     System.out.println("El valor del volumen del prisma es de:   " +Volumen);
                    }
            
      
                
                break;
        
            case 2:
            

                double areaLateral2, areaTotal2, Volumen2;
                double radio, Haltura2;

        
                System.out.println("CILINDRO");

            do {

                System.out.println("Ingrese el valor de radio del cilindro:");
                radio = lector.nextDouble();
        
                System.out.println("Ingrese el valor de altura del cilindro");
                Haltura2 = lector.nextDouble();

               

                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
            } while (radio < 0 && Haltura2 < 0);
            if (radio == 0 && Haltura2 == 0) {
                System.out.println("No puedes ingresar ceros");
                
            }
            if (radio != 0 && Haltura2 != 0) {
                

                areaLateral2 = Dos * Pi * radio * Haltura2;
                areaTotal2 = Dos * Pi * radio * (Haltura2 + radio);
                Volumen2 = Pi * (radio * radio) + Haltura2;

                System.out.println("El valor del area lateral del cilindro es de:  " +areaLateral2);
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del area total del cilindro es de:   " +areaTotal2);
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del volumen del cilindro es de:  " +Volumen2);
            }
                break;

            case 3:

            double apotema3, base3, Haltura3, baseMedia3;
            double Volumen3, Areabase3, areaLateral3, areaTotal3;
            double HalturaD3, baseMediaD3, apotemaD3;
            System.out.println("PIRAMIDE");

            do {
                System.out.println("Ingrese el valor de base de la pirámide");
                base3 = lector.nextDouble();

                System.out.println("Ingrese el valor de altura de la pirámide");
                Haltura3 = lector.nextDouble();

                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");


            } while (base3 < 0 && Haltura3 < 0);
            if (base3 == 0 && Haltura3 == 0) {
                System.out.println("No puedes ingresar ceros");
            }
            if (base3 != 0 && Haltura3 != 0) {
                HalturaD3 = Haltura3 * Haltura3;
                baseMedia3 = base3/2;
                baseMediaD3 = baseMedia3 * baseMedia3;
                apotema3 = HalturaD3 + baseMediaD3;
                apotemaD3 = apotema3 * apotema3;
                areaLateral3 = 4 * ((base3*apotemaD3) /2)/1000;
                Areabase3 = base3 * base3;
                areaTotal3 = Areabase3 + areaLateral3;
                Volumen3 = (Areabase3 * Haltura3)/3;

                System.out.println("El valor del area lateral de la pirámide es de: "+areaLateral3);
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del area total de la pirámide es de: "+areaTotal3);
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del volumen de la pirámide es de: "+Volumen3);

            }

        
                break;
             
           case 4:
           double areaLateral4, areaTotal4, Volumen4;
        double radio4, generatriz4, Haltura4, radioD4;

        System.out.println("CONO");
        
        do {
            System.out.println("Ingrese el valor de radio del cono: ");
            radio4 = lector.nextDouble();
    
            System.out.println("Ingrese el valor de altura del cono: ");
            Haltura4 = lector.nextDouble();
    
            System.out.println("Ingrese el valor de la generatriz del cono:");
            generatriz4 = lector.nextDouble();

            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
    
        } while (radio4 < 0 && Haltura4 < 0 && generatriz4 < 0);
        if (radio4 == 0 && Haltura4 == 0 && generatriz4 == 0) {
            System.out.println("No puedes ingresar 0");
        }
        if (radio4 != 0 && Haltura4 != 0 && generatriz4 != 0) {
            areaLateral4 = Pi * radio4 * generatriz4;
            radioD4 = radio4 * radio4;
            areaTotal4 = areaLateral4 + Pi * radioD4; 
            Volumen4 = (0.3333333333 * Pi * radioD4 )* Haltura4;
    
            System.out.println("El valor del area lateral del cono es de: "+areaLateral4);
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("El valor del area total del cono es de: "+areaTotal4);
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("El valor del volumen del cono es de: "+Volumen4);
        }

                break;
             
           case 5:
           double Area5, Volumen5, radioD5, radioT5,radio5;
           System.out.println("ESFERA");
           do {
            System.out.println("Ingrese el valor del radio:");
            radio5 = lector.nextDouble();
            
            System.out.println("::::::::::::::::::::::::::::::::::::");
            
           } while (radio5 < 0);
           if (radio5 == 0) {
            System.out.println("El valor del radio no puede ser 0");
           }
           if (radio5 != 0) {
            radioD5 = radio5 * radio5;

            radioT5 = radio5 * radio5 * radio5;
            Area5 = 4 * Pi * radioD5;
            Volumen5 = 1.333333333 * Pi * radioT5;

        System.out.println("El valor del area de la esfera es de:" +Area5);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El valor del volumen de la esfera es de: "+Volumen5);
            
           }


                break;
            case 6:
            double RadioMayor6, Haltura6, Area6, Volumen6;
            double radioUno6, radioDos6, HalturaD6;
            double radioUn6, radioDo6;

            System.out.println("ZONA ESFÉRICA");
            do {
                System.out.println("Ingrese el valor del radio mayor de la zona esférica:");
                RadioMayor6 = lector.nextDouble();

                System.out.println("Ingrese el valor del radio 1: ");
                radioUno6 = lector.nextDouble();

                System.out.println("Ingrese el valor del radio 2:");
                radioDos6 = lector.nextDouble();

                System.out.println("Ingrese el valor de la altura:");
                Haltura6 = lector.nextDouble();
                System.out.println("::::::::::::::::::::::::::::::::::::");
            } while (RadioMayor6 < 0 && radioUno6 < 0 && radioDos6 < 0 && Haltura6 < 0);
            if (RadioMayor6 == 0 && radioUno6 == 0 && radioDos6 == 0 && Haltura6 == 0) {
               System.out.println("No puedes ingresar 0"); 
            }
            if (RadioMayor6 != 0 && radioUno6 != 0 && radioDos6 != 0 && Haltura6 != 0) {
                Area6 = 2 * Pi * RadioMayor6 * Haltura6;
                radioUn6 = radioUno6 * radioUno6;
                radioDo6 = radioDos6 * radioDos6;
                HalturaD6 = Haltura6 * Haltura6;
                Volumen6 = ((Pi * Haltura6)/6) *( (3 * radioUn6 ) + (3 * radioDo6) + HalturaD6);

                System.out.println("El valor del area de la zona esférica es de: "+Area6);
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El valor del volumen de la zona esférica: "+Volumen6);
            }
                break; 
            case 7:
            double Area7, Volumen7;
            double RadioMayor7, Haltura7, HalturaD7;
            System.out.println("CASQUETE ESFÉRICO");
            do {
                System.out.println("Ingrese el valor del radio mayor del casquete esférico");
                RadioMayor7 = lector.nextDouble();

               System.out.println("Ingrese el valor de altura del casquete esférico");
               Haltura7 = lector.nextDouble();

               System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            } while (RadioMayor7 < 0 && Haltura7 < 0);
            if (RadioMayor7 == 0 && Haltura7 == 0) {
                System.out.println("No puedes ingresar 0");
            }
            if (RadioMayor7 != 0 && Haltura7 != 0) {
                Area7 = 2 * Pi * RadioMayor7 * Haltura7;
               HalturaD7 = Haltura7 * Haltura7;
               Volumen7 = Pi * HalturaD7 * ((3 * RadioMayor7 - Haltura7)/3);

               System.out.println("El valor del area del casquete esférico es de: " + Area7);
               System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
               System.out.println("El valor del volumen del casquete esférico es de: "+Volumen7);
                
            }
        
                break;
            case 8:
                break;
            case 9:
                 break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;   
            case 14:
                break;
            case 15:
                break;

        }
    }
}

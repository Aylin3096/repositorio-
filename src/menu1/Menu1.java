package menu1;
import java.lang.Math;
import java.util.Scanner;

public class Menu1 {
public static void main(String[] args) {
       
    int opcion=0,a,b,c,d,e,f,g,h,i,j,r;
    int normal=0,z,x,m,de;
    int binomial=0,nu,x1,pe,pf,rf;
    Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("1= Media");
            System.out.println("2= Mediana");
            System.out.println("3= Moda");
            System.out.println("4= distribucion normal");
            System.out.println("5= distribucion binomial");
            System.out.println("6= poison");
            System.out.println("7= no hay mas opciones ADIOS!!");
           
            opcion=teclado.nextInt();
           

            if(opcion==1){
                System.out.println("ingresa numero 1");
                a=teclado.nextInt();
                System.out.println("ingresa numero 2");
                b=teclado.nextInt();
                System.out.println("ingresa numero 3");
                c=teclado.nextInt();
                System.out.println("ingresa numero 4");
                d=teclado.nextInt();
                System.out.println("ingresa numero 5");
                e=teclado.nextInt();
                System.out.println("ingresa numero 6");
                f=teclado.nextInt();
                System.out.println("ingresa numero 7");
                g=teclado.nextInt();
                System.out.println("ingresa numero 8");
                h=teclado.nextInt();
                System.out.println("ingresa numero 9");
                i=teclado.nextInt();
                System.out.println("ingresa numero 10");
                j=teclado.nextInt();
                
                r=(a+b+c+d+e+f+g+h+i+j)/10;
               
                System.out.println((char)27 + "[34;43m la media es: " +r);       
}
               else if(opcion==2){
                   
                System.out.println("ingresa numero 1");
                a=teclado.nextInt();
                System.out.println("ingresa numero 2");
                b=teclado.nextInt();
                System.out.println("ingresa numero 3");
                c=teclado.nextInt();
                System.out.println("ingresa numero 4");
                d=teclado.nextInt();
                System.out.println("ingresa numero 5");
                e=teclado.nextInt();
                System.out.println("ingresa numero 6");
                f=teclado.nextInt();
                System.out.println("ingresa numero 7");
                g=teclado.nextInt();
                System.out.println("ingresa numero 8");
                h=teclado.nextInt();
                System.out.println("ingresa numero 9");
                i=teclado.nextInt();
                System.out.println("ingresa numero 10");
                j=teclado.nextInt();
                
                
                
}
            
            else if(opcion==3){
                System.out.println("ingresa numero 1");
                a=teclado.nextInt();
                System.out.println("ingresa numero 2");
                b=teclado.nextInt();
                System.out.println("ingresa numero 3");
                c=teclado.nextInt();
                System.out.println("ingresa numero 4");
                d=teclado.nextInt();
                System.out.println("ingresa numero 5");
                e=teclado.nextInt();
                System.out.println("ingresa numero 6");
                f=teclado.nextInt();
                System.out.println("ingresa numero 7");
                g=teclado.nextInt();
                System.out.println("ingresa numero 8");
                h=teclado.nextInt();
                System.out.println("ingresa numero 9");
                i=teclado.nextInt();
                System.out.println("ingresa numero 10");
                j=teclado.nextInt();
                
                
}
             else if(opcion==4){
                System.out.println("ingresa x");
                x=teclado.nextInt();
                System.out.println("ingresa numero media");
                m=teclado.nextInt();
                System.out.println("ingresa la desvacion estandar");
                opcion=teclado.nextInt();
                 
            
                z=(x-m)/opcion;
                
                System.out.println((char)27 + "[34;43mla distribucion normal es "+z); 
                
            
             }
            
            if(opcion==5){
                System.out.println("ingresa numero de ensayos");
                nu=teclado.nextInt();
                System.out.println("ingresa numero de exitos");
                x1=teclado.nextInt();
                System.out.println("ingresa probabilidad de exitos");
                pe=teclado.nextInt();
                System.out.println("ingresa probabilidad de fracasos");
                pf=teclado.nextInt();
                
                
                rf=((pe^x1) *(pf^nu-x1));
                
                
               System.out.println((char)27 + "[34;43mla distribucion binomial es "+rf);
                
                
                
                
                
                
                
                
            
            }
            }while(opcion!=7);
    
    
    
    
    
        }
        }

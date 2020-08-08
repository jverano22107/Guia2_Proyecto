import java.util.*;

public class Calculadora_Correlacion {

    public static void main(String[] args) {

        final int FILAS = 6, COLUMNAS = 1;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;
        int[][] x = new int[FILAS][COLUMNAS]; 
        int[][] y = new int[FILAS][COLUMNAS];
        System.out.println("Calculo de ecuación de recta y=ax+b por minimos cuadrados,para un conjunto de (6) datos");
        System.out.println("Escriba los datos de x: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("x[" + (i+1) + "]= ");
                x[i][j] = sc.nextInt();
            }
        }

         System.out.println("Escriba los datos de y: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("y[" + (i+1) + "]= ");
                y[i][j] = sc.nextInt();
            }
        }
        double x1=x[0][0],x2=x[1][0],x3=x[2][0],x4=x[3][0],x5=x[4][0],x6=x[5][0],y1=y[0][0],y2=y[1][0],y3=y[2][0],y4=y[3][0],y5=y[4][0],y6=y[5][0];
        double sumax,sumay,sumax2,sumay2,sumaxy,t,w,p,a,b,r,r2,z,dx,dy;
        sumax =  x1+x2+x3+x4+x5+x6;
        sumay =  y1+y2+y3+y4+y5+y6;
        sumax2=  Math.pow(x1,2)+Math.pow(x2,2)+Math.pow(x3,2)+Math.pow(x4,2)+Math.pow(x5,2)+Math.pow(x6,2);
        sumay2=  Math.pow(y1,2)+Math.pow(y2,2)+Math.pow(y3,2)+Math.pow(y4,2)+Math.pow(y5,2)+Math.pow(y6,2);
        sumaxy=  x1*y1+x2*y2+x3*y3+x4*y4+x5*y5+x6*y6;
        b=(sumaxy-((sumax*sumay)/FILAS))/(sumax2-(Math.pow(sumax,2)/FILAS));
        a=(sumay/FILAS)-(b*(sumax/FILAS));
        t=sumax/FILAS;//media aritmetica de x
        w=sumay/FILAS;// media aritmetica de y 
        p=(sumaxy/FILAS)-(t*w); 
        dx=Math.sqrt((sumax2/FILAS)-Math.pow(t,2));// desviacion tipica de x
        dy=Math.sqrt((sumay2/FILAS)-Math.pow(w,2));// desviacion tipica de y
        r=p/(dx*dy);
        r2=Math.pow(r,2);
        System.out.println("Resultados de la ecuación y=ax+b");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("r2 = "+r2);
        System.out.println("r = "+r);
    }
}
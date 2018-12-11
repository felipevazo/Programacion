import java.util.Scanner;
Public class ManejoNotas{
 Scanner entrada=new Scanner(System.in);
 int [][] M;
 double [] prom;
  
  public void main()
  {
    	//Entradas
		    //Recibir cantidad de alumnos del curso
		    	//Imprimir mensaje aviso
            System.out.println("Ingrese cantidad de alumnos");
          //Leer cantidad de alumnos
            int N =entrada.nextInt();
      //Proceso
        //Generar listas de notas
          M=generarMatriz(N,5,1,6);
       //Calcular promedios
	  	    prom=calcularPromedio(N,5);
        //Mostrar menu y recibir respuesta
          int resp=1;
          while(resp!=3)
          {
           //Desplegar Menu
             System.out.println("Ingrese 1 para mostrar notas,2 para mostrar promedios , 3 para salir”);
           //Recibir y procesar respuesta
             //Recibir respuesta
                resp=entrada.nextInt();
             //Comparar si usuario quiere ver notas
                if(resp==1)
                {
                  //Mostrar notas por pantalla
						    		mostrarMatriz(M);

                }
                else
                {
                  //Comprobar si usuario quiere ver promedios
                    if(resp==2)
                    {
                      //Mostrar promedios por pantalla
                        mostrarArreglo(N,prom);
                    }
                    else
                    {
                      //Ordenar promedios
                      ordenarArreglo(N,prom);
                    }
                }
          }
      //Salidas
        //Mostrar promedios ordenados por pantalla
          mostrarArreglo(N,prom);
        //Imprimir mensaje salida
          System.out.println("Adios!");
 //FIN MAIN }
  
  
//FUNCIONES
public int[][] generarMatriz(int f,int c,int min,int max)
{
	int[][] matriz=new int[f][c];
	//Procesos 
	//iniciar contador
	int J;
	int I =0;
	//generar fila y acumular contador
	while(I<f)
	{
		J=0;
		//generar numero y acumular contador
		while(J<c)
		{
			//agregar numero entre 1 y 7 a la casilla
			matriz[I][J]=(int)(Math.random()*max)+1;
			//acumular contador columna
			J=J+1;
		}
		//acumular contador columna
		I=I+1;
		
	}
	//Entregar matriz
	return matriz;

}

public double[] calcularPromedios(int f,int c)
{
	double [] arr=new double[f];
	//Procesos
	//Iniciar contador
	int J,total;
	int I=0;
	//acumular cada fila y acumular contador
	while(I<f)
	{
		J=0;
		total=0;
		//acumular total fila y acumular contador
		while(J<c)
		{
			//acumular el total
			total=total+M[I][J];
			//acumular contador columna
			J=J+1;
		}
		//calcular y agregar promedio a arreglo
		 double prom=total/5;
		 arr[I]=prom;
		//acumular contador fila
		I=I+1;
	}
	//entregar arreglo promedios
	return arr;
}
				
				
public void mostrarMatriz(int f, int c,int [][]matriz)
{
	//Procesos 
	//iniciar contador
	int J;
	int I =0;
	//imprimir fila y acumular contador
	while(I<f)
	{
		J=0;
		//imprimir numero y acumular contador
		while(J<c)
		{
			//agregar numero entre 1 y 7 a la casilla
			System.out.print(matriz[I][J]+" ");
			//acumular contador columna
			J=J+1;
		}
		//acumular contador columna
		System.out.println("|");
		I=I+1;
		
		
	}
}
public void mostrarArreglo(int N, double[] arr)
{
	//Procesos
	//iniciar contador
	int cont =0;
	//mostrar arreglo
	while(cont<N)
	{
		//mostrar dato
		System.out.println(arr[cont]);
		//acumular contador
		cont=cont+1;
	}
}
public void ordenarArreglo(int N,double[] arr)
{
	//Procesos
	//Iniciar variables
	int J;
	double temp;
	int I=0;
	//ordenar numeros
	while(I<N)
	{
		//Iniciar contador
		J=0;
		//comparar y mover mayor
		while(J<(N-I))
		{
			//comparar numero con anterior
			if(arr[J-1]<arr[J])
			{
				//Cambiar valores de posicion
				temp=arr[J-1];
				arr[J-1]=arr[J];
				arr[J]=temp;
			}
			//acumular contador
			J=J+1;
		}
		//acumular contador
		I=I+1;
	}
}
  
  
}

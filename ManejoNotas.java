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
  
  
  
  
}

import java.util.Scanner;
Public class bingo 
{
  Scanner entrada=new Scanner(System.in);
  int [][] cartola=new int [5][5]
  public void main()
  {
    
  //Algoritmo
   //Entradas
   //Procesos
    //Generar cartola de bingo
      rellenarMatriz(cartola);
    
		//Mostrar menú, recibir respuesta, seleccionar proceso y comprobar  ganador
    while(resp !=3)
    {
			//Mostrar mensajes de menú por pantalla
      System.out.println("Menu Bingo");
      System.out.println("Ingrese 1 para ver su cartola, 2 para buscar un numero, 3 para cerrar");
      
			//Recibir respuesta del usuario
      int resp =entrada.nextInt();
      //Decidir que accion realizar
      if resp==1
      {
        mostrarMatriz(cartola);

      }
      else 
      {
        if resp ==2
        {
          //Solicitar numero a comprobar y llamar metodo
				  	System.out.println(“Ingrese numero a revisar”);
						int numTombola=entrada.nextInt();
						comprobarNumero(cartola,numTombola);

        }
        else 
        {
          System.out.println("Adios!");
        }

      }
      //Comprobar si jugador gano
        int ganador=contarNumero(cartola,0);
      //Si numero es 25, cortar y mensaje ganador
      if(ganador==25)
      {
        resp=3;
      }

    }
    //Comprobar si jugador gano o salio por las malas
    if(ganador==25)
    {
      System.out.println("Felicidades, ganaste el Bingo!");
    }
    
    
  }
  
  public void rellenarMatriz(int[][] matriz)
  {
    //Procesos
      //Iniciar contador
        int i=0;
    while(i<5)
    {
      //Iniciar contador
      int j=0;
      //generar numero y acumular contador
      while(j<5)
      {
        //agregar numero entre 1 y 75 a la casilla
						matriz [I][J] = (int)(Math.Random()*74+1);
						//acumular contador columna
							 j=j+1;
      }
      //Acumular contador fila
      i=i+1;
      
    }
    
  }
  
  public void comprobarNumero(int[][] matriz,int num)
  {
     //Procesos
      //Iniciar contador
        int i=0;
    while(i<5)
    {
      //Iniciar contador
      int j=0;
      //generar numero y acumular contador
      while(j<5)
      {
        if(matriz[i][j]==num)
        {
          matriz[i][j]=0;
        }
						//acumular contador columna
							 j=j+1;
      }
      //Acumular contador fila
      i=i+1;
      
    }
    
  }
  public int contarNumero(int[][] matriz,int num)
  {
     //Procesos
      //Iniciar contador
        int i=0;
        int total =0;
    while(i<5)
    {
      //Iniciar contador
      int j=0;
      while(j<5)
      {
       // Comparar si el numero es igual y acumular 
        if(matriz[i][j]==num)
        {
          total=total+1;
        }
						//acumular contador columna
							 j=j+1;
      }
      //Acumular contador fila
      i=i+1;
      
    }
    return total;
  }
  public void mostrarMatriz(int[][] matriz)
  {
     //Procesos
      //Iniciar contador
        int i=0;
    while(i<5)
    {
      //Iniciar contador
      int j=0;
      while(j<5)
      {
        //Imprimir numero
						System.out.print(matriz[i][j]);
						//acumular contador columna
							 j=j+1;
      }
      System.out.println("|");
      //Acumular contador fila
      i=i+1;
      
    }
  }
  
  
}

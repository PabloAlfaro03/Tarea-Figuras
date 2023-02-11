public class circulo {

    double radio;


    public circulo() {
        this(173549);
    }

    public circulo(double radio){

        this.radio = radio;
    }
    public static boolean bucarNumero(int n, int arreglo[]){
        int contador = 0;
        boolean encontrado = false;
        for (int i = 0 ; i < arreglo.length; i++){
            if(n==arreglo[i]){

                contador ++;
            }
            if(contador>0){
                encontrado=true;
                break;

            }else{
                encontrado = false;
            }


        }

        return encontrado;
    }

    //public void eliminarArray(int valor, int[] entero){
//
  //      for (int i = 0; i< entero.length;i++){
      //      if(entero[i]==valor){
    //            entero[i]=entero[i+1];
        //    }
        //}
        //entero[entero.length-1]=0;
        //System.out.println("se elimino el numero deseado");


    }





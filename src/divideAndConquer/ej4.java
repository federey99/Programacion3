package divideAndConquer;

public class ej4 {

    public static int elementoMatoritarioOrdenado(int arr[], int i, int f, int x, int c){ // x == arr.len/2, para una lista no vacía
        if (i == f){
            if(c > arr.length/2){return x;}
            else{return -1;}
        }else if (arr[i] == x){return elementoMatoritarioOrdenado(arr,i+1,f,x,c+1);}
        else{return elementoMatoritarioOrdenado(arr,i+1,f,x,c);}
    }

    public static int [] OrdenarLista(int arr []){

        return arr;
    }

    public static void main(String[] args) {
        int arr [] = {3,3,3,3,3,3,4,5,3,2};
        //int arr [] = {2,5,3,2,2,6,2,1,1,2,6,7,2,2,2}; //no funciona para este caso
        int c = 0;

        System.out.println(elementoMatoritarioOrdenado(arr,0,arr.length,arr[arr.length/2],0)); // sirve solo para arrays en donde el elemento mayoritario sea consecutivo.
    }

}

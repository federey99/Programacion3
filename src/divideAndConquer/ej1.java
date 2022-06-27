package divideAndConquer;

public class ej1 {

    public static int estaOrdenado(int vec[],int i,int f){
        if (i == f || i == f-1){return 1;} //no hay elementos o hay solo 1 elemento en la lista
        else if (vec[i] < vec[i+1]){
            return estaOrdenado(vec,i+1,f);
        }return 0;

    }


    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,3,6};
        int arr2 [] = {1,2};

        System.out.println((estaOrdenado(arr,0,arr.length)== 1));

    }
}



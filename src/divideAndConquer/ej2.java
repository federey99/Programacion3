package divideAndConquer;

public class ej2 {

    public static int pertenece(int vec[],int i,int f,int x) {
        if (f == 0 || f == i) { //caso base: no hay elemetos en el array, no se encontró elemento
            return 0;
        }
        else if (vec[i] == x) {
            return 1;
        } else {
            return pertenece(vec, i + 1, f,x);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};


        System.out.println(1==pertenece(arr,0, arr.length, 3));

    }



}

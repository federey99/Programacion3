package pruebas;


public class elementoMayoritario {

    /*intermezzo es un método que recibe como parámetro un array de enteros. El método devuelve un array {r,n,cx,c} donde:
    r: boolean, devuelve si hay un elemento mayoritario o no. (si devuelve un array de enteros, se podría usar -1 para false y 1 para true.
    n: largo del array pasado por parámetro
    cx: es la cantidad de veces que aparece A LO SUMO x. Este depende de n. cx es n/2 + 1 (si n es 10, x aparece a lo sumo 6 veces) si aparece más,
    se pone la cantidad de veces que aparece.
    x: elemento mayoritario.

     */

    class obj{
        boolean r;
        int n;
        int cx;
        int x;
        int elementos[];
        public obj(boolean r, int n, int cx, int x,int[] elementos){
            this.r=r;
            this.n=n;
            this.cx=cx;
            this.x=x;
            this.elementos=elementos;

        }
    }

   /* public obj prueba(obj vec){
        if (vec.elementos[0] == vec.elementos[-1]){
            obj arr = new obj(true,1,1,vec.elementos[0], vec.elementos);
            return arr;
        }else{
            obj o1 = prueba((vec));
        }
    }*/

    public obj intermezzo(obj arr){
        if (arr.elementos.length == 1){
            arr.r=true;
            arr.n = 1;
            arr.cx = 1;
            arr.x=arr.elementos[0];
            return arr;
        }else{
            //if()

        }


        return arr;
    }


    public static int[] dividirLista(int[] vec){
        int mid;
        if (vec.length != 1){return vec;}{
            int j = 0;
            mid = vec.length / 2;
            int arr1[] = new int[mid];
            int arr2[] = new int[mid];
            for (int i = 0;i<=vec.length-1;i++){
                if (i<mid){
                    arr1[i] = vec[i];
                }else{
                    arr2[j] = vec[i];
                    j++;}
            }
        }
        return vec;//provisorio
    }




    public static void main(String[] args) {
        int arr [] = {1,2,2,3,3,3};
        dividirLista(arr);

        //System.out.println(intermezzo(arr));
        
    }
}


package divideAndConquer;

public class mergeSort {

    public static void MergeSort ( int [] vec, int ini, int fin){ //no funciona
        if (ini < fin){
            int mid = (ini+fin)/2;
            MergeSort(vec,ini,mid);
            MergeSort(vec,mid+1,fin);
            MergeSort(vec,ini,fin);
        }
    }

    public static void main(String[] args) {
        int [] vec = {7,1,8,5,3,6,9,2,0,4};

        MergeSort(vec,vec[0], vec.length);


    }

}



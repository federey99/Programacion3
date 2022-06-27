package tpo;

import java.util.Arrays;

public class Sudoku_imp implements Sudoku_int {
    private int[][] matriz;
    private int[][] copia;
    private int[][] original;

    @Override
    public void InicializarSudoku() {

        matriz = new int[][]{
                {2, 0, 0, 0, 1, 0, 0, 9, 0},
                {0, 0, 0, 7, 0, 9, 2, 0, 0},
                {0, 0, 7, 0, 0, 0, 8, 0, 0},
                {0, 0, 2, 0, 7, 1, 0, 6, 0},
                {0, 0, 6, 0, 4, 0, 9, 0, 7},
                {0, 0, 1, 0, 5, 3, 0, 2, 0},
                {0, 0, 9, 0, 0, 0, 3, 0, 0},
                {0, 0, 0, 5, 0, 7, 1, 0, 0},
                {4, 0, 0, 0, 3, 0, 0, 7, 0}};
        copia = Arrays.stream(matriz).map(int[]::clone).toArray(int[][]::new);
        original = Arrays.stream(matriz).map(int[]::clone).toArray(int[][]::new);

    }

    @Override
    public void Agregar(int n, int x, int y) {
        if ((n <= 9 && n > 0) && (x <= 8 && x >= 0) && (y <= 8 && y >= 0)) {
            matriz[x][y] = n;
            copia = Arrays.stream(matriz).map(int[]::clone).toArray(int[][]::new);
        } else {
            System.out.println("número o posición inválidos");
        }
    }

    @Override
    public void Sacar(int x, int y) {
        try {
            if (original[x][y] == 0){ // valida que la posición que se esté sacando no sea un elemento que está en el sudoku por defecto.
            matriz[x][y] = 0;
            copia = Arrays.stream(matriz).map(int[]::clone).toArray(int[][]::new);}
            else {
                System.out.println("no puede sacarse un numero fijo");}
        } catch (Exception e) {
        }
    }

    @Override
    public boolean Resolver(int cant_elem) {
         // cant_elem es la posición desde donde hay que resolver
        if (cant_elem >= 9*9) return true;
        cant_elem = sig_pos_a_usar(cant_elem);
        if (cant_elem >= 9*9) return true;

    //se van probando todos los posibles numeros
        for (int num = 0; num<10;num++) {
            if (puedo_poner(num, cant_elem)) {
                //la solucion parcial me dijo que lo podia poner
                matriz[fila(cant_elem)][columna(cant_elem)] = num;
                //si se pudo poner llamo recursivamente
                //estoy en una solicion parcual a la mitad
                //le pasa la misma pos porque en la llamada recursiva se mueve adelante
                if (Resolver(cant_elem)) return true;
                //estamos en escucha de que esta llamada recursiva va o no devolver verdadero

                //si no se pudo poner, pone el numero en 0 y vuelve a probar con el siguiente
                matriz[fila(cant_elem)][columna(cant_elem)] = 0;
            }
        }
        return false;
    }

    @Override
    public void Mostrar() {
        for (int i = 0; i < matriz.length; i++) {
            if (i == 0 || i == 3 || i == 6) {
                System.out.println("-------------------------------------");
            }
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || j == 3 || j == 6) {
                    System.out.print("|");
                }
                if (matriz[i][j] == 0) {
                    System.out.print("." + "   ");
                }else if (matriz[i][j] == original[i][j]){
                    System.out.print("["+matriz[i][j] + "] ");
                }else{
                    System.out.print(matriz[i][j] + "   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void Limpiar() {
        InicializarSudoku();

    }

    @Override
    public void Revertir() {
        matriz = Arrays.stream(copia).map(int[]::clone).toArray(int[][]::new);

    }
    //---------------------------------- metodos privados de la clase --------------------------------------------

    private int fila(int cant_elem) {
        return cant_elem / 9;
    }

    private int columna(int cant_elem) {
        return cant_elem % 9;
    }

    //busca la sig posición vacía a chequear
    private int sig_pos_a_usar(int cant_elem) {
        for (int i = cant_elem; i < 9 * 9; i++) {
            if (matriz[fila(i)][columna(i)] == 0) return i;
        }
        return 9 * 9;
    }
    //Funcion que verifica si puede poner el numero pasado (num) en la posicion pasado (cant_elem)
    private boolean puedo_poner(int num, int cant_elem) {
        //Se fija si no esta el mismo numero en la fila
        int fil = fila(cant_elem);
        for(int c=0; c<9;c++){
            if (matriz[fil][c] == num)return false;
        }

    // Se fija si no esta el mismo numero en la columna
        int col = columna(cant_elem);
        for (int f=0;f<9;f++) {
            if (matriz[f][col] == num)return false;
        }
    // Se fija si no esta el mismo numero en el cuadrante
        int c_corner = (col/3) * 3;
        int f_corner = (fil/3) * 3;
        for (int f_c = f_corner; f_c< f_corner+3;f_c++){
            for (int c_c = c_corner;c_c<c_corner+3;c_c++){
                if (matriz[f_c][c_c] == num)return false;
            }
        }
        return true;
    }

}

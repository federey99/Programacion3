package tpo;


public class main {
    public static void main(String[] args) {

        Sudoku_int m = new Sudoku_imp();
        m.InicializarSudoku();
        System.out.println("Sudoku inicializado");
        m.Mostrar();
        System.out.println("se agregan algunos elementos");
        m.Agregar(3,0,1);
        m.Agregar(7,4,3);
        m.Agregar(9,0,5);
        m.Agregar(9,0,2);
        m.Mostrar();
        System.out.println("se saca un elemento");
        m.Sacar(4,3);
        m.Mostrar();
        System.out.println("que ocurre si quiero agregar un elemento indebido y/o en una posición indebida? o quitar uno que no debe quitarse?");
        m.Agregar(0,0,0);
        m.Sacar(0,0);
        System.out.println();
        System.out.println("se intenta resolver el sudoku... es posible luego de haber agregado algunos elementos?");
        System.out.println(m.Resolver(0));
        System.out.println("no es posible... Se procede a limpiar el sudoku");
        m.Limpiar();
        m.Mostrar();
        System.out.println("se agregan nuevamente elementos");
        m.Agregar(3,0,1);
        m.Agregar(7,4,3);
        m.Agregar(9,0,5);
        m.Mostrar();
        System.out.println("se intenta resolver el sudoku... es posible?: " + m.Resolver(0));
        m.Resolver(0);
        m.Mostrar();
        System.out.println("se revierte el sudoku a el estado en que estaba anteriormente");
        m.Revertir();
        m.Mostrar();
        System.out.println("se deja el sudoku en su estado original... Notar como ambas resoluciones son diferentes e igualmente válidas");
        m.Limpiar();
        m.Resolver(0);
        m.Mostrar();

        /*

        int [][]matrizResuelta;
        int [][] matriz = new int[][]{
                {2, 0, 0, 0, 1, 0, 0, 9, 0},
                {0, 0, 0, 7, 0, 9, 2, 0, 0},
                {0, 0, 7, 0, 0, 0, 8, 0, 0},
                {0, 0, 2, 0, 7, 1, 0, 6, 0},
                {0, 0, 6, 0, 4, 0, 9, 0, 7},
                {0, 0, 1, 0, 5, 3, 0, 2, 0},
                {0, 0, 9, 0, 0, 0, 3, 0, 0},
                {0, 0, 0, 5, 0, 7, 1, 0, 0},
                {4, 0, 0, 0, 3, 0, 0, 7, 0}};

        int[][] copy = Arrays.stream(matriz).map(int[]::clone).toArray(int[][]::new);
        matriz[0][0] = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (i == 0 || i == 3 || i == 6 || i == 9) {
                System.out.println("-------------------------------------");
            }
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || j == 3 || j == 6 || j == 9) {
                    System.out.print("|");
                }
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

*/


    }
}

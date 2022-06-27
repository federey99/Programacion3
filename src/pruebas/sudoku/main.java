package pruebas.sudoku;

public class main {
    public static void main(String[] args) {

        Generator generator = new Generator();
        Grid grid = generator.generate(42);

        int size = grid.getSize();
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                Grid.Cell cell = grid.getCell(row, column);
                //do something with cell
            }
        }

    }
}

package tpo;

public interface Sudoku_int {

    public void InicializarSudoku();
    public void Agregar(int n, int x, int y);
    public void Sacar(int x, int Y);
    public boolean Resolver(int cant_elem);
    public void Mostrar();
    public void Revertir();
    public void Limpiar();
}

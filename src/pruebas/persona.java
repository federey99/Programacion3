package pruebas;

public class persona{
    private String primerNombre;
    private String segundoNombre;
    private String apellido;
    private String documento;
    private String detalles;

    public persona(){
    }

    public persona (String primerNombre, String segundoNombre, String apellido, String documento){
        this.primerNombre=primerNombre;
        this.segundoNombre=segundoNombre;
        this.apellido=apellido;
        this.documento=documento;
    }

    public String getPrimerNombre(){
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getDetalles(){
        armaDetalles();
        return detalles;
    }

    private void armaDetalles(){
        detalles = "persona [primerNombre= " + primerNombre + ", segundoNombre= "+ segundoNombre
                + ", apellido = " + apellido + ", documento = "+ documento + "]";
        
    }

    public static void main(String[] args) {
        persona persona = new persona("Federico","Gabriel","Rey","41758077");
        System.out.println(persona.getDetalles());
    }

}

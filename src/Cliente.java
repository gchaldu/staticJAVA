public class Cliente {
    private static Integer id=0;
    private Integer nroCliente;
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.nroCliente = ++this.id;
    }
    public Integer getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(Integer nroCliente) {
        this.nroCliente = nroCliente;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Cliente.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nombre: " + nombre + '\'' +
                "nro cliente: " + nroCliente;
    }
}

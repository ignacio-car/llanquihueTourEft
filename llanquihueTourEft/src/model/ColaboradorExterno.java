package model;

public class ColaboradorExterno extends Persona {

    private String empresa;

    public ColaboradorExterno(String rut, String nombre, String telefono,
                              String correo, Direccion direccion, String empresa) {

        super(rut, nombre, telefono, correo, direccion);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void registrar() {
        System.out.println("Colaborador externo registrado correctamente.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmpresa: " + empresa;
    }
}
package utils;

public class Validaciones {

    public static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    public static boolean validarCorreo(String correo) {
        return correo.contains("@") && correo.contains(".");
    }

    public static boolean validarTelefono(String telefono) {
        return telefono.matches("[0-9]{8,9}");
    }

    public static boolean validarPrecio(double precio) {
        return precio > 0;
    }

    public static boolean validarCapacidad(int capacidad) {
        return capacidad > 0;
    }

    public static void validarRut(String rut) throws RutInvalidoException {

        if(rut == null || rut.isEmpty()){
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        if(!rut.matches("[0-9]{7,8}-[0-9kK]")){
            throw new RutInvalidoException("Formato de RUT incorrecto.");
        }

    }

}
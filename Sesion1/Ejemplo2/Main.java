package Sesion1.Ejemplo2;

public class Main {
    public static void main(String[] args){
        //Crear objetos.
        // 1. Clase del objeto
        // 2. Identificador del objeto (nombre del objeto).
        // 3. Operador new (palabra reservada)+ constructor de la clase.
        Estudiante estudiante1 = new Estudiante();
        //Asignamos valores a los atributos del objeto.
        estudiante1.nombre = "Karinita";
        estudiante1.edad = 24;

        //Llamamos al método del objeto.
        // 1. Nombre del objeto (estudiante1).
        estudiante1.saludar();
    }
}

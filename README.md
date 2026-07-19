# Llanquihue Tour

## Descripción

Llanquihue Tour es una aplicación desarrollada en Java que permite gestionar la información de una agencia de turismo. El programa carga los datos desde archivos de texto almacenados en la carpeta `resources` y permite visualizar la información mediante un menú desarrollado con `JOptionPane`.

El objetivo del proyecto es aplicar los conceptos vistos durante el semestre, como Programación Orientada a Objetos, herencia, interfaces, manejo de archivos y colecciones.

---

## Funcionalidades

El programa permite:

- Visualizar clientes.
- Visualizar guías turísticos.
- Visualizar colaboradores externos.
- Visualizar vehículos.
- Visualizar tours.
- Visualizar reservas.
- Identificar el tipo de persona utilizando `instanceof`.

Toda la información es cargada automáticamente desde archivos `.txt`.

---

## Estructura del proyecto

```text
LlanquihueTour/
│
├── src/
│   ├── app/
│   │   └── Main.java
│   │
│   ├── data/
│   │   └── GestorEntidades.java
│   │
│   ├── interfaces/
│   │   └── Registrable.java
│   │
│   ├── model/
│   │   ├── Persona.java
│   │   ├── Cliente.java
│   │   ├── GuiaTuristico.java
│   │   ├── ColaboradorExterno.java
│   │   ├── Direccion.java
│   │   ├── Vehiculo.java
│   │   ├── Tour.java
│   │   └── Reserva.java
│   │
│   └── utils/
│       └── LeerArchivos.java
│
└── resources/
    ├── clientes.txt
    ├── guias.txt
    ├── colaboradores.txt
    ├── vehiculos.txt
    ├── tours.txt
    └── reservas.txt
```

## Conceptos aplicados

Durante el desarrollo del proyecto se utilizaron los siguientes conceptos:

- Programación Orientada a Objetos.
- Encapsulamiento.
- Herencia mediante `extends`.
- Interfaces mediante `implements`.
- Polimorfismo.
- Uso de `instanceof`.
- Manejo de archivos de texto.
- Colecciones (`ArrayList`).
- Validaciones.
- Separación del proyecto por capas (`model`, `data`, `utils`, `app`).

---

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que la carpeta `resources` esté configurada como **Resources Root**.
3. Ejecutar la clase `Main`.
4. Seleccionar una opción desde el menú.

---

## Autor

Ignacio Carvacho Faundez
Analista Programador Computacional
Duoc UC

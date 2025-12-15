![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# Evaluación Sumativa III – Desarrollo Orientado a Objetos I

## Autor del proyecto
- Nombre completo: Benjamin Alejandro Merino Pinto
- Sección: 002A
- Carrera: Analista Programador Computacional
- Sede: Duoc Online

---

## Descripción general del sistema

Este proyecto corresponde a la Evaluación Sumativa III de la asignatura Desarrollo Orientado a Objetos I. En esta actividad se amplió la jerarquía de clases para la empresa salmonera **Salmontt**, incorporando:

- **UnidadOperativa** como superclase base.
- **CentroCultivo** como subclase con producción en toneladas.
- **PlantaProceso** como subclase con capacidad diaria de procesamiento.
- **Proveedor** y **Empleado** como nuevas entidades que implementan la interfaz `Registrable`.
- Una interfaz común **Registrable** que define el método `mostrarResumen()`.
- Un **GestorEntidades** que maneja una colección polimórfica de todas las entidades y diferencia entidades usando instanceof.
- Una **interfaz gráfica básica** usando `JOptionPane` para agregar y visualizar entidades.

El objetivo fue aplicar herencia, polimorfismo, interfaces, colecciones genéricas y diferenciación por tipo mediante `instanceof`.

---

## Estructura del proyecto



```
📁 resources/
└── centros.txt                 # Archivo de referencia (No utilizado directamente en esta actividad)

📁 src/
├── data/
│   └── GestorEntidades.java    # Maneja una colección polimórfica y diferencia entidades con instanceof
├── model/
│   ├── CentroCultivo.java      # Subclase con atributo toneladasProduccion
│   ├── Empleado.java           # Subclase con atributo cargo
│   ├── PlantaProceso.java      # Subclase con atributo capacidadDiaria
│   ├── Proveedor.java          # Subclase con atributo rubro
│   ├── Registrable.java        # Interfaz con método mostrarResumen()
│   └── UnidadOperativa.java    # Superclase con nombre y comuna
└── ui/
    └── Main.java               # Interfaz gráfica y consola para recorrer, mostrar y agregar entidades

```
---

## Cómo ejecutar el proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/benmerinoduoc/SalmonttApp.git
```

2. Abrir el proyecto en IntelliJ IDEA.

3. Ejecutar la clase `Main` dentro del paquete `ui`.

4. La GUI permitirá:
   - Ingresar nuevos empleados y proveedores.
   - Recorrer y mostrar todas las entidades existentes en consola.
   - Ver un resumen de cada entidad mediante la interfaz `Registrable`.
   - Salir del sistema seleccionando la opción correspondiente.

---

**Repositorio GitHub:** https://github.com/benmerinoduoc/SalmonttApp
**Fecha de entrega:** 15/12/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa III

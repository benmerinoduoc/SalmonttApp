![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# Evaluación Formativa V – Desarrollo Orientado a Objetos I

## Autor del proyecto
- Nombre completo: Benjamin Alejandro Merino Pinto
- Sección: 002A
- Carrera: Analista Programador Computacional
- Sede: Duoc Online

---

## Descripción general del sistema

Este proyecto corresponde a la Evaluación Formativa V de la asignatura Desarrollo Orientado a Objetos I. En esta actividad se implementa una jerarquía de clases que modela las unidades operativas de la empresa salmonera **Salmontt**, incorporando:

- **UnidadOperativa** como superclase base.
- **CentroCultivo** como subclase con producción anual en toneladas.
- **PlantaProceso** como subclase con capacidad de procesamiento por día.

El objetivo fue aplicar herencia, constructores, polimorfismo, sobrescritura de métodos y organización del código en paquetes.

El sistema incluye un gestor (`GestorUnidades`) que crea objetos de prueba y un Main que muestra la información de todas las unidades operativas.

---

## Estructura del proyecto

```
📁 resources/
└── centros.txt                 # Archivo de referencia (no utilizado en esta actividad)

📁 src/
├── data/
│   └── GestorUnidades.java     # Genera objetos de tipo CentroCultivo y PlantaProceso
├── model/
│   ├── CentroCultivo.java      # Subclase con atributo toneladasProduccion
│   ├── PlantaProceso.java      # Subclase con atributo capacidadProceso
│   └── UnidadOperativa.java    # Superclase con nombre y comuna
└── ui/
    └── Main.java               # Ejecuta el sistema y muestra todas las unidades
```

---

## Cómo ejecutar el proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/benmerinoduoc/SalmonttApp.git
```

2. Abrir el proyecto en IntelliJ IDEA.

3. Ejecutar la clase `Main` dentro del paquete `ui`.

4. La consola mostrará:
   - Centros de cultivo con su producción anual (toneladas).
   - Plantas de proceso con su capacidad diaria (t/día).
   - Datos definidos en la superclase UnidadOperativa.

---

**Repositorio GitHub:** https://github.com/benmerinoduoc/SalmonttApp
**Fecha de entrega:** 08/12/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Formativa V

![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Formativa IV – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- Nombre completo: Benjamin Alejandro Merino Pinto
- Sección: 002A
- Carrera: Analista Programador Computacional
- Sede: Duoc Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Formativa IV de la asignatura Desarrollo Orientado a Objetos I. En esta versión se implementa una jerarquía de clases que permite modelar las unidades operativas de la empresa salmonera Salmontt, tales como centros de cultivo y plantas de proceso.

El objetivo principal fue organizar el sistema de forma jerárquica, reutilizable y escalable, permitiendo:

Reutilizar atributos comunes mediante una superclase (UnidadOperativa).

Especializar comportamientos y propiedades según el tipo de unidad (subclases CentroCultivo y PlantaProceso).

Probar la creación de objetos de manera manual desde un gestor de prueba (GestorUnidades).

Se implementaron constructores, herencia, sobrescritura de toString() y pruebas de los objetos mediante el método Main.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 resources/
└── centros.txt                 # Archivo de referencia (No se uso en esta actividad)

📁 src/
├── data/
│   └── GestorUnidades.java     # Crea objetos de prueba de cada subclase
├── model/
│   ├── CentroCultivo.java      # Subclase con atributo toneladasProduccion
│   ├── PlantaProceso.java      # Subclase con atributo capacidadProceso
│   └── UnidadOperativa.java    # Superclase con atributos nombre y comuna
└── ui/
    └── Main.java               # Ejecuta el programa y muestra los objetos creados
```
---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/benmerinoduoc/SalmonttApp.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta la clase `Main` desde el paquete `ui`.

4. En la consola podrás ver la lista de todas las unidades operativas creadas desde `GestorUnidades`, incluyendo los centros de cultivo con su producción en toneladas y las plantas de proceso con su respectivo rendimiento, mostrando todos los datos relevantes de cada unidad.
---

**Repositorio GitHub:** https://github.com/benmerinoduoc/SalmonttApp
**Fecha de entrega:** 01/12/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Formativa IV

![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Sumativa II – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- Nombre completo: Benjamin Alejandro Merino Pinto
- Sección: 002A
- Carrera: Analista Programador Computacional
- Sede: Duoc Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Sumativa II de la asignatura Desarrollo Orientado a Objetos I. Se trata de un sistema desarrollado en Java cuyo objetivo es cargar información desde un archivo externo, convertir esos datos en objetos y administrarlos mediante una lista ArrayList.

El proyecto fue desarrollado a partir de un caso contextualizado de la empresa salmonera Salmontt, abordando una necesidad real: identificar y analizar los centros de cultivo según su producción. Para esto, se implementó una solución sencilla y organizada, que permite leer los datos, almacenarlos, mostrarlos y permitir al usuario filtrar los centros según la cantidad mínima de toneladas que ingrese.

Además, se incorporaron validaciones básicas para asegurar que los datos de cada centro de cultivo sean consistentes.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/
│   └── Main.java               # Ejecuta el programa, muestra datos y aplica filtro dinamico de produccion
├── data/
│   └── GestorDatos.java        # Lee el archivo y arma la lista de centros de cultivo
├── model/
│   └── CentroCultivo.java      # Clase que representa un centro (nombre, comuna, produccion) con validaciones
📁 resources/
└── centros.txt                 # Archivo de texto con los datos separados por (;)
```
---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/benmerinoduoc/SalmonttApp.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta la clase `Main` desde el paquete `app`.

4. En la consola podrás ver la lista completa de los centros de cultivo cargados desde el archivo `centros.txt` y cuáles cumplen con el filtro dinámico de produccion ingresado por el usuario.


---

**Repositorio GitHub:** https://github.com/benmerinoduoc/SalmonttApp
**Fecha de entrega:** 24/11/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa II

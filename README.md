# 🚀 Temas Avanzados en Java

Repositorio con ejercicios y ejemplos enfocados en **conceptos avanzados de Java**, incluyendo manejo de archivos, excepciones, colecciones y organización de proyectos.

---

## 📚 Contenido

Este proyecto incluye ejemplos sobre:

* 📁 Manejo de archivos (lectura y escritura)
* ⚠️ Manejo de excepciones (`try-catch`)
* 📦 Colecciones:

  * `List`
  * `Set`
  * `Map`
* 🔁 Iteración con `for-each`
* 🧱 Clases abstractas
* 📦 JavaBeans
* 🧠 Argumentos por consola

---

## 🧩 Módulos del proyecto

El proyecto está organizado en diferentes carpetas:

* 📁 **archivos** → Lectura y escritura de archivos
* ⚠️ **excepciones** → Manejo de errores
* 🥤 **maquina_snacks** → Sistema de snacks
* 🧱 **maquina_snacks_archivos** → Sistema con persistencia en archivos
* 🧩 **dominio / servicio / presentación** → Estructura tipo capas

---

## 🚀 Tecnologías utilizadas

* Java (JDK 17+)

---

## 📂 Estructura del proyecto

```plaintext id="f4p9k2"
src/
├── archivos/
├── excepciones/
├── maquina_snacks/
├── maquina_snacks_archivos/
├── dominio/
├── servicio/
└── presentacion/
```

---

## 🧠 Objetivo

Este repositorio forma parte de mi aprendizaje avanzado en Java, enfocado en:

* Manejar errores correctamente
* Trabajar con archivos
* Utilizar colecciones
* Organizar proyectos de forma profesional
* Aplicar arquitectura básica por capas

---

## ▶️ Cómo ejecutar

1. Clonar el repositorio:

```bash id="k3m2p1"
git clone https://github.com/tu-usuario/TemasAvanzadosJava.git
```

2. Abrir en tu IDE (VS Code / IntelliJ)

3. Ejecutar las clases principales según el módulo

---

## 💡 Ejemplo

```java id="p9k3m2"
try {
    FileReader archivo = new FileReader("datos.txt");
} catch (IOException e) {
    System.out.println("Error al leer archivo");
}
```

---

## 📌 Mejoras futuras

* Integrar base de datos (JDBC)
* Aplicar patrones de diseño (DAO, MVC)
* Crear interfaces gráficas o API REST
* Manejar configuración externa

---

## 👨‍💻 Autor

Desarrollado por **Samahel Thomas**


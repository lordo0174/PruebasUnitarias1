# Pruebas Unitarias 1

Este repositorio contiene una implementacion de pruebas unitarias diseñadas para validar la lógica y asegurar la calidad del software del proyecto.
El objetivo principal es demostrar buenas prácticas en el desarrollo dirigido por pruebas y cobertura de código.

Sigue estas instrucciones al pie de la letra para configurar el entorno de trabajo:

### 1. El Fork (Navegador)
Antes de descargar el código, debes crear tu propia copia en la nube:
1. Entra al enlace original del proyecto.
2. Haz clic en el botón **"Fork"** (Bifurcar) arriba a la derecha.
3. Selecciona **"Create fork"**. Ahora tienes una copia exacta en tu cuenta de GitHub.

### 2. Clonar el Proyecto (En IntelliJ)
Copia la URL de **TU** repositorio (el que acabas de forkeas) y abre IntelliJ IDEA:
1. Haz clic en **"Get from VCS"** (o *File > New > Project from Version Control*).
2. Pega tu enlace en el campo **URL**.
3. Elige la carpeta de destino en tu ordenador y pulsa **Clone**.

### 3. Sincronizar Maven 🔄
Este paso es **crítico**. Si no lo haces, IntelliJ no reconocerá las librerías de prueba:
1. Busca el aviso flotante abajo a la derecha que dice **"Load Maven Project"** y haz clic.
2. Si no aparece, abre el panel lateral derecho llamado **Maven** (icono de la "m") y pulsa el botón de **Reload** (las dos flechas en círculo).
3. Espera a que la barra de progreso inferior termine de descargar las dependencias.

### 4. Preparar la Clase de Prueba
1. En el panel `Project`, despliega: `src > test > java`.
2. Haz clic derecho en `java` > `New` > `Package`. Nómbralo: `instituto`.
3. Dentro de `instituto`, crea una clase llamada: `ValidadorRegistroTest`.

---

## 🎯 Los 5 Retos de Testing

Tu objetivo es completar la clase `ValidadorRegistroTest` implementando los siguientes casos de prueba. Recuerda usar `@Test` y `@DisplayName` para que tus pruebas sean legibles.

| Reto | Descripción | Entrada Sugerida | Resultado Esperado |
| :--- | :--- | :--- | :--- |
| **1** | Nombre vacío | `""` | `false` |
| **2** | Password justa | `"12345678"` | `true` |
| **3** | Password corta | `"Admin"` | `false` |
| **4** | Email sin arroba | `"user.gmail.com"` | `false` |
| **5** | Edad límite | `16` | `true` |

---

## ✅ Check-list de Éxito (Resultado Final)

Para que tu práctica se considere completa y correcta, los resultados de tu **IntelliJ IDEA** deben coincidir con la siguiente estructura y pasar todas las validaciones.

### 1. Estructura de Archivos Correcta
Asegúrate de que en el panel izquierdo (`Project`), tu jerarquía se vea así:
* `src/test/java`
    * `instituto` (Paquete creado por ti)
        * `ValidadorRegistroTest.java` (Clase de pruebas)

### 2. Ejecución de los Tests
Al hacer clic en el botón de **Play** verde superior, la consola inferior debe mostrar exactamente esto:

| Indicador | Estado Esperado |
| :--- | :--- |
| **Total de tests** | `6 tests passed` (1 ejemplo + 5 retos) |
| **Iconos de estado** | Todos los retos con el check verde ✅ |
| **Código de salida** | `Process finished with exit code 0` |

### 3. Los 6 Checks Verdes
Tu panel de resultados (`Run`) debe listar estos tests superados:
* ✅ **Ejemplo: Un nombre válido debe ser aceptado**
* ✅ **Reto 1: Nombre vacío**
* ✅ **Reto 2: Password justa**
* ✅ **Reto 3: Password corta**
* ✅ **Reto 4: Email sin arroba**
* ✅ **Reto 5: Edad límite**

<img width="848" height="299" alt="image" src="https://github.com/user-attachments/assets/2f270a77-75b8-4857-b3fa-de037f12693b" />

---

**Desarrollado por:** lordo0174. 

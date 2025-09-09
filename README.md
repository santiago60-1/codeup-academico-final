# Sistema Académico CodeUp

### Requisitos
- Java 17
- Maven
- Git

### Instalación y ejecución
```bash

git clone https://github.com/santiago60-1/codeup-academico.git
cd codeup-academico
mvn compile
mvn exec:java -Dexec.mainClass="com.codeup.academico.App"
```
### Estructura inicial
```bash
src/main/java/com/codeup/academico
 ├─ domain
 ├─ ui/console
 └─ App.java
```

```bash
---
## ✅ Ejercicio práctico del día
1. Crear un **estudiante** y un **curso** en código.  
2. Imprimirlos en consola con `System.out.println()`.  
3. Hacer commit en la rama `feature/setup`.  
4. Crear un Pull Request a la rama `develop` en GitHub.  

---

📌 **Resultado esperado hoy**  
- Entorno Java + Maven + IDE configurado en Linux.  
- Proyecto Java funcionando.  
- Repositorio GitHub conectado con ramas (`develop` y `feature/setup`).  
- Primer commit con `App.java` y `Estudiante.java`.  
```
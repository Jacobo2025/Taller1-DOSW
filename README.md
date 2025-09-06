# Taller1-DOSW
# Integrantes:
- Jacobo Diaz Alvarado
- Maria Paula Rodriguez Muñoz
### Parte 3
1.	Cuál es la diferencia entre git merge y git rebase
   
- git merge: combina los cambios de una rama en otra creando un commit de merge, preservando el historial tal como ocurrió.

- git rebase: re-aplica los commits de una rama sobre otra, reescribiendo el historial para que parezca lineal.
  
2.	Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?
   
- Se produce un conflicto de merge.
  
3.	¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
   
- Con "git log --graph --oneline --all"
  
4.	Explica la diferencia entre un commit y un push?
   
- commit: guarda los cambios en el repositorio local.

- push: envía los commits locales al repositorio remoto.
  
5.	Para que sirve git stash y git pop?
   
- git stash: guarda temporalmente los cambios no confirmados (sin commit) para dejar el área de trabajo limpia.

- git stash pop: recupera esos cambios guardados y los aplica de nuevo en el área de trabajo.
  
6.	Qué diferencia hay entre HashMap y HashTable?
   
- HashMap no es sincronizado, permite una clave null y múltiples valores null, y suele ser más rápido en la práctica. En cambio, HashTable es sincronizado, no permite claves ni valores null y es una implementación más antigua.
  
7. Ventajas de Collectors.toMap() frente a un bucle tradicional:
- Permite construir mapas de forma declarativa y concisa usando streams.  
- Maneja automáticamente la combinación de valores en caso de claves duplicadas.  
- Facilita operaciones funcionales como filtrado, mapeo y ordenamiento en una sola línea.  
- Mejora la legibilidad y reduce errores de manejo manual del mapa.  

8. Operación de stream().map() sobre una lista de objetos:**  
- Es una operación de transformaciónque toma cada elemento de la lista y lo convierte en otro valor según la función que se pase a `map()`.  
- Retorna un Stream con los elementos transformados.  

9. Qué hace stream().filter() y qué retorna:
- Filtra los elementos de un stream según una condición booleana.  
- Retorna un nuevo Stream con solo los elementos que cumplen la condición.  

10. Paso a paso para crear una rama desde develop para una nueva funcionalidad:

    1. Cambiar a la rama develop:  
        ```bash
        git checkout develop

    2. Traer los últimos cambios de develop:
        ```bash
        git pull origin develop

    3. Crear y cambiar a la nueva rama feature:
        ```bash
        git checkout -b feature/nueva-funcionalidad
### 11. Diferencia entre git branch y git checkout -b
- git branch <nombre>: crea la rama pero no cambia a ella.  
- git checkout -b <nombre>: crea la rama y cambia automáticamente a ella.  

### 12. Por qué crear ramas feature para nuevas funcionalidades
- Mantiene la rama main limpia y estable.  
- Permite trabajar de forma aislada sin afectar a otros desarrolladores.  
- Facilita revisiones, pruebas y merges controlados.  
- Reduce riesgos de conflictos en el código principal.


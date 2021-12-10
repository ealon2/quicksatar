#Consultify
Queremos realizar un sistema de consultas para recopilar información a través de un link.
Las consultas se acceden a través de un link que se puede compartir, además tienen un periodo configurable durante el cual serán accesibles para completarlas.
Principalmente hay dos tipos de consultas: encuestas y formularios.

Las encuestas son para una única pregunta la cual siempre debe ser respondida y no puede ser una pregunta abierta. En cambio, los formularios pueden tener cualquier tipo de preguntas, y algunas pueden ser obligatorias y otras no.

Las preguntas que conforman las consultas pueden ser obligatorios u opcionales, además pueden ser de distintos tipos:
1. Texto libre. El usuario puede escribir cualquier valor. 
2. Si/No. Debe elegir entre estas dos opciones.
3. Multivaluada. De esta el usuario podrá elegir una única opción.

##Requerimientos específicos
```
1. Buscar una consulta en base a un link.
2. Saber si una consulta es accesible.
3. Crear una encuesta
4. Responder una encuesta, verificando:
   4.1 Que la pregunta fue respondida de forma adecuada
   4.2 Saber el resultado de una encuesta: cantidad de elecciones para cada opción.
5. Crear un formulario
6. Responder un formulario, verificando:
   6.1 Que todas las preguntas obligatorias hayan sido respondidas
   6.2 Que todas las preguntas con valores enumerados estén dentro de las opciones.
7. Queremos poder pausar una consulta, el inicio y fin no cambia ya que el usuario podrá reactivarla cuando lo desee. 
   Para esto vamos a tener varios criterios de pausado:
   7.1 Hasta cierta fecha, cuando se cumple dicha fecha se despausa.
   7.2 Indefinido, el usuario va a decidir despausarla.
   7.3 Cuando se haya llegado a un cierto número de respuestas se pausa.
8. Queremos que cada vez que se finaliza el periodo de una encuesta, si es que está así configurado, se envíen los resultados de la misma a todos los que participaron mediante el medio de comunicación que indique el siguiente componente.
```
Para el envío de mail y para los mensajes de Telegram nos dieron los siguientes componentes que implementan las siguientes interfaces respectivamente:

`Nota: Actualmente nos dijeron que existen solo el envío por mail y por Telegram, pero que más adelante se van a agregar Whatsapp y SMS.
Queremos que cada vez que se finaliza el periodo de una encuesta, si es que está configurado en dicha encuesta, mandar todas las respuestas a un sistema externo. Para hacerlo, nos dieron un componente que implementa la siguiente interfaz y que podemos utilizar para mandar todas las respuestas de una encuesta.
`
`Nota: Actualmente nos interesan estas dos acciones, pero queremos que el sistema sea lo suficientemente flexible como para agregar nuevas acciones a futuro.
Hacer foco en la construcción de las consultas. Que sea simple de realizar.`

Tips para la resolución del parcial:
- Realizar el diagrama de clases
- No hace falta que esté todo el diagrama junto, se puede ir dividiendo por requerimientos o como te parezca que se entienda mejor.
- Escribir pseudocódigo
- Obviar constructores que no tengan lógica importante, getters y setters.
- Recordar que NO tiene que compilar.
- Instanciación de objetos que sean importantes para los requerimientos, como son los puntos de entrada.
- Aclarar decisiones de diseño en prosa:
- Distinta￼s alternativas que pensaron y por cuál siguieron y por qué descartaron las otras.
- Supuestos sobre los requerimientos.





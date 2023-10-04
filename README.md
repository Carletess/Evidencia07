## Evidencia 07 Programación Orientada a objetos
### **Integrantes:**
- Carlos Pradenas
- Diego Labrin
---
### Actividades:
i. Identifique las clases y lo que éstas representan. Luego, establezca una descripción textual breve del contexto problema.

> El código de ejemplo posee dos clases: Calculadora() y CarroCompras(). La primera realiza operaciones de suma y multiplicación, y la segunda simula un carro de compra con algunas funciones como calcular el valor total y mostrar este valor.

 ii. Analice los atributos y métodos de cada clase, luego, identifique las relaciones existentes entre las clases identificadas y establezca una descripción textual breve del contexto problema. 

> La clase Calculadora() posee dos atributos privados: n1 y n2 y los siguientes métodos:
> - Calculadora(): Primer constructor que no recibe parámetros, e inicializa n1 y n2 en valor cero
> - Calculadora(): Segundo constructor que inicializa sus atributos en los valores que este recibe
> - sumar(): devuelve la suma de los dos valores de sus atributos (n1 y n2)
> - multiplicar(): devuelve la multiplicación de sus dos atributos.
> - setN1(): guarda un valor para el atributo n1
> - setN2(): guarda un valor para el atributo n2
> La clase CarroCompra posee un atributo que es una matriz de 2x5 y los atributos:
> - CarroCompra(): Rellena la matriz con valor 1 en su fila 1 que representa la cantidad de sus productos, y con valor 1000 en su fila 2 que representa el valor del producto.
> - calcularTotal(): Utiliza el método subTotal() para sumar y devolver el valor total del la compra.
> - subTotal(): Inicializa un objeto de la clase Calculadora con los valores de cantidad y valor, y utilizar uno de sus métodos(multiplicar)
> - mostrarTotal(): Imprime en pantalla el valor que devuelve el método calcularTotal()
> La clase CarroCompras() tiene una dependencia de la clase Calculadora() al usar esta última en uno de sus métodos. Específicamente en el método subTotal(), donde se instancia a la clase Calculadora para usar uno de sus métodos.

iii. De lo anterior, establezca una representación detallada del código fuente, usando un diagrama de clases UML y la herramienta de modelado Visual Paradigm.

![Diagrama UMl](https://github.com/Carletess/Evidencia07/blob/bc163ff077f62b7263334094e9a56f5b81de2206/visual%20paradigm.png)

> *La imagen del diagrama posee una flecha que indeca dependencia pero no se alcanza anotar por el fondo negro*


iv. Genere un código fuente Java a partir de su modelo de clases.

[calculadora](https://github.com/Carletess/Evidencia07/blob/bc163ff077f62b7263334094e9a56f5b81de2206/src/main/java/org/example/Calculadora.java)

[carro de compra](https://github.com/Carletess/Evidencia07/blob/bc163ff077f62b7263334094e9a56f5b81de2206/src/main/java/org/example/CarroCompra.java)

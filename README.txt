El objetivo de esta práctica es repasar conceptos básicos de programación por un lado, y aprender
a utilizar tipos de datos que requieren del uso de memoria dinámica por otro. Se pretende de esta
forma que se adquiera el hábito de reservar memoria para variables y de comprobar si se dispone
de memoria reservada para una determinada variable a la hora de acceder a sus atributos.
Cuando se declara una variable de un tipo que requiere el uso de memoria dinámica, dicha
memoria no se reserva al declarar la variable, sino que se tiene que hacer de forma explícita, ya que
el valor que toman todas estas variables por defecto es null (vacío). Si se accede a algún componente
de este tipo de variables sin haber realizado previamente una reserva de memoria se produce un
error en la ejecución del programa (NullPointerException).
En esta práctica se implementarán dentro del fichero Metodos.java los métodos descritos a
continuación, donde cada método tendr´a un nombre, tipo de valor devuelto y tipo y orden de
parámetros que deben ser respetados (no se pueden cambiar).
Se pueden implementar métodos adicionales si se considera necesario.

1. public static int[] nomultiplos( int num, int n1, int n2 )
Implementa un método que devuelva un array con todos los números naturales menores o
iguales que num, que no sean múltiplos ni de n1 ni de n2. En caso de que algún dato sea
incorrecto (negativo o cero), devolver´a null.
Por ejemplo, al invocar a nomultiplos( 24, 3, 7 ), el valor devuelto será un array que
contiene: {1, 2, 4, 5, 8, 10, 11, 13, 16, 17, 19, 20, 22, 23}

2. public static String[] sufijos( String s )
Implementa un método al que se le pase por par´ametro una cadena no vacía, y devuelva todos
los sufijos de la cadena en un array de String (de menor a mayor tamaño).
Por ejemplo, si la cadena es ‘‘aquaman’’ el array devuelto ser´a:
{‘‘n’’, ‘‘an’’, ‘‘man’’, ‘‘aman’’, ‘‘uaman’’, ‘‘quaman’’, ‘‘aquaman’’}

3. public static String[] prefijos( String s )
Implementa un método al que se le pasa por parámetro una cadena no vacía, y devuelva todos
los prefijos de la cadena en un array de String (de menor a mayor tama˜no).
Por ejemplo, si la cadena es ‘‘aquaman’’ el array devuelto ser´a:
{‘‘a’’, ‘‘aq’’, ‘‘aqu’’, ‘‘aqua’’, ‘‘aquam’’, ‘‘aquama’’, ‘‘aquaman’’}

4. public static String IMC( double altura, double peso, int edad )
El índice de masa corporal es el cociente entre el peso del individuo en kilos y el cuadrado de
su estatura en metros. Además se define la condición de riesgo según la tabla:
                            edad < 45 edad ≥ 45
                            IMC < 22.0 bajo medio
                            IMC ≥ 22.0 medio alto

Implementa un método al que se le pasa como par´ametro la altura, peso y edad de una persona
(todos valores positivos), y devuelva una cadena con su condici´on de riesgo: ‘‘bajo, medio,
alto’’. En caso de que haya alg´un dato err´oneo (algún parámetro menor o igual a cero) el
m´etodo devuelve la cadena ‘‘error en entrada’’.

5. public static int[] comunes( int[] v1, int[] v2 )
Implementa un método al que se le pasa por parámetro dos arrays de enteros sin repetición 1
y devuelva, en un array ordenado de menor a mayor, sólo los elementos comunes en los dos
arrays. Inicialmente los arrays v1 y v2 no tienen por qué estar ordenados. Si no hay ninguna
salida se devuelve null.
Por ejemplo si v1 = {5, 1, 3, 4} y v2 = {7, 8, 3, 5}, la salida ser´a {3, 5}

6. public static void secCollatz( int i )
La secuencia Collatz de un número entero se construye de la siguiente forma:
si el número es par, se divide por dos;
si es impar, se le multiplica por tres y se le suma uno;
la sucesión termina al llegar a uno.
Implementa un método que muestre por pantalla tantas líneas como enteros hay entre 1 e i.
Cada línea debe contener el número de línea y, separado por un espacio en blanco, el número
de elementos de su secuencia Collatz.

Ejemplo:
la entrada i = 5 mostrar´a:
1 1
2 2
3 8
4 3
5 6

7. public static int[] Collatz( int i )
Implementa un m´etodo al que se le pase por par´ametro un entero positivo i y devuelva en un
array los elementos de su secuencia Collatz desde i hasta 1.
La conjetura de Collatz afirma que, partiendo desde cualquier n´umero, la secuencia siempre llegar´a a 1. A pesar
de ser una afirmaci´on a simple vista muy simple, no se ha podido demostrar si es cierta o no.

Ejemplos:
para la entrada i = 18 se devolver´a el array
{18, 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4,
2, 1}.
para la entrada i = 20 se devolver´a el array
{20, 10, 5, 16, 8, 4, 2, 1}.

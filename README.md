# Proyecto 2 Programacion Avanzada

El proyecto 2 del laboratorio de programacion avanzada consiste en la implementacion de un programa que recorra un archivo de texto
guardando los datos, dependiendo de las estructuras de datos incluidas en un archivo .txt, en un arreglo de Strings.
Con este arreglo de datos se creean las estructuras de datos correspondientes a ellos para despues implementar un codigo que 
cree un archivo .png de un grafo a partir de la estructura de datos.

## Documentacion
La implementacion de este proyecto la dividi en 2 paquetes de clase. El primer paquete con las clases que utilizaremos para crear las
distintas estructuras de datos requeridas en este proyecto. Y un segundo paquete principal que contendra con las siguientes clases:
* Lector: Contiene el metodo que lee el archivo de texto y guarda los datos en arreglos Strings para cada estructura de dato.
* Main: Contiene los arreglos String para cada estructura, la estructura en si y un archivo tipo Image para cada grafo generado. 
Cada un declarado de manera statica.
* Structures: Contiene el metodo que genera las estructuras en base a los arreglos y cada uno de los metodos que crea las imagenes 
.png de cada grafo.
* Operador: Es la clase principal de la parte de javafx del proyecto.
* LecturaArchivoController: Esta clase es el controlador del archivo LecturaArchivo.fxml que 

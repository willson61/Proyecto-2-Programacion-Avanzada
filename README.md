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
* LecturaArchivoController: Esta clase es el controlador del archivo LecturaArchivo.fxml que corre el metodo de lectura de la clase
Lectory muestra la ventana de crea y muestra los grafos.
* MostrarGrafosController: Esta clase es el controlador del archivo MostrarGrafos.fxml qu een caso de que las estructuras no esten vacias
crear un archivo .png con el grafo de ellas y las muestra en un ImageView.

Nota Importante
---------------
Cabe destacar que para el funcionamiento correcto de este programa el archivo .txt se debe encontrar en la carpeta TestFolder del usuario Public del ordenador. Aqui esta un ejemplo de la direccion donde se debe ubir el archivo: "C:\\Users\\Public\\TestFolder\\".

### Imagenes de Ejecucion
1. Ventana de ingreso de nombre de archivo .txt                              
![img - 1](https://github.com/willson61/Proyecto-2-Programacion-Avanzada/blob/master/ImgEjecucion/img1.png)
2. Ventana de muestra de Grafos
![img - 2](https://github.com/willson61/Proyecto-2-Programacion-Avanzada/blob/master/ImgEjecucion/img2.png)
3. Mensaje de Grafos Creados
![img - 3](https://github.com/willson61/Proyecto-2-Programacion-Avanzada/blob/master/ImgEjecucion/img3.png)
4. Muestra de Grafos
![img - 4](https://github.com/willson61/Proyecto-2-Programacion-Avanzada/blob/master/ImgEjecucion/img4.png)

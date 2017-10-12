# Aplicacion de ejemplo 1 - Android

Este proyecto fue creado con la finalidad de aprender los elementos básicos de Android referentes a layouts y funcionalidades básicas
sin ir de manera profunda en ello, dentro de este ejemplo se testea como manejar los limites entre layouts y relación de tamaño entre
si, de tal forma que los elementos presentes en la pantalla no se superpongan entre si, de la misma forma asegurarse que este proyecto
sea compatible con un gran numero de teléfonos y tablets que actualmente se encuentran en uso, junto con otros divertidos elementos
que fueron utilizados dentro del programa

Una vez abierto el programa, el usuario se encontrara con este tipo de pantalla, como es un proyecto de tipo tutorial, se utilizaron
colores que son fáciles de distinguir para poder entender cual elemento en la pantalla está siendo utilizado

<img src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/main.png" data-canonical-src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/main.png" width="200" height="auto" />

En esta aplicación se aprendió a usar y posicionar distintos elementos dentro de Linearlayouts, tales como otros Linearlayouts, botones,
botones de tipo imagen y e incluso una vista de tipo scroll, entregándoles id's que son mas tarde, localizados y entregado una
funcionalidad determinada

Ya que este programa en su core es bastante simple, solo se hace uso de un MainActivity sin fragments de ningún tipo, donde se manejan todas las funcionalidades que el proyecto ha de realizar, por ejemplo cada botón posee un nombre y realiza una operación determinada la cual se muestran a continuación:

<img src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/alert.png" data-canonical-src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/alert.png" width="200" height="auto" />

El botón Alert muestra un mensaje en pantalla de clase Alert, el cual muestra un titulo, mensaje y botón personalizado que requiere de una interacción con el usuario para hacer que este desaparezca, volviendo así a la pantalla principal del programa

<img src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/toggle.png" data-canonical-src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/toggle.png" width="200" height="auto" />

El botón Toggle es capaz de esconder y mostrar el Layout de en medio dependiendo de su estado actual, el cual contiene 3 rectángulos
blancos, reajustando de manera automática el Layout de abajo que anida un scroll view (el cual explicaremos más adelante)

<img src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/show.png" data-canonical-src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/show.png" width="200" height="auto" />

El botón Show ha de mostrar un pequeño mensaje de tipo Toast estándar de corta duración, mientras que el botón Close cierra el programa completamente

<img src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/scroll.png" data-canonical-src="https://github.com/PabloHidalgoB/example1-android/blob/master/app/src/main/res/screenshots/scroll.png" width="200" height="auto" />

Notara en las vistas entregadas que hay una imagen que aparece cortada en la parte baja de la pantalla del teléfono, esto es porque estos son imágenes de tipo botón que están desplegadas dentro de una vista scroll, todas estas imagenes-botones realizan un único funcionamiento que es reproducir un sonido que esta directamente relacionado a estos personajes

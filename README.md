## ApplicationProyectoFinalVirginia
#Desarrollo de Aplicación Android con MVVM
#Descripción
Este documento describe el proceso de desarrollo de una aplicación Android siguiendo el patrón de arquitectura MVVM (Model-View-ViewModel). La aplicación consta de una única pantalla en la que los usuarios pueden comparar dos cadenas de texto y ver si son iguales o diferentes.

Pasos de Implementación
Paso 1: Crear un Nuevo Proyecto en Android Studio
Abre Android Studio.
Selecciona "Start a new Android Studio project" o "File" > "New" > "New Project".
Completa la configuración inicial, como el nombre del proyecto y la ubicación del archivo.
Elige "Phone and Tablet" como tipo de dispositivo.
Selecciona "Empty Activity" como plantilla y haz clic en "Finish".

Paso 2: Diseñar la Interfaz de Usuario
Abre el archivo activity_main.xml en la carpeta res/layout y agrega elementos de la interfaz siguiendo las premisas.
Utiliza elementos como EditText para las cadenas de texto, un botón "Comparar" y un TextView para mostrar el resultado.

Paso 3: Configurar la Arquitectura MVVM
Crea un paquete llamado data en el directorio principal del proyecto para el repositorio.
Dentro del paquete data, crea la clase ComparisonRepository.kt que contendrá la lógica de comparación.
Crea un paquete llamado viewmodel para el ViewModel y crea la clase ComparisonViewModel.kt que se comunica con el repositorio.

Paso 4: Implementar la Lógica en el Repository
En ComparisonRepository.kt, implementa la función compareStrings que recibe dos cadenas y devuelve si son iguales o no.

Paso 5: Vincular ViewModel con la Interfaz de Usuario
En MainActivity.kt, vincula el ViewModel con los elementos de la interfaz.
Implementa la lógica para comparar las cadenas cuando el botón "Comparar" se presiona.

Paso 6: Pruebas
Para pruebas unitarias, crea ExampleUnitTest.kt en el directorio test y escribe pruebas para el repositorio.
Para pruebas de interfaz de usuario, crea ExampleInstrumentedTest.kt en el directorio androidTest y utiliza Espresso para escribir pruebas de UI.
Repositorio en GitHub Pages
El proyecto completo se encuentra alojado en un repositorio de GitHub en el siguiente enlace: Enlace al repositorio: https://virginiacatellano.github.io/ApplicationProyectoFinalVirginia/

##Conclusión
Este documento ha detallado los pasos que seguí para desarrollar una aplicación Android utilizando el patrón MVVM. La aplicación permite a los usuarios comparar cadenas de texto y muestra el resultado en la interfaz de usuario. El proyecto completo se encuentra disponible en línea a través de GitHub Pages.

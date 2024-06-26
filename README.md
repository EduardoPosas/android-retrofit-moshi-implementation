Mars Photos
==================================

Mars Photos es una aplicación que mustra imágenes de la superficie de marte. Estas imágene son
reales de Marte y son capturadas por el Mars rovers de la NASA. La información está almacenada en un
servidor web como un servicio web REST.

La aplicación muestra el uso de [Retrofit](https://square.github.io/retrofit/) para realizar peticiones REST a un servicio web,
se utiliza [Moshi](https://square.github.io/moshi/1.x/) para manejar la deserialización del JSON retornado y mapearlos a data objects de Kotlin,
y [Coil](https://coil-kt.github.io/coil/) para cargar imágenes por URL.

Pre-requisitos
--------------

Se requiere tener conocimiento de:
- Como crear Composables.
- Como utilizar componentes de arquitectura incluyendo ViewModel.
- Como utilizr corutinas para tareas asíncronas.
- Familiaridad con lazy grid composable

Componentes utilizados de la aplicación
--------------

- Inyección de dependencias manual (application class)
- Proveedor de ViewModel (viewModelFactory)
- Scaffold
- LazyVerticalGrid
- Card composable
- AsyncImage

Funcionalidad de la aplicación
--------------

1. Pantalla consulta satisfactoria al servicio web usando retrofit

<img alt="mars_photos_ok.jpg" src="app%2Fsampledata%2Fmars_photos_ok.jpg" width="250"/>

2. Pantalla while fetching

<img alt="mars_photos_fetching.jpg" src="app%2Fsampledata%2Fmars_photos_fetching.jpg" width="250"/>

3. Funcionalidad de error al cargar la imágen

<img alt="mars_photos_lost_connection.jpg" src="app%2Fsampledata%2Fmars_photos_lost_connection.jpg" width="250"/>

4. Funcionalidad de retry ante pérdida de conectividad

<img alt="mars_photos_no_network.jpg" src="app%2Fsampledata%2Fmars_photos_no_network.jpg" width="250" style="margin: 0 auto"/>
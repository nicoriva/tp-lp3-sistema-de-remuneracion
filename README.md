<h1 align="center">Sistema de Remuneración</h1>
<h2 align="center">Acerca del funcionamiento del sistema</h2>
Importar el archivo .json a la herramienta Insomnia para tener los request a ser utilizados.<br>
Indicar en el archivo application.properties la ruta donde se guardara el archivo de la base de datos.<br>
En el repositorio se encuentran un archivo con una base de datos de prueba para probar los CRUDS.
<h2 align="center">Acerca de los Requests</h2>
En la URL se debe poner localhost:8080/api/sistema/ y posteriormente colocando en esa dirección los nuevos requests.<br>
<h2 align="center">CRUDS</h2>
<h3 align="center">CRUD Usuarios</h3>
<h3>Agregar usuario</h3>
Es un request de tipo POST. Primero se agrega usuario/ a la dirección principal y posteriormente se envía con un formato JSON los datos para crear al usuario, como nombre, contraseña, correo, rol y fecha de invitación.
<h3>Listar usuarios</h3>
Para esto recurrimos a un request de tipo GET. Primeramente se agrega usuario/ a la dirección principal. "Query" es una opción del Insomnia donde se pueden añadir filtros para listar. En caso de no agregarse tales filtros, se listarán todos los usuarios.
<h3>Listar usuarios por rol</h3>
Este es un request de tipo GET. Se añade usuario/{rol} (poniendo el rol por el cual se desea listar) a la dirección principal.
<h3>Notificar expiración</h3>
Nuevamente un request de tipo GET. En este caso se añade usuario/notificar-expiracion a la dirección principal. Se imprime en la consola (no en insomnia) el mensaje que se envía al usuario cuyas invitaciones están expiradas (Se inicia el aviso 2 días antes del vencimiento).
<h3>Borrar usuario por ID</h3>
En este caso es un request de tipo DEL. Se agrega usuario/{id} (poniendo el id del usuario que se desea eliminar) a la dirección principal.
<h3 align="center">CRUD Organizaciones</h3>
<h3>Agregar organizaciones</h3>
Se utiliza un request de tipo POST. Primero se agrega organizacion/ a la dirección principal para seguidamente enviar en formato JSON la lista de los datos para crear la organización.
<h3>Listar organizaciones</h3>
Para esto se utiliza un request de tipo GET. Se agrega organizacion/ a la dirección principal. Con la opción de "Query" del Insomnia se pueden agregar filtros para listar.  En caso de no agregarse tales filtros, se listarán todas las organizaciones.
<h3>Listar organizaciones por rol</h3>
Utilizando un request de tipo GET, se agrega organizacion/{tipoDeOrganizacion} a la dirección principal. 
<h3>Borrar organización</h3>
Para esto se utiliza un request de tipo DEL. Se agrega organizacion/{id} (poniendo el id de la organización que se desea eliminar) a la dirección principal.
<h3 align="center">CRUD Pagos</h3>
<h3>Agregar pago</h3>
Este es un request de tipo POST. Se agrega pago/ a la dirección principal. Mediante el formato JSON se indican los datos para crear el pago.
<h3>Listar pagos</h3>
Para esto se utiliza un request de tipo GET. Se agrega pago/ a la dirección principal."Query" del Insomnia es utilizado para agregar los filtros para listar. En caso de no agregarse tales filtros, se listarán todos los pagos.
<h3>Borrar pago por ID</h3>
En este caso es un request de tipo DEL. Se agrega pago/{id} (poniendo el id del pago que se desea eliminar) a la dirección principal.
<h2 align="center">Información adicional</h2>
Para realizar el trabajo se tuvieron en cuenta los ejemplos desarrollados en clase y los trabajos de semestres anteriores compartidos por el profesor.

<h1 align="center">Sistema de Remuneración</h1>
<h2 align="center">Acerca del funcionamiento del sistema</h2>
Importar el archivo .json a la herramienta insomnia para tener los request a ser utilizados.<br>
<h2 align="center">Acerca de los Requests</h2>
En la URL se debe poner localhost:8080/api/sistema/ y posteriormente colocando en esa dirección los nuevos requests.<br>
<h2 align="center">CRUDS</h2>
<h3 align="center">CRUD Usuarios</h3>
<h3>Agregar usuario</h3>
Es un request de tipo POST. Primero se agrega usuario/add-curador a la direccion principal y luego se envia en formato JSON una lista de los datos basicos para crear al usuario, como nombre, contraseña, correo y rol.
<h3>Listar usuarios</h3>
Es un request de tipo GET. Primero se agrega sitio/list a la direccion principal y luego con la opcion de "Query" del Insomnia se pueden agregar filtros para listar. Por ejemplo si se marca la opcion de id_sitio_review 1, se agrega al URL ?id_sitio_review=1. Si no se agregan filtros, se listan todos los sitios.
<h3>Listar usuarios por rol</h3>
Es un request de tipo GET. Primero se agrega sitio/list a la direccion principal y luego con la opcion de "Query" del Insomnia se pueden agregar filtros para listar. Por ejemplo si se marca la opcion de id_sitio_review 1, se agrega al URL ?id_sitio_review=1. Si no se agregan filtros, se listan todos los sitios.
<h3>Notificar expiración</h3>
Es un request de tipo GET. En este caso se añade usuario/notificar-vencimiento-usuarios a la direccion principal. Se imprime en la consola (no en insomnia) el mensaje que se envia al usuario cuyas credenciales estan vencidas(Se comienza el aviso 2 dias antes del vencimiento).
<h3>Borrar usuario por ID</h3>
En este caso es un request de tipo DEL. Se agrega usuario/delete a la direccion principal. Se envia en formato JSON el id del que se desea eliminar.
<h3 align="center">CRUD Organizaciones</h3>
<h3>Agregar organizaciones</h3>
Es un request de tipo POST. Primero se agrega usuario/add-curador a la direccion principal y luego se envia en formato JSON una lista de los datos basicos para crear la organización.
<h3>Listar organizaciones</h3>
Para esto se utiliza un request de tipo GET. Se agrega sitio/list a la direccion principal. Con la opcion de "Query" del Insomnia se pueden agregar filtros para listar. Por ejemplo si se marca la opcion de id_sitio_review 1, se agrega al URL ?id_sitio_review=1. Si no se agregan filtros, se listan todas las organizaciones.
<h3>Listar organizaciones por rol</h3>
Para esto se utiliza un request de tipo GET. Se agrega sitio/list a la direccion principal. Con la opcion de "Query" del Insomnia se pueden agregar filtros para listar. Por ejemplo si se marca la opcion de id_sitio_review 1, se agrega al URL ?id_sitio_review=1. Si no se agregan filtros, se listan todas las organizaciones.
<h3>Borrar organización</h3>
Se utiliza un request de tipo DEL. Se agrega promocion/delete a la direccion principal. Se envia en formato JSON el id de la que se desea eliminar.
<h3 align="center">CRUD Pagos</h3>
<h3>Agregar pago</h3>
Este es un request de tipo POST. Se agrega pago/add a la direccion principal. Se envia en formato JSON el nombre y el puntaje maximo del sitio que se puede crear.
<h3>Listar pagos</h3>
Para esto se utiliza un request de tipo GET. Se agrega pago/list a la direccion principal. Con la opcion de "Query" del Insomnia se pueden agregar filtros para listar. Por ejemplo si se marca la opcion de id_sitio_review 1, se agrega al URL ?id_sitio_review=1. Si no se agregan filtros, se listan todos los pagos.
<h3>Borrar pago por ID</h3>
En este caso es un request de tipo DEL. Se agrega pago/delete a la direccion principal. Se envia en formato JSON el id del que se desea eliminar.

Mis libros - Catálogo de Libros
Aplicación de consola para la gestión de libros y autores, consumiendo la API de Gutendex. El sistema permite buscar libros en la web, registrarlos en una base de datos local y realizar diversos filtros estadísticos y biográficos.

Tecnologías Utilizadas
Java 17 (o superior)

Spring Boot (Spring Data JPA)

MariaDB (Base de datos persistente)

Jackson (Manipulación de JSON)

Maven (Gestión de dependencias)

Configuración del Entorno
Este proyecto utiliza variables de entorno para proteger las credenciales de la base de datos. Asegúrate de configurar las siguientes variables en tu sistema:

URL_MARIADB: La URL de conexión (ej: jdbc:mariadb://localhost:3306/mislibros_db)

USER_MARIADB: Tu usuario de MariaDB.

PASS_MARIADB: Tu contraseña de MariaDB.

Funcionalidades
El menú principal ofrece las siguientes opciones:

Buscar libro por título: Consulta la API de Gutendex y registra el libro y su autor en la base de datos.

Listar libros registrados: Muestra todos los libros almacenados localmente.

Listar autores registrados: Muestra los autores y sus libros asociados.

Listar autores vivos en un año determinado: Filtra autores por cronología biográfica.

Listar libros por idioma: Filtra la biblioteca según el código de idioma (es, en, fr, pt).

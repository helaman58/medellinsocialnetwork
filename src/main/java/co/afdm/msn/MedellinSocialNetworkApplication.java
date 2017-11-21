package co.afdm.msn;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@ComponentScan("co.afdm.msn")
public class MedellinSocialNetworkApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(MedellinSocialNetworkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MedellinSocialNetworkApplication.class, args);
	}
	
	@Autowired
    JdbcTemplate jdbcTemplate;

	@Override
    public void run(String... strings) throws Exception {

        log.info("Creando las tablas...");

        //Eliminar la tabla actual y existente
        //jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("DROP TABLE publicacion IF EXISTS");
        jdbcTemplate.execute("DROP TABLE comentario IF EXISTS");
        //Creamos las tablas comentario y publicacion
        //jdbcTemplate.execute("CREATE TABLE customers(" +
        //        "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
        jdbcTemplate.execute("CREATE TABLE publicacion(" +
        		"id SERIAL, titulo VARCHAR(255), texto VARCHAR(255), usuario VARCHAR(20))");
        jdbcTemplate.execute("CREATE TABLE comentario(id SERIAL, texto VARCHAR(255), usuario VARCHAR(20), pubid VARCHAR(3))");
        //TO DO - PENDIENTE CREAR TABLA MULTIMEDIA
        // Split up the array of whole names into an array of first/last names
        /*
        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());
		*/
        //Inicializamos la tabla publicacion
        List<Object[]> splitPubData = Arrays.asList("Primera Publicación,Es nuestra primera publicación insertada desde la inicialización de Spring,Alejandra", "Segunda Publicación,Ejemplo de una publicación adicional o número 2,Jorge", "Tercera Publicación,Última publicación,Pepito").stream()
                .map(publicacion -> publicacion.split(","))
                .collect(Collectors.toList());
        //Inicializamos la tabla comentario
        List<Object[]> splitComData = Arrays.asList("Primer comentario,Julian,1", "Segundo comentario,Nicolas,1", "Tercer comentario,Pepito,1", "Primer comentario pub 2,Pepito,2", "Primer comentario pub 3,Juanito,3").stream()
                .map(comentario -> comentario.split(","))
                .collect(Collectors.toList());
        // Use a Java 8 stream to print out each tuple of the list
        //splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s %s", name[0], name[1])));
        //Mostramos los registros a insertar
        splitPubData.forEach(publicacion -> log.info(String.format("Insertando registro de publicacion para %s %s %s", publicacion[0], publicacion[1], publicacion[2])));
        splitComData.forEach(comentario -> log.info(String.format("Insertando registro de comentario para %s %s %s", comentario[0], comentario[1], comentario[2])));

        // Uses JdbcTemplate's batchUpdate operation to bulk load data
        //jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?,?)", splitUpNames);
        //Insertamos el registro en la base de datos
        jdbcTemplate.batchUpdate("INSERT INTO publicacion(titulo, texto, usuario) VALUES (?,?,?)", splitPubData);
        jdbcTemplate.batchUpdate("INSERT INTO comentario(texto, usuario,pubid) VALUES (?,?,?)", splitComData);
        
        //Vamos a mostrar los resultados de la búsqueda en la tabla publicaciones
        //log.info("Querying for customer records where first_name = 'Josh':");
        log.info("**************************************************************");
        /*
        jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers WHERE first_name = ?", new Object[] { "Josh" },
                (rs, rowNum) -> new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
        ).forEach(customer -> log.info(customer.toString()));
        */
        java.util.List<Map<String,Object>> resultPub = jdbcTemplate.queryForList("SELECT titulo, texto, usuario FROM publicacion");
        System.out.println(resultPub);
        log.info("**************************************************************");
        java.util.List<Map<String,Object>> resultCom = jdbcTemplate.queryForList("SELECT texto, usuario, pubid FROM comentario");
        System.out.println(resultCom);
    }
}

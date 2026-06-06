//1.para que el powershell apunte a proyecto y reconozca los comandos mvnw 2.para limpiar y que se hagan los cambios del proyecto 3.para ejecutar el proyecto

//cd proyecto 
// dir -Force

//.\mvnw.cmd clean install

//.\mvnw.cmd spring-boot:run

//ctrl c para detenerlo

package ufide.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

}

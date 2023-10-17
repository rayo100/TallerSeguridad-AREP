# APLICACIÓN SEGURA

Desarrollaremos una aplicación Web segura con los siguientes requerimientos:
1. Permitir un acceso seguro desde el browser a la aplicación. Es decir, garantizar autenticación, autorización e integridad de usuarios.
2. Tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
3. Explicar como escalar nuestra arquitectura de seguridad para incorporar nuevos servicios.

---
## ARQUITECTURA
![image](https://github.com/rayo100/TallerSeguridad-AREP/assets/89558695/133c9d47-c742-4a99-bfd3-89fd1eeb5efb)


---
### CÓMO INSTALAR
Para instalar el programa, sigue los pasos:

Clone el repositorio en el directorio de su perferencia:

    git clone https://github.com/rayo100/TallerSeguridad-AREP.git
    
Accede al repositorio clonado

    cd TallerSeguridad-AREP

Hacemos la construcción del proyecto

    mvn clean install

Ejecuta los siguientes comandos 

    java -cp "target/classes;target/dependency/*" com.mycompany.securespark.login.SecureSpark

En consola de comandos diferente
    
    java -cp "target/classes;target/dependency/*" com.mycompany.securespark.Facade.SecureApp
    
Cuando la aplicación haya iniciado, puedes dirigirte a tu navegador de preferencia y entrar en https://localhost:5000/login para ver la app corriendo, 
en ella encontraras mi página de inicio de sesión.

![image](https://github.com/rayo100/TallerSeguridad-AREP/assets/89558695/38a1726c-ca7b-44cd-817c-e7a8b5d61aaa)


---
### Pruebas
Para probar que el desarrollo de la aplicación fue correcto, se intentará ingresar con un usuario registrado y con otro no registrado.
Teniendo en cuenta que los usuarios registrados y sus respectivas contraseñas son:
* cesar -> 1tapama6
* lupin -> 123456

Usuario registrado:
![image](https://github.com/rayo100/TallerSeguridad-AREP/assets/89558695/45308413-6417-46f8-b12f-03685221e48d)
![image](https://github.com/rayo100/TallerSeguridad-AREP/assets/89558695/6a713c16-1933-4e46-8383-2a9a1e1d0bb7)

Usuario no registrado:
![image](https://github.com/rayo100/TallerSeguridad-AREP/assets/89558695/b395fb74-cf46-4f49-8178-9d3acebeb775)
![image](https://github.com/rayo100/TallerSeguridad-AREP/assets/89558695/141fb678-8a1a-47d8-8816-6afcb33945e2)

	
---
# VIDEO DESPLEGADO EN AWS



# HERRAMIENTAS

  * [Git](https://git-scm.com/) - Controlador de versiones
  * [Java](https://www.java.com/) - El lenguaje de programación utilizado
  * [JavaScript](https://www.javascript.com/) - El lenguaje de programación utilizado para la lógica de la página principal
  * [HTML](https://html.com/document/) - El lenguaje de marcado utilizado para la estructura de la página de inicio
  * [Maven](https://maven.apache.org/) - Gestión de dependencias
  * [Docker](https://www.docker.com/) - Container Management

# AUTOR

  * Cesar Vásquez [GitHub](https://github.com/rayo100)

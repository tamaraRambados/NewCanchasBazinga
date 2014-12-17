NewCanchasBazinga
=================


Diagrama de Clases por ahora

https://www.draw.io/?#G0B6ygzcEmbkErRk1faUdCSkhVMFE

=======================================================

Cambio para que el archivo .war coincida con la definicion de "angular.module('myapp',['ngRoute'])"
1 - En pom.xml modificar el siguiente plugin:
     
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-war-plugin</artifactId>
          <version>2.4</version>
            <configuration>
                <warName>canchasBazinga</warName>
            </configuration>
    </plugin>



Como inicializar la apliacion:

1 - /NewCanchasBazinga/canchasBazinga --> mvn clean install 
2 - /NewCanchasBazinga/canchasBazinga/target --> cp canchasBazinga.war /apache-tomcat/webapps/
3 - Inicializar Tomcat --> ./startup
4 - Home de la aplicacion --> http://localhost:8080/canchasBazinga/tuPartidito/inicio.html

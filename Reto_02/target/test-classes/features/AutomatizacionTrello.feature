#Author: Victor Rodriguez
@Regresion
Feature: Automatizacion de la herramienta trello
  Como miembro lider de un equippo agil
  Quiero crear un especio dentro de la plataforma Trello
  Para que mi equipo pueda gestionar de mejor forma el trabajo

  @Registro
  Scenario: Registro en la plataforma
    Given Ingreso al url de registro de la plataforma
    When coloco la informacion de usuario necesaria para el registro "victor Rodriguez" "tr3ll0t3st@gmail.com" y "cl4v3tr3ll0" 
    Then Verifico que me registre exitosamente
    
  @Tableros
  Scenario: Creacion de tableros
    Given Ingreso a la plataforma con mis credenciales "tr3ll0t3st@gmail.com" y "cl4v3tr3ll0" 
    When Creo los tableros para llevar el control adecuado de mis proyectos
    		| Nombre tableros   |
    		| tablero ejemplo 1 |
    		| tablero ejemplo 2 |
    		| tablero ejemplo 3 |
    Then Verifico que los tableros se encuentren en mi dashboard


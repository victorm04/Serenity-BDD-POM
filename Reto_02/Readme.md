# Esta carpeta contiene el proyecto creado para el desarrollo del reto 2

Dentro del paquete utilities se inicio la construcción de una clase cuyo proposito es la lectura de un archivo con extención .xlsx para la extracción de los datos de prueba


# Limitantes

He estado presentando ciertos detalles al momento de realizar la automatización, para lo cual me mantengo investigando sobre el uso de los mestos contenidos en cada una de las clases que se importan al proyecto.

Entre las limitantes se encuentran:
1. Para el registro al finalizar el flujo se presenta un captcha que no puede ser autimatuzado.
  Solución: colocar una pausa con tiempo considerable para solventar el captcha manualmente y luego continuar con la automatización
  
2. Al momento de crear los 3 tableros, el paso de verificar la creacion exitosa, haciendo uso del label con el titulo del tablero, es algo complicado ya que dicho elemento no es facilmente mapeable, no posee un id, name o class bien definida para realizar la acción correspondiente.

3. El elemento para regresar a la pantalla de inicio y poser seguir con la iteracion de crear los 3 tableros, es encontrando por medio de la anotación FindBy pero este no reacciona al aplicar el metodo click()

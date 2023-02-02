#language:es
#Autor: Carlos Sarmiento
Característica: Registro

  Antecedentes:
    Dado que esto en la pagina de inicio de Advantage Shoping

  Esquema del escenario: Registro exitoso
    Dado que me dirijo al formulario de creacion de cuenta
    Cuando completo el formulacion de creacion de registro "<usuario>" "<correo>" "<contrasena>" "<nombre>" "<apellido>" "<numeroTelefono>" "<pais>" "<ciudad>" "<direccion>" "<estado>" "<codigoPostal>"
    Entonces valido la creacion del usuario "<usuario>"


    Ejemplos:
      | usuario    | correo  | contrasena | nombre | apellido  | numeroTelefono | pais     | ciudad        | direccion     | estado | codigoPostal |
      | testSQA | a@a.com | Abc123     | Carlos | Sarmiento |     3157819903 | Colombia | Villavicencio | Mz 60 casa 21 | Meta   |       111111 |

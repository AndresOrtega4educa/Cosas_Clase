# Diccionario inicial con los clientes
clientes = {
    "Chuletón, José": 35,
    "Tosidad, Rubén": 27,
    "Rupto, Francisco": 44,
    "Cotón, Carmelo": 56,
    "Lotas, Felipe": 76
    # Ejemplo agregado anteriormente
}

# Pedir datos del cliente
nombre = input("Introduce el nombre: ").strip().capitalize()
apellido = input("Introduce el apellido: ").strip().capitalize()

# Formatear la clave como "Apellido, Nombre"
clave = f"{apellido}, {nombre}"

# Comprobar si el cliente existe
if clave in clientes:
    clientes[clave] += 1
    print(f"Felicidades en tu {clientes[clave]} cumpleaños {nombre}. Edad actualizada en el diccionario")
else:
    print(f"{nombre} {apellido} no es cliente nuestro. Feliz cumpleaños en cualquier caso!")

# Diccionario inicial con los clientes
clientes = {
    "Chuletón, José": 35,
    "Tosidad, Rubén": 27,
    "Rupto, Francisco": 44,
    "Cotón, Carmelo": 56
}
print(clientes)
# Pedir datos del nuevo cliente
nombre = input("Introduce el nombre: ").strip().capitalize()
apellido = input("Introduce el apellido: ").strip().capitalize()

# Formatear la clave como "Apellido, Nombre"
clave = f"{apellido}, {nombre}"

# Comprobar si ya existe
if clave in clientes:
    print(f"{nombre} {apellido} ya está en el diccionario de clientes")
else:
    try:
        edad = int(input("Introduce la edad: ").strip())
        clientes[clave] = edad
        print(f"{nombre} {apellido}. {edad} años. Cliente agregado.")
    except ValueError:
        print("Edad no válida")

# Diccionario con los clientes y sus edades
clientes = {
    "Chuletón, José": 35,
    "Tosidad, Rubén": 27,
    "Rupto, Francisco": 44,
    "Cotón, Carmelo": 56
}

# Convertimos el diccionario a una lista de tuplas (apellido, nombre, edad)
lista_clientes = []
for clave, edad in clientes.items():
    apellido, nombre = clave.split(", ")
    lista_clientes.append((nombre, apellido, edad))

# Ordenar la lista por nombre de pila
lista_clientes.sort()

# Mostrar los clientes ordenados
for nombre, apellido, edad in lista_clientes:
    print(f"{nombre} {apellido} ({edad})")

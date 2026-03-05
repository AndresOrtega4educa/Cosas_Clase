def volteayelmimina(cadena, caracter):
    """
    Invierte la cadena y elimina todas las apariciones de un carácter.
    Muestra la cadena resultante y cuántos caracteres fueron eliminados.
    """
    contador = cadena.count(caracter)
    cadena_modificada = cadena.replace(caracter, "")[::-1]  # eliminar y luego invertir
    print(f"La cadena al revés y sin el carácter '{caracter}' es: {cadena_modificada}")
    print(f"He eliminado {contador} caracteres")

# Ejemplo de ejecución
volteayelmimina("Yo no moriré, no importa que mi cuerpo sea destruido por completo. Deseos de pelear me levantarán porque son muy grandes.", "o")

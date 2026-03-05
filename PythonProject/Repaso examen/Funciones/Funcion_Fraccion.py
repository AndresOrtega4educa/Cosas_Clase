def fraccion(cadena):
    """
    Convierte una cadena en formato 'numerador/denominador' a decimal.
    Devuelve 0 si la cadena no es válida.
    """
    try:
        partes = cadena.split("/")
        if len(partes) != 2:
            return 0
        numerador = int(partes[0])
        denominador = int(partes[1])
        return numerador / denominador
    except (ValueError, ZeroDivisionError):
        return 0

# Ejemplos de ejecución
print(fraccion("25/10"))  # 2.5
print(fraccion("a/10"))   # 0
print(fraccion("//10"))   # 0
print(fraccion("10"))     # 0

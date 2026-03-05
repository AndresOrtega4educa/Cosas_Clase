def es_capicua(numero):
    """
    Comprueba si un número es capicúa.
    """
    numero_str = str(numero)
    if numero_str == numero_str[::-1]:
        print(f"El número {numero} es capicúa")
    else:
        print(f"El número {numero} no es capicúa")

# Ejemplos
es_capicua(12321)
es_capicua(12345)
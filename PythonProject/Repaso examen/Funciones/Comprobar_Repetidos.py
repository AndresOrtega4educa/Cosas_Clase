def comprobar_repetidos(tupla):
    """
    Comprueba si todos los elementos de la tupla son únicos.
    Si hay elementos repetidos, muestra cuáles y cuántas veces aparecen.
    """
    from collections import Counter

    contador = Counter(tupla)  # Cuenta cuántas veces aparece cada elemento

    repetidos = {elem: count for elem, count in contador.items() if count > 1}

    if not repetidos:
        print("Todos los elementos son únicos")
    else:
        for elem, count in repetidos.items():
            print(f'El elemento "{elem}" está repetido {count} veces')

# Ejemplo de ejecución
tupla = (20, "Elefante", 7, True, "Pantera", "Elefante", False, 7, 7)
comprobar_repetidos(tupla)

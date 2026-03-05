import random

def tiradadosmultiple(n):
    """
    Lanza n dados aleatoriamente hasta que todos tengan el mismo valor.
    :param n: número de dados
    """
    intentos = 0
    while True:
        intentos += 1
        tirada = [random.randint(1, 6) for _ in range(n)]
        print(" - ".join(map(str, tirada)))
        if len(set(tirada)) == 1:  # Todos los valores son iguales
            break
    print(f"He tenido que lanzar los dados {intentos} veces para que todos sean iguales")

# Ejemplo de ejecución
tiradadosmultiple(10)

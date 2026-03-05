def primeros_primos(n):
    """
    Devuelve una tupla con los n primeros números primos, incluyendo el 1 al inicio.
    """
    primos = [1]  # Incluimos el 1 como en el ejemplo
    num = 2
    while len(primos) < n:
        es_primo = True
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                es_primo = False
                break
        if es_primo:
            primos.append(num)
        num += 1
    return tuple(primos)

# Ejemplo de ejecución
print(primeros_primos(5))  # (1, 2, 3, 5, 7)

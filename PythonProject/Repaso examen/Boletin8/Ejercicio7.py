import random


def generar_clave():
    """Genera un diccionario de cifrado aleatorio para las letras A-Z y Ñ"""
    letras = [chr(i) for i in range(65, 91)]  # A-Z
    letras.insert(14, 'Ñ')  # Insertamos la Ñ después de N
    numeros = random.sample(range(10, 100), len(letras))  # Números aleatorios sin repetir
    clave = {letra: str(numero) for letra, numero in zip(letras, numeros)}
    return clave


def cifrar_mensaje(mensaje, clave):
    """Cifra el mensaje usando la clave y separa en bloques de 3 cifras"""
    mensaje = mensaje.replace(" ", "").upper()  # Eliminar espacios y pasar a mayúsculas
    cifrado = ""

    for letra in mensaje:
        cifrado += clave[letra]  # Sustituir letra por número de la clave

    # Separar en bloques de 3 cifras y rellenar con números aleatorios si falta
    while len(cifrado) % 3 != 0:
        cifrado += str(random.randint(10, 99))  # Rellenar con números aleatorios de dos cifras

    bloques = [cifrado[i:i + 3] for i in range(0, len(cifrado), 3)]
    mensaje_final = " ".join(bloques)

    return mensaje_final


# --- Programa principal ---
mensaje = input("Introduce el mensaje a cifrar: ")

clave = generar_clave()
print("\nClave de cifrado:")
for letra, numero in sorted(clave.items()):
    print(f"{letra}: {numero}", end="  ")
print("\n")

mensaje_cifrado = cifrar_mensaje(mensaje, clave)
print("Mensaje cifrado:")
print(mensaje_cifrado)

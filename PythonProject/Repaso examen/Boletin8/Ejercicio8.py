import random

# --- Generar clave de cifrado ---
letras = [chr(i) for i in range(65, 91)]  # A-Z
letras.insert(14, 'Ñ')  # Insertamos Ñ después de N
numeros = random.sample(range(10, 100), len(letras))  # Números aleatorios sin repetir
clave = {letra: str(numero) for letra, numero in zip(letras, numeros)}

# Mostrar clave de cifrado
print("Clave de cifrado:")
for letra, numero in sorted(clave.items()):
    print(f"{letra}: {numero}", end="  ")
print("\n")

# --- Cifrar mensaje ---
mensaje = input("Introduce el mensaje a cifrar: ")
mensaje = mensaje.replace(" ", "").upper()

cifrado = ""
for letra in mensaje:
    cifrado += clave[letra]

# Rellenar con números aleatorios hasta que la longitud sea divisible entre 3
while len(cifrado) % 3 != 0:
    cifrado += str(random.randint(10, 99))

# Separar en bloques de 3 cifras
bloques = [cifrado[i:i+3] for i in range(0, len(cifrado), 3)]
mensaje_cifrado = " ".join(bloques)
print("Mensaje cifrado:")
print(mensaje_cifrado)

# --- Descifrar mensaje ---
# Invertir la clave
clave_invertida = {v: k for k, v in clave.items()}

# Eliminar espacios del mensaje cifrado
mensaje_cifrado_sin_espacios = mensaje_cifrado.replace(" ", "")
descifrado = ""
i = 0
while i < len(mensaje_cifrado_sin_espacios) - 1:  # Evitar que quede cifra suelta al final
    bloque = mensaje_cifrado_sin_espacios[i:i+2]  # Cada letra son 2 cifras
    if bloque in clave_invertida:
        descifrado += clave_invertida[bloque]
        i += 2
    else:
        # Intentar con 3 cifras (relleno aleatorio)
        bloque3 = mensaje_cifrado_sin_espacios[i:i+3]
        descifrado += bloque3
        i += 3

print("Mensaje descifrado:")
print(descifrado)

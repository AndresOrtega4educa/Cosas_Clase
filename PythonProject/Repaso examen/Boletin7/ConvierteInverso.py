tupla = (7, 5, 3, 1, 2)
print("tupla =",tupla)
numero_str = ""
for elemento in tupla[::-1]:  # recorremos la tupla al revés
    numero_str += str(elemento)

numero = int(numero_str)

print("numero (ordenado de forma inversa) =",numero)

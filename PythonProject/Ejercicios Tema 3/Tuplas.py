# Boletín 7
not
# Ejercicio 2

tupla1 = (1,4,2,5,49,3,75,3)
tupla2 = (3,3,75,75,180,9,5)
listaAux = []

for i in tupla1:
    if i not in tupla2 and i not in listaAux:
        listaAux.append(i)
for i in tupla2:
    if i not in tupla1 and i not in listaAux:
        listaAux.append(i)

listaAux.sort(reverse=True)

listaAux = tuple(listaAux)
print(listaAux)

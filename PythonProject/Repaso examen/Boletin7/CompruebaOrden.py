tupla = (7,5,3,2,1)
print(tupla)
ordenada = True

for i in range(len(tupla)-1):
    if tupla[i] < tupla[i+1]:   # si uno es menor que el siguiente → desorden
        ordenada = False
        break

if ordenada:
    print("La tupla está ordenada de mayor a menor")
else:
    print("La tupla está desordenada")


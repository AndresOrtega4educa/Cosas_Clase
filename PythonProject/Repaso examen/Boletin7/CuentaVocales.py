palabra = input("Dame una palabra y te digo cuantas veces se repiten sus vocales: ").lower()

contador_a = 0
contador_e = 0
contador_i = 0
contador_o = 0
contador_u = 0

for i in palabra:
    if i =="a":
        contador_a = contador_a + 1
    if i =="e":
        contador_e = contador_e+1
    if i =="i":
        contador_i = contador_i+1
    if i =="o":
        contador_o = contador_o+1
    if i =="u":
        contador_u = contador_u+1

print("La a se repite:", contador_a, "veces")
print("La e se repite:", contador_e, "veces")
print("La i se repite:", contador_i, "veces")
print("La o se repite:", contador_o, "veces")
print("La u se repite:", contador_u, "veces")


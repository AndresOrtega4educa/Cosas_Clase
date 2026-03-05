palabra = input("Dame una palabra: ").lower()

contador_a = palabra.count("a") + palabra.count("á")
contador_e = palabra.count("e") + palabra.count("é")
contador_i = palabra.count("i") + palabra.count("í")
contador_o = palabra.count("o") + palabra.count("ó")
contador_u = palabra.count("u") + palabra.count("ú")

print("La a (a+á) se repite:", contador_a, "veces")
print("La e (e+é) se repite:", contador_e, "veces")
print("La i (i+í) se repite:", contador_i, "veces")
print("La o (o+ó) se repite:", contador_o, "veces")
print("La u (u+ú) se repite:", contador_u, "veces")

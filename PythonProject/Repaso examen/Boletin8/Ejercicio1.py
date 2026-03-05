# Diccionario con los precios de las frutas
precios_frutas = {
    "Aguacate": 4.35,
    "Mandarina": 2.60,
    "Kiwi": 3.75,
    "Naranja": 1.80
}

while True:
    fruta = input("¿Qué fruta quieres comprar? ").capitalize()

    if fruta not in precios_frutas:
        print("Lo siento mucho pero no vendemos esa fruta")
        continue  # vuelve a preguntar la fruta

    try:
        kilos = float(input("¿Cuántos kilos quieres? "))
        precio_total = precios_frutas[fruta] * kilos
        print(f"{kilos:.2f} de {fruta} cuestan {precio_total:.2f} €")
        break  # salir del bucle después de calcular el precio
    except ValueError:
        print("No has introducido bien la cantidad que quieres")


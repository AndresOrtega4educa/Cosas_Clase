# Diccionario para almacenar las facturas: clave = número de factura, valor = coste
facturas = {}

# Variables para controlar el dinero recaudado y pendiente
recaudado = 0.0

while True:
    pendiente = sum(facturas.values())

    # Mostrar cantidades
    print(f"Recaudado: {recaudado:.2f}")
    print(f"Pendiente de cobro: {pendiente:.2f}")

    # Preguntar acción
    opcion = input("¿Quieres añadir una nueva factura (A), pagarla (P) o terminar (T)? ").strip().upper()
    print()  # Línea en blanco

    if opcion == "A":
        try:
            numero = int(input("Introduce el número de la factura: ").strip())
            if numero in facturas:
                print("Ya existe esa factura")
                print()
                continue

            coste = float(input("Introduce el coste de la factura: ").strip())
            facturas[numero] = coste
            print()
        except ValueError:
            print("Número de factura o coste inválido\n")

    elif opcion == "P":
        try:
            numero = int(input("Introduce el número de la factura a pagar: ").strip())
            if numero in facturas:
                coste = facturas.pop(numero)
                recaudado += coste
                print("Factura pagada\n")
            else:
                print("No existe esa factura\n")
        except ValueError:
            print("Número de factura inválido\n")

    elif opcion == "T":
        print("Fin del programa")
        break
    else:
        print("Opción no válida\n")

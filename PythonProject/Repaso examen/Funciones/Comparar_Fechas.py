from datetime import datetime

def comparar_fechas(fecha1, fecha2):
    """
    Comprueba si dos fechas en formato DD/MM/YYYY son válidas
    y cuál es más antigua.
    """
    formato = "%d/%m/%Y"
    try:
        f1 = datetime.strptime(fecha1, formato)
        f2 = datetime.strptime(fecha2, formato)
    except ValueError:
        print("Alguna de las fechas no es válida")
        return

    if f1 < f2:
        print(f"La fecha más antigua es: {fecha1}")
    elif f2 < f1:
        print(f"La fecha más antigua es: {fecha2}")
    else:
        print("Ambas fechas son iguales")

# Ejemplo de ejecución
comparar_fechas("29/02/2020", "01/03/2020")  # Año bisiesto
comparar_fechas("31/04/2023", "01/05/2023")  # Fecha inválida (abril tiene 30 días)


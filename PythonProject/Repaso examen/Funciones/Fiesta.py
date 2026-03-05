def profesionales_fiesta(asistentes):
    """
    Recibe una tupla con los asistentes en orden de llegada y muestra
    quiénes son los profesionales de la fiesta.
    """
    total = len(asistentes)
    mitad = total // 2  # Número de personas que deben haber llegado para que cuente
    profesionales = []

    # Los que llegan desde la mitad hasta los dos últimos
    for i in range(mitad, total - 2):
        profesionales.append(asistentes[i])

    if profesionales:
        print("Los profesionales de la fiesta son:", ", ".join(profesionales))
    else:
        print("No hay profesionales de la fiesta")

# Ejemplo de ejecución
asistentes = ('Jorge', 'Alba', 'Nadia', 'Héctor', 'Óscar', 'Ricardo', 'Kevin')
profesionales_fiesta(asistentes)

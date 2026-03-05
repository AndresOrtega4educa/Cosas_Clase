notas_alumno = {
    "Redes": 5.35,
    "Python": 5.15,
    "Marcas": 6.30,
    "FOL": 8.80,
    "Sistemas": 6.25,
    "Bases de Datos": 7.00
}


modulos_recuperar = []


suma_notas = 0
total_modulos = len(notas_alumno)


for modulo, nota in notas_alumno.items():
    suma_notas += nota
    if nota < 5.0:
        modulos_recuperar.append((modulo, nota))


if modulos_recuperar:
    print("El alumno tiene que recuperar los siguientes módulos:")
    for modulo, nota in modulos_recuperar:
        print(f"{modulo} con un {nota:.2f}")
else:
    print("El alumno no tiene que recuperar ningún módulo")


nota_media = suma_notas / total_modulos
print(f"La nota media obtenida es de {nota_media:.2f}")

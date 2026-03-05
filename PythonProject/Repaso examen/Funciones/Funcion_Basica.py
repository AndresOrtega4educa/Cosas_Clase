def pvp(precio, iva):
    """
    Calcula el precio de venta al público (PVP) aplicando el IVA.
    :param precio: Precio base del producto
    :param iva: IVA en porcentaje (ej. 21 para 21%)
    :return: PVP con dos decimales
    """
    precio_final = precio * (1 + iva / 100)
    return round(precio_final, 2)

# Ejemplos de ejecución
print(pvp(14, 0))      # 14
print(pvp(34.4, 21))   # 41.62

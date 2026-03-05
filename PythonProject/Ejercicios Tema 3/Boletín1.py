import random
from os import MFD_ALLOW_SEALING


def ejercicio1():
    for i in range(10):
        print(i, end=', ')
    print(10)

def ejercicio7():
    print('Solución ejercicio 7')
    num = int(input('Introduce el precio: '))
    print(num * 1.21)
def ejercicio12() -> None:
    print('Solución ejercicio 12')
    for i in range(6):
        print(random.randint(1, 49))

def ejercicio16():
    print('Solución ejercicio 16')
    primo = False

    while not primo:
       num = random.randint(1, 10)
       for i in range(2, num):
           if num % i != 0:
                primo = False
    print(num)





if __name__ == '__main__':
    #ejercicio1()
    #ejercicio7()
    #ejercicio12()
    ejercicio16()
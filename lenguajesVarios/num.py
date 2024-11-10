import random
import time

# Generar lista de números aleatorios
lista = [random.randint(100, 7000) for _ in range(1000)]
print(lista)
# Medir tiempo de ejecución para ordenamiento (usando el algoritmo de ordenamiento por inserción)
inicio = time.time()
sorted_lista = sorted(lista)
fin = time.time()

tiempo_ejection = (fin - inicio) * 1000  # Convertir a milisegundos
print("Tiempo de ejecución en milisegundos:", tiempo_ejection)

'''
import random
import time

# Función para verificar si una lista está ordenada
def esta_ordenada(lista):
    return all(lista[i] <= lista[i + 1] for i in range(len(lista) - 1))

# Función para realizar Bogosort
def bogosort(lista):
    while not esta_ordenada(lista):
        random.shuffle(lista)
    return lista

# Generar lista de números aleatorios
lista = [random.randint(100, 7000) for _ in range(1000)]

# Medir tiempo de ejecución para Bogosort
inicio = time.time()
lista_ordenada = bogosort(lista)
fin = time.time()

tiempo_ejecucion = (fin - inicio) * 1000  # Convertir a milisegundos
print("Tiempo de ejecución en milisegundos:", tiempo_ejecucion)
'''

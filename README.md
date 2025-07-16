Evaluación de alumno (único if)
nota1 = float(input("Ingrese la primera nota: "))
nota2 = float(input("Ingrese la segunda nota: "))
nota3 = float(input("Ingrese la tercera nota: "))

promedio = (nota1 + nota2 + nota3) / 3

if promedio >= 7:
    print("Aprobado")
else:
    print("Reprobado")
2- Par o impar
numero = int(input("Ingrese un número: "))
if numero % 2 == 0:
    print("Es par")
else:
    print("Es impar")
3- Dias del mes
mes = input("Ingrese el nombre del mes: ").lower()

if mes in ["abril", "junio", "septiembre", "noviembre"]:
    print(f"{mes.capitalize()} tiene 30 días")
elif mes == "febrero":
    print("Febrero tiene 28 días")
else:
    print(f"{mes.capitalize()} tiene 31 días")
  4. Categorías (a, b, c)
categoria = input("Ingrese la categoría (a, b, c): ").lower()
if categoria == 'a':
    print("hijo")
elif categoria == 'b':
    print("padres")
elif categoria == 'c':
    print("abuelos")
else:
    print("Categoría no válida")
  5. Puesto en torneo
puesto = int(input("Ingrese el puesto: "))

if puesto == 1:
    print("Medalla de oro")
elif puesto == 2:
    print("Medalla de plata")
elif puesto == 3:
    print("Medalla de bronce")
else:
    print("Siga participando")
  6. Curso (if anidados)
curso = int(input("Ingrese el número de curso: "))

if curso == 0:
    print("Jardín de infantes")
elif 1 <= curso <= 6:
    print("Primaria")
elif 7 <= curso <= 12:
    print("Secundaria")
else:
    print("Curso no reconocido")
  7. Mayor de tres números
a = int(input("Ingrese el primer número: "))
b = int(input("Ingrese el segundo número: "))
c = int(input("Ingrese el tercer número: "))

if a >= b and a >= c:
    print(f"El mayor es: {a}")
elif b >= a and b >= c:
    print(f"El mayor es: {b}")
else:
    print(f"El mayor es: {c}")
  8. Piedra, papel o tijera
jugador1 = int(input("Jugador 1 (0=piedra, 1=papel, 2=tijera): "))
jugador2 = int(input("Jugador 2 (0=piedra, 1=papel, 2=tijera): "))

if jugador1 == jugador2:
    print("Empate")
elif (jugador1 == 0 and jugador2 == 2) or (jugador1 == 1 and jugador2 == 0) or (jugador1 == 2 and jugador2 == 1):
    print("Gana el Jugador 1")
else:
    print("Gana el Jugador 2")
9-IF con and y or
j1 = int(input("Jugador 1 (0=piedra, 1=papel, 2=tijera): "))
j2 = int(input("Jugador 2 (0=piedra, 1=papel, 2=tijera): "))

if j1 == j2:
    print("Empate")
elif (j1 == 0 and j2 == 2) or (j1 == 1 and j2 == 0) or (j1 == 2 and j2 == 1):
    print("Gana el Jugador 1")
else:
    print("Gana el Jugador 2")
10. Mayor de tres números con and
a = int(input("Primer número: "))
b = int(input("Segundo número: "))
c = int(input("Tercer número: "))

if a >= b and a >= c:
    print(f"El mayor es: {a}")
elif b >= a and b >= c:
    print(f"El mayor es: {b}")
else:
    print(f"El mayor es: {c}")
11. Vocal usando or
caracter = input("Ingrese un carácter: ").lower()

if caracter == 'a' or caracter == 'e' or caracter == 'i' or caracter == 'o' or caracter == 'u':
    print("Es una vocal")
else:
    print("No es una vocal")
12. Docena con and y or
numero = int(input("Ingrese un número entre 1 y 36: "))

if numero >= 1 and numero <= 12:
    print("Pertenece a la primera docena")
elif numero >= 13 and numero <= 24:
    print("Pertenece a la segunda docena")
elif numero >= 25 and numero <= 36:
    print("Pertenece a la tercera docena")
else:
    print(f"El número {numero} está fuera de rango")
También podría escribirse con or para detectar fuera de rango
if numero < 1 or numero > 36:
    print(f"El número {numero} está fuera de rango")
SWITCH
13- dias del mes
mes = input("Ingrese el nombre del mes: ").lower()

match mes:
    case "abril" | "junio" | "septiembre" | "noviembre":
        print(f"{mes.capitalize()} tiene 30 días")
    case "febrero":
        print("Febrero tiene 28 días")
    case "enero" | "marzo" | "mayo" | "julio" | "agosto" | "octubre" | "diciembre":
        print(f"{mes.capitalize()} tiene 31 días")
    case _:
        print("Mes inválido")
  14-Puesto en torneo con match
puesto = int(input("Ingrese el puesto: "))

match puesto:
    case 1:
        print("Medalla de oro")
    case 2:
        print("Medalla de plata")
    case 3:
        print("Medalla de bronce")
    case _:
        print("Siga participando")
 15. Clase de auto con match
clase = input("Ingrese clase de auto (a, b, c): ").lower()

match clase:
    case 'a':
        print("4 ruedas y un motor")
    case 'b':
        print("4 ruedas, un motor, cierre centralizado y aire")
    case 'c':
        print("4 ruedas, un motor, cierre centralizado, aire y airbag")
    case _:
        print("Clase no reconocida")
Ciclos
16. Tabla de multiplicar
num = int(input("Ingrese un número: "))
for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")
    num = int(input("Ingrese un número: "))
for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")
    17. Suma de pares hasta N notas
    A-
suma = 0
for i in range(1, 11):
    if i % 2 == 0:
        suma += i
print(f"Suma de pares: {suma}")
B-
suma = 0
for i in range(2, 11, 2):  # Solo pares
    suma += i
print(f"Suma de pares: {suma}")
18. Todas las tablas (1 al 10)
for i in range(1, 11):
    print(f"\nTabla del {i}:")
    for j in range(1, 11):
        print(f"{i} x {j} = {i*j}")
19-while con 10 números aleatorios, suma y promedio
import random

suma = 0
contador = 0

while contador < 10:
    numero = random.randint(1, 100)
    print(f"Número {contador + 1}: {numero}")
    suma += numero
    contador += 1

print(f"Suma: {suma}")
print(f"Promedio: {suma / 10}")
do while (simulado en Python)
20. do while (simulado en Python)

import random

contador = 0
maximo = float('-inf')
minimo = float('inf')

while True:
    numero = random.randint(1, 100)
    print(f"Número {contador + 1}: {numero}")
    
    if numero > maximo:
        maximo = numero
    if numero < minimo:
        minimo = numero

    contador += 1
    if contador >= 10:
        break

print(f"Máximo: {maximo}")
print(f"Mínimo: {minimo}")
21- Cálculo de sueldo neto
categoria = input("Ingrese la categoría del empleado (A, B, C): ").upper()
antiguedad = int(input("Ingrese la antigüedad en años: "))
sueldo_bruto = float(input("Ingrese el sueldo bruto: "))

# Plus por categoría
if categoria == "A":
    plus = 1000
elif categoria == "B":
    plus = 2000
elif categoria == "C":
    plus = 3000
else:
    plus = 0
    print("Categoría no válida. El plus será 0.")

# Aumento por antigüedad
if 1 <= antiguedad <= 5:
    aumento = sueldo_bruto * 0.05
elif 6 <= antiguedad <= 10:
    aumento = sueldo_bruto * 0.10
elif antiguedad > 10:
    aumento = sueldo_bruto * 0.30
else:
    aumento = 0

sueldo_neto = sueldo_bruto + aumento + plus

print(f"Sueldo neto: ${sueldo_neto:.2f}")
22-Simular 10 empleados con while y random
import random

contador = 0

while contador < 10:
    # Categoría aleatoria (A, B, C)
    categoria = random.choice(['A', 'B', 'C'])

    # Antigüedad aleatoria entre 0 y 20
    antiguedad = random.randint(0, 20)

    # Sueldo base aleatorio entre 50.000 y 150.000
    sueldo_bruto = random.randint(50000, 150000)

    # Validación de datos
    if categoria in ['A', 'B', 'C'] and sueldo_bruto > 0:
        # Determinar el plus
        if categoria == 'A':
            plus = 1000
        elif categoria == 'B':
            plus = 2000
        elif categoria == 'C':
            plus = 3000

        # Aumento por antigüedad
        if 1 <= antiguedad <= 5:
            aumento = sueldo_bruto * 0.05
        elif 6 <= antiguedad <= 10:
            aumento = sueldo_bruto * 0.10
        elif antiguedad > 10:
            aumento = sueldo_bruto * 0.30
        else:
            aumento = 0

        sueldo_neto = sueldo_bruto + aumento + plus

        print(f"\nEmpleado #{contador + 1}")
        print(f"Categoría: {categoria}")
        print(f"Antigüedad: {antiguedad} años")
        print(f"Sueldo bruto: ${sueldo_bruto}")
        print(f"Aumento: ${aumento:.2f}")
        print(f"Plus categoría: ${plus}")
        print(f"SUELDO NETO: ${sueldo_neto:.2f}")

        contador += 1  # Solo se incrementa si los datos son válidos


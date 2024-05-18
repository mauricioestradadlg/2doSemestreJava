
#Reto Final

#Juego del Señor de los Anillos

'''
Modos de Juego:

PvP entre personajes: Tipo Mortal Kombat

Survival: Enfretanmiento con Orcos (Tipo COD Zombies)


'''


import random
import time

class Heroe:
    def __init__(self, nombre, salud, ataque, defensa):
        self.nombre = nombre
        self.salud = salud
        self.ataque = ataque
        self.defensa = defensa

    def recibir_ataque(self, danio):
        self.salud -= danio
        print(f"{self.nombre} ha recibido {danio} puntos de daño. \nVida restante: {self.salud}")    

class Arquero(Heroe):
    def __init__(self, nombre, salud=100, ataque=20, defensa=10):
        super().__init__(nombre, salud, ataque, defensa)

class Mago(Heroe):
    def __init__(self, nombre, salud=100, ataque=25, defensa=5):
        super().__init__(nombre, salud, ataque, defensa)

class Guerrero(Heroe):
    def __init__(self, nombre, salud=100, ataque=30, defensa=15):
        super().__init__(nombre, salud, ataque, defensa)


def line():
    print("_____________________________")

def space():
    print("\n \n")    



def charactersPVP():
    print("Selecciona dos personajes para la pelea:")
    print("1. Gandalf")
    print("2. Saruman")
    print("3. Legolas")
    print("4. Tauriel")
    print("5. Gimli")
    print("6. Aragorn")

    personajes_elegidos = []
    while len(personajes_elegidos) < 2:
        opcion = int(input(f"Elige el personaje {len(personajes_elegidos) + 1}: "))

        if opcion == 1:
            personajes_elegidos.append(Mago("Gandalf"))
        elif opcion == 2:
            personajes_elegidos.append(Mago("Saruman"))
        elif opcion == 3:
            personajes_elegidos.append(Arquero("Legolas"))
        elif opcion == 4:
            personajes_elegidos.append(Arquero("Tauriel"))
        elif opcion == 5:
            personajes_elegidos.append(Guerrero("Gimli"))
        elif opcion == 6:
            personajes_elegidos.append(Guerrero("Aragorn"))            
        else:
            print("Selecciona una opción válida.")

    return personajes_elegidos


    print(f"¡Prepárate para la batalla contra los orcos!")
    for danio_orco in orcos:
        input("Presiona Enter para enfrentar al siguiente orco...")
        jugador.recibir_ataque(danio_orco)
        if jugador.salud <= 0:
            print("¡El jugador ha sido derrotado!")
            return False
        time.sleep(1)  # Breve pausa entre ataques de orcos
    return True


    print("Selecciona dos personajes para la pelea:")
    print("1. Gandalf")
    print("2. Saruman")
    print("3. Legolas")
    print("4. Tauriel")
    print("5. Gimli")
    print("6. Aragorn")

    personajes_elegidos = []
    while len(personajes_elegidos) < 1:
        opcion = int(input(f"Elige el personaje {len(personajes_elegidos) + 1}: "))

        if opcion == 1:
            personajes_elegidos.append(Mago("Gandalf"))
        elif opcion == 2:
            personajes_elegidos.append(Mago("Saruman"))
        elif opcion == 3:
            personajes_elegidos.append(Arquero("Legolas"))
        elif opcion == 4:
            personajes_elegidos.append(Arquero("Tauriel"))
        elif opcion == 5:
            personajes_elegidos.append(Guerrero("Gimli"))
        elif opcion == 6:
            personajes_elegidos.append(Guerrero("Aragorn"))            
        else:
            print("Selecciona una opción válida.")

    return personajes_elegidos

def modePVP():
    print("¡Que comience la pelea!")
    jugadores = charactersPVP()

    space()

    jugador1, jugador2 = jugadores[0], jugadores[1]
    while jugador1.salud > 0 and jugador2.salud > 0:
        input("Presiona Enter para que el Jugador 1 ataque...")
        danio_jugador1 = max(0, jugador1.ataque - jugador2.defensa)
        jugador2.salud -= danio_jugador1
        print(f"{jugador1.nombre} ataca a {jugador2.nombre} y hace {danio_jugador1} puntos de daño.")
        print(f"Vida de {jugador2.nombre}: {jugador2.salud}")

        if jugador2.salud <= 0:
            print(f"{jugador1.nombre} ha ganado la pelea.")
            break

        input("Presiona Enter para que el Jugador 2 ataque...")
        danio_jugador2 = max(0, jugador2.ataque - jugador1.defensa)
        jugador1.salud -= danio_jugador2
        print(f"{jugador2.nombre} ataca a {jugador1.nombre} y hace {danio_jugador2} puntos de daño.")
        print(f"Vida de {jugador1.nombre}: {jugador1.salud}")

    if jugador1.salud <= 0:
        print(f"{jugador2.nombre} ha ganado la pelea.")

    space()
    print("Quieres jugar otra vez?")
    print("-Presiona 1 para continuar \n-Presiona 2 para salir al Menu")    
    gameOption = int(input("Elige una opcion: "))

    if gameOption == 1:
        modePVP()
    elif  gameOption == 2:
        gameModes()    


    print("Preparate para la Mision! ")

def charactersOrcos():
    print("Selecciona dos personajes para la pelea:")
    print("1. Gandalf")
    print("2. Saruman")
    print("3. Legolas")
    print("4. Tauriel")
    print("5. Gimli")
    print("6. Aragorn")

    personajes_elegidos = []
    while len(personajes_elegidos) < 1:
        opcion = int(input(f"Elige el personaje {len(personajes_elegidos) + 1}: "))

        if opcion == 1:
            personajes_elegidos.append(Mago("Gandalf"))
        elif opcion == 2:
            personajes_elegidos.append(Mago("Saruman"))
        elif opcion == 3:
            personajes_elegidos.append(Arquero("Legolas"))
        elif opcion == 4:
            personajes_elegidos.append(Arquero("Tauriel"))
        elif opcion == 5:
            personajes_elegidos.append(Guerrero("Gimli"))
        elif opcion == 6:
            personajes_elegidos.append(Guerrero("Aragorn"))            
        else:
            print("Selecciona una opción válida.")

    return personajes_elegidos

def generar_orcos(cantidad):
    orcos = []
    for i in range(cantidad):
        danio_orco = random.randint(5, 15)
        orcos.append(danio_orco)
    return orcos

def enfrentar_orcos(jugador, orcos):
    print(f"¡Prepárate para la batalla contra los orcos!")
    for danio_orco in orcos:
        input("Presiona Enter para enfrentar al siguiente orco...")
        jugador.recibir_ataque(danio_orco)
        if jugador.salud <= 0:
            print("¡El jugador ha sido derrotado!")
            return False
        time.sleep(1)  # Breve pausa entre ataques de orcos
    return True

def juego_orcos():

    print("¡Preparate para la mision!")
    player = charactersOrcos()

    space()

    jugador = player[0]
   

    ronda = 1
    while jugador.salud > 0:
        print(f"\n--- Ronda {ronda} ---")
        cantidad_orcos = random.randint(1, 5)  # Número aleatorio de orcos por ronda
        orcos = generar_orcos(cantidad_orcos)
        resultado = enfrentar_orcos(jugador, orcos)
        if not resultado:
            break
        ronda += 1
        time.sleep(2)  # Pausa entre rondas

    space()
    print("Quieres jugar otra vez?")
    print("-Presiona 1 para continuar \n-Presiona 2 para salir al Menu")    
    gameOption = int(input("Elige una opcion: "))

    if gameOption == 1:
        juego_orcos()
    elif  gameOption == 2:
        gameModes()     

#Modos de Juego
def gameModes():

    global gameOn
    space()
    print("Selecciona un modo de juego: ")
    space()
    print("-PVP (Presiona 1) \n-Survival (Presiona 2) \n-Regresar al menu principal (Presiona 3)")
    space()
    mode = int(input("Elige una opcion: "))

    if mode == 1:
        space()
        print("Bienvenido a PVP")
        space()
        modePVP()

        
    elif mode == 2:
        space()
        print("Bienvenido a Survival!")
        space()
        juego_orcos()
        

    elif mode == 3:
        mainMenu()   



# Menu Principal del Juego
def  mainMenu():

    global gameOn

    
    line()
    space()
    print("El Señor de los Anillos (GOTY)")
    space()
    print("Presiona 1 para comenzar")
    print("Presiona 2 para salir ")
    space()

    start = int(input("Selecciona una opcion: "))
      
    if start == 1:
        space()
        gameModes()

    elif start == 2:
        gameOn = False    


#Codigo MAIN

gameOn = True

while(gameOn):
    mainMenu()

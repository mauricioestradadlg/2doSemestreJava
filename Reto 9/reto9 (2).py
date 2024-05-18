

#RETO 9



#Declarando la variable del ciclo como Booleano

cycle = True 

#Funcion para hacer espacio entre los parrafos del programa
def space():
    print("\n \n")
    
#Funcion para continuar el Ciclo mientras sea True
def continuar():
    
    '''
La variable cycle se define como global para indicarle al programa
que es una variable que forma parte del Main y no de la funcion
unicamente
'''
    global cycle 
    print("Quieres hacer otro calculo? \n\n-Presiona 1 para Continuar \n-Presiona 2 para Salir")
    ciclo = int(input ("Elige una opcion: "))
    if ciclo == 1:
        space()
    elif ciclo == 2:
        
        cycle = False
    
#Funcion para imprimir lineas en el programa y poder identificar mas facil cada iteracion del ciclo        
def line():
    print("_____________________________________________________")
   
#Funcion para calcular impuestos con dato de entrada y condicionales    
def tax():
    
    
    impuesto = float
    
    salary = float(input("\nIngresa tu salario Anual: "))
    
    if salary == 10000:
        space()
        print("No necesitas pagar Impuestos :) ")
        
    elif salary <= 50000:
        impuesto = salary * 0.1
        space()
        print("Debes pagar: $",impuesto, " de impuestos")
    
    elif salary <= 100000:
        impuesto = salary * 0.2
        space()
        print("Debes pagar: $",impuesto, " de impuestos")
        
    elif salary > 100000:
        impuesto = salary * 0.3
        space()
        print("Debes pagar: $", impuesto, " de impuestos")
        
      
#MAIN DEL PROGRAMA        
while(cycle):
    
    line()
    print("CALCULADORA DE IMPUESTOS \n \nReto 9 - POO")
    
    salario = tax() 
    space()
    continuar()     
    
        

   
  
    
    
    

    


   
    


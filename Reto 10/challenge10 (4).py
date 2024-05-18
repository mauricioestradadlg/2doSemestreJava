
#Clase Banco
class Banco:

    #Constructor con parametros
    def __init__(self, bank):
        self.bank = bank
        self.money = 0

    #Metodo de la clase
    def info(self):
        print(f"Saldo total de {self.bank}: ${self.money} MXN")

#Clase Cuenta
class Cuenta:

    #Constructor con parametros
    def __init__(self, titular, saldoInicial, tipoCuenta):
        self.titular = titular

        #Condicionales del Constructor
        if saldoInicial < 0:
            raise ValueError("El saldo de la cuenta no puede ser negativo")
        else:
            self.saldoCuenta = saldoInicial
            self.tipoCuenta = tipoCuenta

    #Metodo para depositar
    def depositar(self, cantidad):
        if cantidad > 0:
            self.saldoCuenta += cantidad
            print(f"Se han depositado ${cantidad} MXN a {self.titular}.")
        else:
            print("La cantidad a depositar debe ser mayor que cero.")

    #Metodo para retirar
    def retirar(self, cantidad):
        if cantidad > self.saldoCuenta:
            print("No hay suficientes fondos para hacer el retiro.")
        elif cantidad <= 0:
            print("La cantidad a retirar debe ser mayor que cero.")
        else:
            self.saldoCuenta -= cantidad
            print(f"Se han retirado ${cantidad} MXN en la cuenta de {self.titular}.")

#Clase Cliente
class Cliente:

    #Constructor con parametros
    def __init__(self, client):
        self.client = client
        self.cuentas = [] #Lista de cuentas
 
    #Metodo para agregar cuentas
    def agregarCuenta(self, cuenta):
        self.cuentas.append(cuenta)

    #Metodo para imprimir las cuentas como Dato de Salida
    def mostrarCuentas(self):
        
        print("Cuentas:")
        space()
        for index, cuenta in enumerate(self.cuentas, start=1):
            print(f"Cuenta {index}: \nTitular - {cuenta.titular} \nSaldo - ${cuenta.saldoCuenta} MXN \nTipo - {cuenta.tipoCuenta}")
            line()


#Funcion de espacio
def space():
    print("\n \n")

#Funcion de linea
def line():
    print("____________________________________")



# Objeto de Banco
bbva = Banco("BBVA Bancomer")

# Objetos de la clase Cuenta
cuenta1 = Cuenta("Mauricio Estrada", 7500, "Nomina")
cuenta2 = Cuenta("Eugenio Estrada", 300000, "Inversion")
cuenta3 = Cuenta("Beatriz De la Garza", 15000, "Ahorro")

# Objetos de clase Cliente y agregar a la lista de Cuenta

cliente = Cliente("Mauricio Estrada")
cliente.agregarCuenta(cuenta1)
cliente.agregarCuenta(cuenta2)
cliente.agregarCuenta(cuenta3)

# Realizar depósitos y retiros en las cuentas del cliente

space()

cliente.cuentas[0].depositar(2000)
cliente.cuentas[1].retirar(3000)

# Mostrar saldo actual de cada cuenta de los clientes

space()

cliente.mostrarCuentas()

space()

# Mostrar el saldo total del banco después de todas las transacciones

bbva.money = sum(cuenta.saldoCuenta for cuenta in cliente.cuentas)

space()

bbva.info()

space()


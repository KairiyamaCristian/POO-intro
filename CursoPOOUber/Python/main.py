from unicodedata import name


from car import Car

def run():
    print('Hola mundo')
    car = Car()
    car.license = 'ASM123'
    car.driver = 'Andres Herrera'
    print(vars(car))


if __name__ == '__main__':
    run()
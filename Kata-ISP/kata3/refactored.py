from abc import ABC, abstractmethod

class Drivable(ABC):
    @abstractmethod
    def drive(self):
        pass

class Flyable(ABC):
    @abstractmethod
    def fly(self):
        pass

class Sailable(ABC):
    @abstractmethod
    def sail(self):
        pass

class Car(Drivable):
    def drive(self):
        print("Car is driving")

class Plane(Drivable, Flyable):
    def drive(self):
        print("Plane is taxiing")

    def fly(self):
        print("Plane is flying")

class Boat(Sailable):
    def sail(self):
        print("Boat is sailing")

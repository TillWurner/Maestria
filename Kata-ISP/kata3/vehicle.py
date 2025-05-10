from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def drive(self):
        pass

    @abstractmethod
    def fly(self):
        pass

    @abstractmethod
    def sail(self):
        pass

class Car(Vehicle):
    def drive(self):
        print("Car is driving")

    def fly(self):
        raise NotImplementedError("Car can't fly")

    def sail(self):
        raise NotImplementedError("Car can't sail")

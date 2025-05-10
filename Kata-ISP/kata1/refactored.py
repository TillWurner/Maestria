from abc import ABC, abstractmethod

class Flyable(ABC):
    @abstractmethod
    def fly(self):
        pass

class Swimmable(ABC):
    @abstractmethod
    def swim(self):
        pass

class Runnable(ABC):
    @abstractmethod
    def run(self):
        pass

class Bird(Flyable, Runnable):
    def fly(self):
        print("Bird is flying")

    def run(self):
        print("Bird is running")

class Fish(Swimmable):
    def swim(self):
        print("Fish is swimming")

class Dog(Runnable, Swimmable):
    def run(self):
        print("Dog is running")

    def swim(self):
        print("Dog is swimming")

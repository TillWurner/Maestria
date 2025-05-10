from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def fly(self):
        pass

    @abstractmethod
    def swim(self):
        pass

    @abstractmethod
    def run(self):
        pass

class Bird(Animal):
    def fly(self):
        print("Bird is flying")

    def swim(self):
        print("Bird can't swim")

    def run(self):
        print("Bird is running")

class Fish(Animal):
    def fly(self):
        print("Fish can't fly")

    def swim(self):
        print("Fish is swimming")

    def run(self):
        print("Fish can't run")

class Dog(Animal):
    def fly(self):
        print("Dog can't fly")

    def swim(self):
        print("Dog is swimming")

    def run(self):
        print("Dog is running")

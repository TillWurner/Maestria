from abc import ABC, abstractmethod

class LegacyPrinter(ABC):
    @abstractmethod
    def print(self):
        pass

    @abstractmethod
    def scan(self):
        pass

    @abstractmethod
    def fax(self):
        pass

class BasicPrinter(LegacyPrinter):
    def print(self):
        print("Printing document")

    def scan(self):
        pass  # Not supported

    def fax(self):
        pass  # Not supported

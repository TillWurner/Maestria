from abc import ABC, abstractmethod

class Payable(ABC):
    @abstractmethod
    def get_pay(self) -> float:
        pass

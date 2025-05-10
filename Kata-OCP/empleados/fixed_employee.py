from interfaces.payable import Payable

class FixedEmployee(Payable):
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def get_pay(self) -> float:
        return self.salary

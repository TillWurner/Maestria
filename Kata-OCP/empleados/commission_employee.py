from interfaces.payable import Payable

class CommissionEmployee(Payable):
    def __init__(self, name, base_salary, commission):
        self.name = name
        self.base_salary = base_salary
        self.commission = commission

    def get_pay(self) -> float:
        return self.base_salary + self.commission

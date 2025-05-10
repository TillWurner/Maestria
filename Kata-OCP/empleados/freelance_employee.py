from interfaces.payable import Payable

class FreelanceEmployee(Payable):
    def __init__(self, name, deliveries, rate_per_delivery):
        self.name = name
        self.deliveries = deliveries
        self.rate_per_delivery = rate_per_delivery

    def get_pay(self) -> float:
        return self.deliveries * self.rate_per_delivery

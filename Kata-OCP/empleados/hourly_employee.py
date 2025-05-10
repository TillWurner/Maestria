from interfaces.payable import Payable

class HourlyEmployee(Payable):
    def __init__(self, name, hours_worked, hourly_rate):
        self.name = name
        self.hours_worked = hours_worked
        self.hourly_rate = hourly_rate

    def get_pay(self) -> float:
        return self.hours_worked * self.hourly_rate

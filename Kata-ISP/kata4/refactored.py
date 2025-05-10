from abc import ABC, abstractmethod

class TemperatureReadable(ABC):
    @abstractmethod
    def read_temperature(self):
        pass

class PressureReadable(ABC):
    @abstractmethod
    def read_pressure(self):
        pass

class HumidityReadable(ABC):
    @abstractmethod
    def read_humidity(self):
        pass

class TemperatureSensor(TemperatureReadable):
    def read_temperature(self):
        return 25.0

class PressureSensor(PressureReadable):
    def read_pressure(self):
        return 1.0

class HumiditySensor(HumidityReadable):
    def read_humidity(self):
        return 50.0

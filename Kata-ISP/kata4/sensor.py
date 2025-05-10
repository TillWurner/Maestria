from abc import ABC, abstractmethod

class Sensor(ABC):
    @abstractmethod
    def read_temperature(self):
        pass

    @abstractmethod
    def read_pressure(self):
        pass

    @abstractmethod
    def read_humidity(self):
        pass

class TemperatureSensor(Sensor):
    def read_temperature(self):
        return 25.0

    def read_pressure(self):
        pass  # Not supported

    def read_humidity(self):
        pass  # Not supported

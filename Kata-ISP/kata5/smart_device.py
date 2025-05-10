from abc import ABC, abstractmethod

class SmartDevice(ABC):
    @abstractmethod
    def turn_on(self):
        pass

    @abstractmethod
    def turn_off(self):
        pass

    @abstractmethod
    def connect_to_wifi(self):
        pass

    @abstractmethod
    def play_music(self):
        pass

class SmartLight(SmartDevice):
    def turn_on(self):
        print("Light on")

    def turn_off(self):
        print("Light off")

    def connect_to_wifi(self):
        print("Connected to WiFi")

    def play_music(self):
        pass  # Not supported

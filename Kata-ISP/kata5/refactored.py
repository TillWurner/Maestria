from abc import ABC, abstractmethod

class PowerControllable(ABC):
    @abstractmethod
    def turn_on(self):
        pass

    @abstractmethod
    def turn_off(self):
        pass

class WiFiConnectable(ABC):
    @abstractmethod
    def connect_to_wifi(self):
        pass

class MusicPlayable(ABC):
    @abstractmethod
    def play_music(self):
        pass

class SmartLight(PowerControllable, WiFiConnectable):
    def turn_on(self):
        print("Light on")

    def turn_off(self):
        print("Light off")

    def connect_to_wifi(self):
        print("Connected to WiFi")

class SmartSpeaker(PowerControllable, WiFiConnectable, MusicPlayable):
    def turn_on(self):
        print("Speaker on")

    def turn_off(self):
        print("Speaker off")

    def connect_to_wifi(self):
        print("Connected to WiFi")

    def play_music(self):
        print("Playing music")

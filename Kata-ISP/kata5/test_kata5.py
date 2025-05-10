import unittest
from refactored import SmartLight, SmartSpeaker

class TestKata5(unittest.TestCase):
    def test_smart_light(self):
        light = SmartLight()
        light.turn_on()
        light.connect_to_wifi()
        light.turn_off()



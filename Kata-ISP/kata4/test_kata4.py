import unittest
from refactored import TemperatureSensor, PressureSensor, HumiditySensor

class TestKata4(unittest.TestCase):
    def test_temperature_sensor(self):
        sensor = TemperatureSensor()
        self.assertEqual(sensor.read_temperature(), 25.0)

    def test_pressure_sensor(self):
        sensor = PressureSensor()
        self.assertEqual(sensor.read_pressure(), 1.0)

    def test_humidity_sensor(self):
        sensor = HumiditySensor()
        self.assertEqual(sensor.read_humidity(), 50.0)

if __name__ == '__main__':
    unittest.main()

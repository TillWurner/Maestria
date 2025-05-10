import unittest
from refactored import Car, Plane, Boat

class TestKata3(unittest.TestCase):
    def test_car(self):
        car = Car()
        car.drive()

    def test_plane(self):
        plane = Plane()
        plane.drive()
        plane.fly()

    def test_boat(self):
        boat = Boat()
        boat.sail()

if __name__ == '__main__':
    unittest.main()

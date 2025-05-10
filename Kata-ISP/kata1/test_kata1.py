import unittest
from refactored import Bird, Fish, Dog

class TestKata1(unittest.TestCase):
    def test_bird(self):
        bird = Bird()
        bird.fly()
        bird.run()

    def test_fish(self):
        fish = Fish()
        fish.swim()

    def test_dog(self):
        dog = Dog()
        dog.run()
        dog.swim()

if __name__ == '__main__':
    unittest.main()

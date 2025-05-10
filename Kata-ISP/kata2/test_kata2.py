import unittest
from refactored import BasicPrinter

class TestKata2(unittest.TestCase):
    def test_basic_printer(self):
        printer = BasicPrinter()
        printer.print()

if __name__ == '__main__':
    unittest.main()

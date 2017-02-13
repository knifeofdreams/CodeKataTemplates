import unittest

from kata import CodeKata, test


class CodeKataTest(unittest.TestCase):

    def setUp(self):
        self.code_kata = CodeKata()

    def test_test_method(self):
        self.assertEqual(self.code_kata.test_method(), True)


class GlobaLExampleTest(unittest.TestCase):

    def test_test(self):
        self.assertEqual(test(), 'my_test')

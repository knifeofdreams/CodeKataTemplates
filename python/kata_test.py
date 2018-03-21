import unittest
from unittest import mock

from kata import CodeKata, test


class CodeKataTest(unittest.TestCase):

    def setUp(self):
        self.code_kata = CodeKata()

    @mock.patch('kata.randint')
    def test_test_method(self, mock_randint):
        mock_randint.return_value = 4
        self.assertEqual(self.code_kata.test_method(), 4)


class GlobaLExampleTest(unittest.TestCase):

    def test_test(self):
        self.assertEqual(test(), 'my_test')

package main

import "fmt"
import "testing"

func Test_MyTest(t *testing.T) {
	expected := "my_test"
	actual := MyTest()
	if actual != expected {
		fmt.Println(expected, actual)
		t.Error("Test failed")
	} else {
		t.Log("MyTest: test passed")
	}
}

func Test_TestMethod(t *testing.T) {
	expected := true
	my_struct := mytype{}
	actual := my_struct.TestMethod()
	if actual != expected {
		fmt.Println(expected, actual)
		t.Error("Test failed")
	} else {
		t.Log("TestMethod: test passed")
	}
}
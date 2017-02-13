package main

type mytype struct {}

func (my_type *mytype) TestMethod() bool {
	return true
}


func MyTest() (test string) {
	test = "my_test"
	return test
}
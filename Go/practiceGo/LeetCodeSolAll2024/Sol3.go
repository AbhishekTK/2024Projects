package main

import (
	"fmt"
	"os"
)

// blank identifier, os.Args[] command line arg, slice, for loop variations
// var :=
func main() {
	//go get golang.org/x/tools/cmd/goimports
	//go get "github.com/gorilla/mux"
	//go get fmt
	fmt.Println("Hello ", "\n World")
	fmt.Println(len(os.Args))
	fmt.Println(os.Args[0])
	fmt.Println(os.Args[0:len(os.Args)])
	// str input;
	input := "abcabc"
	fmt.Println(input)
	// var s, sep string
	// for i := 1; i < len(os.Args); i++ {
	// 	s += sep + os.Args[i]
	// 	sep = " "
	// }
	// fmt.Println(s)

	s, sep := "", ""
	for _, arg := range os.Args[1:] {
		s += sep + arg
		sep = " "
	}
	fmt.Println(s)

}

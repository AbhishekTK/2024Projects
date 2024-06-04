package main

import (
	"fmt"
	"math"
)

func main() {
	fmt.Println("Hello", " World!", "  !")
	count, sum := 0, 0
	for count < 10 {
		sum += (count)
		count++
		if count > 5 {
			fmt.Println(findSqrt(sum))
		}

	}
	fmt.Println(sum, count)
}

func findSqrt(sum int) (sqrt float64) {
	sqrt = math.Sqrt(float64(sum))
	if sum%2 == 0 {

	}
	return sqrt

}

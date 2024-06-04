package main

import (
	"fmt"
	"math"
	"time"
	// "go.starlark.net/lib/time"
)

//POST - /hello?name=
//port 8080

type Person struct {
	Name string
}

type car struct {
	name  string
	bTire tire
	fTire tire
	engine
}

type truck struct {
	bedsize int
	car
}

type rect struct {
	len int
	bre int
}

func (r rect) area() int {
	if r.bre < 0 || r.len < 0 {
		return 0
	}
	return r.len * r.bre
}

func area2(r rect) int {
	/** if r.bre < 0 || r.len < 0 {
		return 0
	} **/
	return r.len * r.bre
}

type engine struct {
	eName string
}

type tire struct {
	companyName string
}

func printCarDetails(c car) {
	fmt.Println("Car details:", c)
}

func printTruckDetails(tCar truck) {
	fmt.Println("Car details:", tCar.bedsize, "Yet the car:",
		tCar.car)
}

func getAttributes(s shape)  {
	fmt.Println("|||||||||||")
	fmt.Println(s.area())
	fmt.Println(s.peri())
	fmt.Println("|||||||||||")
}


type shape interface {
	area() float64
	peri() float64
}

type rectangle struct {
	w, h float64
}

func (r rectangle) area() float64 {
	return r.w * r.h
}

func (r rectangle) peri() float64 {
	return 2*r.h + 2*r.w
}

type circle struct {
	radius float64
}

func (c circle) area() float64 {
	return math.Pi * c.radius * c.radius
}

func (c circle) peri() float64 {
	return 2 * math.Pi * c.radius
}

type message interface {
	getMessage() string
}

type bdayMsg struct {
	bTIme time.Time
	bName string
}

func (bm bdayMsg) getMessage() string {
	return fmt.Sprintf("Hi %s, it is ur bday on %s", bm.bName, &bm.bTIme)
}

type sRep struct {
	rName   string
	noSends int
}

func (sr sRep) getMessage() string {
	return fmt.Sprintf("Hi %s, ur report is ready. you have sent %v copies ", sr.rName, sr.noSends)
}

func sendMessage(msg message) {
	fmt.Println(msg.getMessage())
}
func main() {

	sendMessage(bdayMsg{
		bTIme: time.Date(1994, 03, 03, 15, 30, 30, 0, time.UTC),
	})

	sendMessage(sRep{
		noSends: 10,
		rName: "John Doe",
	})

	getAttributes(rectangle{
		w: 6,
		h: 6,
	})
	getAttributes(circle{
		radius: 6,
	})
	
	// s1 := shape
	// fmt.Print(s)

	exRect := rect{
		bre: 20,
		len: 30,
	}

	ex2Rect := rect{
		bre: -20,
		len: 30,
	}

	fmt.Println("rekt", exRect)
	fmt.Println(exRect.area())
	fmt.Println(ex2Rect.area())
	fmt.Println(area2(ex2Rect))
	tCar := car{
		name: "LDT",
		bTire: tire{
			companyName: "L",
		},
	}
	aTruck := truck{
		bedsize: 3,
	}

	printCarDetails(tCar)
	printTruckDetails(aTruck)

	printCarDetails(
		car{
			name: "Nexon",
			engine: engine{
				eName: "U noe its not v8",
			},
			bTire: tire{companyName: "Tata"},
			fTire: tire{companyName: "MRF"},
		},
	)
}

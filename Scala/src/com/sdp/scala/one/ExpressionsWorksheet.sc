val x = 17
//x = 20

val y = "ABC1234"
//y = "DEF1234"

val z = 15.56
println(z)

val sky = "sunny"
var temp = 90.0

if (sky == "sunny" && temp > 80.0) true else false
if ((sky == "sunny" || sky == "partly cloudy") && temp > 80.0) true else false
if ((sky == "sunny" || sky == "partly cloudy") && (temp > 80.0 || temp < 20.0)) true else false
temp = (temp - 32.0) * (5.0/9.0)
(temp * (9.0/5.0)) + 32.0

var v1 = Vector(2,3,4)
var v2 = Vector("The", "dog", "visited", "the", "fire")
var v3 = Vector(v1, v2)

for (v <- v2) println(v)

var v4 = v2 :+ "station"
var sentence = ""

for (s <- v4) sentence += (s + " ")

println(sentence)

assert(sentence.toString() == "The dog visited the fire station ")

val v5 = Vector(2,3,4)
val v6 = Vector(2.5, 3.5, 4.5)
v5.sum
v5.min
v5.max
v6.sum
v6.min
v6.max

import com.atomicscala.AtomicTest._

var myVector1 = Vector(1,2,3,4,5,6)
var myVector2 = Vector(1,2,3,4,5,6)

myVector1 is myVector2
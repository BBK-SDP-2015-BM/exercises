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

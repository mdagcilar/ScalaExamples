
def getArea (radius:Double):Double =
  {
    val PI = 3.14
    PI * radius * radius
  } :Double

val calcArea = getArea _

val r = 8

calcArea(r)

5 * 6
5.*(6)

List.range(1, 11) map { i => i * 3} filter { j => j%6 == 0 } foreach  {println}

List.range(1, 11).map(i => i * 3).filter(j => j%6 == 0).foreach(println)

val list = List.range(1, 12)
list.size
list.length

def getRadius(): Int = {
  val r = 7
  r
}

getRadius()
getRadius

list slice(3,7)

String string = "Hello"












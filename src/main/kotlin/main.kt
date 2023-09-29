import kotlin.math.pow

fun main() {
    val (x, y) = readln().split(" ").map { it.toDouble() }
    println(var4z2(x, y))
    println(var4z3(x))
}

fun var4z2(x: Double, y: Double): Boolean {
    val r = 3.0 // circle radius
    // points of a triangle
    val (Ax, Ay) = listOf(0.0, 0.0)
    val (Bx, By) = listOf(3.0, 0.0)
    val (Cx, Cy) = listOf(1.5, -3.0)
    var result = false

    if (x < 0.0 && y > 0) {
        result = inCircle(x, y, r)
    } else if (x > 0 && y < 0) {
        result = inTriangle(x, y, Ax, Ay, Bx, By, Cx, Cy)
    }
    return result
}

fun inCircle(x: Double, y: Double, r:Double): Boolean {
    return x.pow(2) + y.pow(2) <= r.pow(2)
}

fun inTriangle(x: Double, y: Double, Ax: Double, Ay: Double, Bx: Double, By: Double, Cx: Double, Cy: Double): Boolean {
    return (((x - Ax) * (By - Ay) - (y - Ay) * (Bx - Ax)) * ((Cx - Ax) * (By - Ay) - (Cy - Ay) * (Bx - Ax))) >= 0 &&
           (((x - Bx) * (Cy - By) - (y - By) * (Cx - Bx)) * ((Ax - Bx) * (Cy - By) - (Ay - By) * (Cx - Bx))) >= 0 &&
           (((x - Cx) * (Ay - Cy) - (y - Cy) * (Ax - Cx)) * ((Bx - Cx) * (Ay - Cy) - (By - Cy) * (Ax - Cx))) >= 0
}

fun var4z3(x: Double):Double {
    return when {
        x <= -2 -> 2.0
        x <= 0 -> x + 4
        else -> -x + 4
    }
}
fun main(args : Array<String>) {
    val name = "John Doe"
    val x = 42
    val y = 42L
    val z: Long = x.toLong()

    println(name)
    println(x)
    println(y)
    println(z)

    val q = 44.5
    val qq = q.toDouble()
    val qqq = q.toInt()

    println(q)
    println(qq)
    println(qqq)

    val s = "Hello All"
    println(s)

    var s2: String? = "hello"
    println(s2)
    val aa = s2?.length
    s2 = null
    println(s2)
    val bb = s2?.length
    println(aa)
    println(bb)
    val cc = s2?.length ?: -1
    println(cc)





}
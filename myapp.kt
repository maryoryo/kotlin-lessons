// fun main(args: Array<String>) {
  // val msg: String = "Hello World"
  // println(msg)
  // val c: Char = 'a'
  // println(c)

  // val i: Int = 100
  // println(i)
  // val l: Long = 555555555555L
  // println(l)

  // val d: Double = 234.565675765
  // println(d)
  // val f: Float = 12.234F
  // println(f)

  // val flag: Boolean = true
  // println(flag)

  // val x = 10
  // println(x / 3)
  // println(x / 3.0)

  // println(x % 3)

  // var y = 5
  // y++
  // println(y)

  // var z = 4
  // // z = z + 12
  // z +=12

  // val flag = true
  // println(!flag)

  // println("hello" + "world")

  // val name = "taguchi"
  // println("my name is $name")

  // println("my score is ${12 + 32}")

  // println("hello\n wo\trld")

  // val score = 45

  // // if (score > 80) {
  // //   println("greet!")
  // // } else if (score > 60) {
  // //   println("good")
  // // } else {
  // //   println("so so ...")
  // // }

  // val result = if (score > 80) "Great" else "so so ..."
  // println(result)

  // val num = 5

  // // when (num) {
  // //   0 -> println("Zero")
  // //   1 -> println("One")
  // //   2, 3 -> println("Two or Three")
  // //   in 4..10 -> println("Many")
  // //   else -> println("other")
  // // }
  // val result = when (num) {
  //   0 -> "Zero"
  //   1 -> "One"
  //   2, 3 -> "Two or Three"
  //   in 4..10 -> "Many"
  //   else -> "other"
  // }
  // println(result)

  // var i = 100

  // // while (i < 10) {
  // //   println("loop: $i")
  // //   i++
  // // }

  // do {
  //   println("loop: $i")
  //   i++
  // } while (i < 10)


  // for (i in 0..9) {
  //   // if (i == 5) break
  //   if (i == 5) continue
  //   println(i)
  // }
//   sayHi("tom", 22)
//   sayHi("bob", 25)
//   sayHi()
//   sayHi(age = 19, name = "steve")
// }

// fun sayHi(name: String = "taguchi", age: Int = 23) {
//   println("hi! $name ($age)")
// }


// fun main(args: Array<String>) {
//   val msg = sayHi()
//   println(msg)
// }

// // fun sayHi(): String {
// //   return "hi!"
// //   // println("hi!")
// // }
// fun sayHi() = "hi!"


// class User(var name: String) {
//   // var name = name
//   var team = "red"
//   // init {
//   //   println("instance created, name: $name, team: $team")
//   // }

//   // get() {
//   //   return field.toUpperCase()
//   // }
//   get() = field.toUpperCase()
  

//   set(value) {
//     if (value != "") {
//       field = value
//     }
//   }

//   fun sayHi() {
//     println("hi ${this.name}")
//   }
// }

// fun main(args: Array<String>) {

//   val tom: User = User("tom")
//   println(tom.team)
//   tom.team = "blue"
//   println(tom.team)
//   tom.team = ""
//   println(tom.team)
//   // tom.sayHi()

  

//   // val bob: User = User("bob")
//   // println(bob.name)
//   // bob.sayHi()

//   // user.name = "Me ME!"
//   // println(user.name)
//   // user.sayHi()
// }


// class AdminUser(name: String): User(name) {
//   fun  sayHello() {
//     println("hello $name")
//   }
//   override fun sayHi() {
//     println("[Admin] hi $name")
//   }
// }

// // open class User(public var name: String) {
// open class User(private var name: String) {
//   open fun sayHi() {
//     println("hi $name")
//   }
// }

// fun main(args: Array<String>) {
//   val bob = AdminUser("bob")
//   println(bob.name)
//   bob.sayHello()
//   bob.sayHi()

// }


// fun User.sayHello() {
//   println("hello $name")
// }

// fun User.sayHi() {
//   println("[ext] hello $name")
// }

// val User.myName: String
//   get() = "I am $name"

// class User(var name: String) {
//   fun sayHi() {
//     println("hi $name")
//   }
// }

// fun main(args: Array<String>) {
//   val tom = User("tom")
//   tom.sayHello()
//   tom.sayHi()
//   println(tom.myName)
// }


// abstract class User {
//   abstract fun sayHi()
// }

// class Japanese: User() {
//   override fun sayHi() {
//     println("こんにちは")
//   }
// }

// class American: User() {
//   override fun sayHi() {
//     println("Hi!")
//   }
// }

// fun main(args: Array<String>) {
//   val tom = American()
//   val aki = Japanese()
//   tom.sayHi()
//   aki.sayHi()
// }


// interface Sharable {
//   val version: Double
//   fun share()
//   fun getInfo() {
//     println("Share I/F ($version)")
//   }
// }

// class User: Sharable {
//   override val version = 1.1
//   override fun share() {
//     println("Sharing...")
//   }
// }

// fun main(args: Array<String>) {
//   val user = User()
//   user.share()
//   user.getInfo()
// }


// class MyInteger {
//   fun getThree(x: Int) {
//     println(x)
//     println(x)
//     println(x)
//   }
// }

// class MyData<T> {
//   fun getThree(x: T) {
//     println(x)
//     println(x)
//     println(x)
//   }  
// }

// fun main(args: Array<String>) {
//   // val mi = MyInteger()
//   // mi.getThree(55)
//   val i = MyData<Int>()
//   i.getThree(32)
//   val s = MyData<String>()
//   s.getThree("hello")
// }


// data class Point(val x: Int, val y: Int) {
  
// }

// fun main(args: Array<String>) {
//   val p1 = Point(3, 5)
//   // val p2 = Point(3, 5)
//   val p2 = p1.copy()
//   // val p1 = Point(3, 5)
//   println(p1)
//   println(if (p1 == p2) "same" else "not same")

//   val (x, y) = p1
//   println("$x:$y")
// }



// fun main(args: Array<String>) {
//   val sales: List<Int> = mutableListOf(20, 30, 40)
//   println(sales[1])
//   sales[1] = 50
//   println(sales.size)
//   for (sale in sales) {
//     println(sale)
//   }
// }

// fun main(args: Array<String>) {
//   /*val sales: List<Int> = listOf(20, 30, 40)*/
//   /*val sales = listOf(20, 30, 40)*/
//   val sales: List<Int> = mutableListOf(20, 30, 40)
//   println(sales[1]) // 30
//   sales[1] = 50
//   println(sales.size) // 3
//   for (sale in sales) {
//     println(sale)
//   }
// }

// fun main(args: Array<String>) {
//   // val answers: Set<Int> = setOf(5, 3, 8, 5)
//   val answers = mutableSetOf(5, 3, 8, 5)
//   answers.add(15)
//   answers.remove(3)

//   println(answers)
//   // println(answers.contains(3))

//   // val set1 = setOf(1,3,5,8)
//   // val set2 = setOf(3,5,8,9)
//   // println(set1.intersect(set2))
//   // println(set1.union(set2))
//   // println(set1.subtract(set2))
// }


// fun main(args: Array<String>) {
//   // val users: Map<String, Int> = mapOf("taguchi" to 40, "fkoji" to 80, "dotinstall" to 60)
//   val users = mutableMapOf("taguchi" to 40, "fkoji" to 80, "dotinstall" to 60)
//   // println(users["taguchi"])
//   users["taguchi"] = 55
//   println(users.size)
//   println(users.keys)
//   println(users.values)
//   println(users.entries)
// }


// fun main(args: Array<String>) {
//   val prices = listOf(53.2, 48.2, 32.8)
//   // prices.map {n -> n * 1.08}
//   prices
//     // .map {n -> n * 1.08}
//     .map {it * 1.08}
//     .filter {it > 50}
//     .forEach {println(it)}
// }



// class MyException(message: String): Throwable(message)

// fun div(a: Int, b: Int) {
//   try {
//     if (b < 0) {
//       throw MyException("not minus!")
//     }
//     println(a / b)
//   } catch (e: ArithmeticException) {
//     println(e.message)
//   } catch (e: MyException) {
//     println(e.message)
//   } finally {
//     println("-- end --")
//   }
// }

// fun main(args: Array<String>) {
//   div(3, 0)
//   div(3, -3)
// }


fun main(args: Array<String>) {
  // val s: String = null
  val s: String? = null
  println(s)

  // if (s != null) {
  //   println(s.length)
  // } else {
  //   println(null)
  // }
  // println(s?.length)
  // println(s?.length ?: -1)
  println(s?.length ?: "aaaa")
  println(s!!.length)
}
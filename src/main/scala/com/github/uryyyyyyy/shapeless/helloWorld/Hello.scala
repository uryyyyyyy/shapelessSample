package com.github.uryyyyyyy.shapeless.helloWorld

import shapeless._

object plus1 extends Poly1 {
	implicit val caseString = at[String](_ + "1")
	implicit val caseInt = at[Int](_ + 1)
}

object Main{
	def main(args: Array[String]) {
		val plus1All = everywhere(plus1)

		case class User(id: Int, name: String)

		val ss = plus1All(User(1, "bob"))
		println(ss)// User(2,bob1)


		//Peano axioms
		println(Nat.toInt[_0])
		println(Nat.toInt[Succ[_0]])
		println(Nat.toInt[Succ[Succ[_0]]])
		println(Nat.toInt[Succ[Succ[Succ[_0]]]])
	}
}
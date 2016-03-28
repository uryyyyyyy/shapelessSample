package com.github.uryyyyyyy.shapeless.hlist

import shapeless._

object Main {

	def main(args: Array[String]) {
		val anyList = 1 ::"scala"::Nil

		val hList:HList = 1 ::"scala"::HNil

		//same
		val a0:Any = anyList(0)
		println(a0)

		val h0 = hList(0)
		println(h0)


		//diff
		val a2:Any = anyList(2)
		println(a2)

		//compile error
//		val h2 = hList(2)
//		println(h2)
	}

}

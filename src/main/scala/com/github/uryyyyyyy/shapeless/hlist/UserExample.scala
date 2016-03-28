package com.github.uryyyyyyy.shapeless.hlist

import shapeless._

case class User(name: String, age: Int)

object UserExample {

	object toJValue extends Poly1 {
		implicit val atInt = at[Int](_)
		implicit val atString = at[String](s => s""""$s"""")
		//省略
	}

	def main(args: Array[String]) {
		val genUser = Generic[User]
		val hlist = genUser.(User("scalaちゃん", 18))
		val user = genUser.from(hlist) // HListに変換
		val b = user == User("scalaちゃん", 18) // HListからcase classに変換する
		println(b)

		val hlist2 = "scalaちゃん":: 18 ::HNil

		val list = List[String] = hlist2.map(toJValue).toList
	}

}

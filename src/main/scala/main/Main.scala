package main

import depclass.NeedsImplicit
import identity.Identity

object Main {

  def main(args: Array[String]) {
    implicit val myImpl = Identity
    val a = new NeedsImplicit()
  }

}

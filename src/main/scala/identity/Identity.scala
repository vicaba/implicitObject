package identity


object Identity extends MYID[Identity]{

}

case class Identity() extends MYID[Identity]

trait MYID[T]

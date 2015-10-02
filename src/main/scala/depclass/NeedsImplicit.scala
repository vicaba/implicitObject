package depclass

import identity.{MYID, Identity}

class NeedsImplicit[AnID <: MYID[AnID]]()(implicit i: AnID) {

}

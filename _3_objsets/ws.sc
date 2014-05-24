import objsets._

object ws {
  val c = new Tweet("c", "c body", 7)             //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [7]
  val d = new Tweet("d", "d body", 9)             //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
  val e = new Tweet("e", "e body", 11)            //> e  : objsets.Tweet = User: e
                                                  //| Text: e body [11]
  val set5 = (new Empty).incl(c).incl(d).incl(e).filter( (t: Tweet) => true )
                                                  //> set5  : objsets.TweetSet = objsets.NonEmpty@68860b1d
  set5 foreach println                            //> User: c
                                                  //| Text: c body [7]
                                                  //| User: d
                                                  //| Text: d body [9]
                                                  //| User: e
                                                  //| Text: e body [11]
}
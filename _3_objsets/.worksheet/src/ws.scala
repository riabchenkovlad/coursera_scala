import objsets._

object ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
  val c = new Tweet("c", "c body", 7);System.out.println("""c  : objsets.Tweet = """ + $show(c ));$skip(38); 
  val d = new Tweet("d", "d body", 9);System.out.println("""d  : objsets.Tweet = """ + $show(d ));$skip(39); 
  val e = new Tweet("e", "e body", 11);System.out.println("""e  : objsets.Tweet = """ + $show(e ));$skip(78); 
  val set5 = (new Empty).incl(c).incl(d).incl(e).filter( (t: Tweet) => true );System.out.println("""set5  : objsets.TweetSet = """ + $show(set5 ));$skip(23); 
  set5 foreach println}
}

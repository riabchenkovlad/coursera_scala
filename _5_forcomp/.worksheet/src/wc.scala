import forcomp._

object wc{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); val res$0 = 	Anagrams.wordOccurrences("dddddddabbbbc");System.out.println("""res0: forcomp.Anagrams.Occurrences = """ + $show(res$0));$skip(51); val res$1 = 
  Anagrams.sentenceOccurrences(List("lala", "Yo"));System.out.println("""res1: forcomp.Anagrams.Occurrences = """ + $show(res$1));$skip(30); val res$2 = 
	Anagrams.wordAnagrams("ate");System.out.println("""res2: List[forcomp.Anagrams.Word] = """ + $show(res$2));$skip(37); 
	val abba = List(('a', 2), ('b', 2));System.out.println("""abba  : List[(Char, Int)] = """ + $show(abba ));$skip(33); val res$3 = 
	
	
	Anagrams.combinations(abba);System.out.println("""res3: List[forcomp.Anagrams.Occurrences] = """ + $show(res$3));$skip(47); val res$4 = 
   Anagrams.sentenceOccurrences(List("aanrk"));System.out.println("""res4: forcomp.Anagrams.Occurrences = """ + $show(res$4))}
}

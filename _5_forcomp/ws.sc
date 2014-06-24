import forcomp._

object wc{	Anagrams.wordOccurrences("dddddddabbbbc")
                                                  //> res0: forcomp.Anagrams.Occurrences = List((a,1), (b,4), (c,1), (d,7))
  Anagrams.sentenceOccurrences(List("lala", "Yo"))//> res1: forcomp.Anagrams.Occurrences = List((a,2), (l,2), (o,1), (y,1))
	Anagrams.wordAnagrams("ate")              //> res2: List[forcomp.Anagrams.Word] = List(ate, eat, tea)
	val abba = List(('a', 2), ('b', 2))       //> abba  : List[(Char, Int)] = List((a,2), (b,2))
	
	
	Anagrams.combinations(abba)               //> res3: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,1)), List((a
                                                  //| ,2)), List((b,1)), List((b,2)), List((a,1), (b,1)), List((a,1), (b,2)), List
                                                  //| ((a,2), (b,1)), List((a,2), (b,2)))
   Anagrams.sentenceOccurrences(List("aanrk"))    //> res4: forcomp.Anagrams.Occurrences = List((a,2), (k,1), (n,1), (r,1))
}
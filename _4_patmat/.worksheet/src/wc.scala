import patmat._
object wc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); val res$0 = 
  Huffman.times("lavblzzavaa".toList);System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(90); 
  
  val ordered = Huffman.makeOrderedLeafList(Huffman.times("acahadaaeaafabbgb".toList));System.out.println("""ordered  : List[patmat.Huffman.Leaf] = """ + $show(ordered ));$skip(69); 
  val b = Huffman.until(Huffman.singleton, Huffman.combine)(ordered);System.out.println("""b  : patmat.Huffman.CodeTree = """ + $show(b ));$skip(62); 
  val tr = Huffman.createCodeTree("acahadaaeaafabbgb".toList);System.out.println("""tr  : patmat.Huffman.CodeTree = """ + $show(tr ));$skip(39); val res$1 = 
  Huffman.decode(tr, List(1, 0, 0, 1));System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(24); val res$2 = 
  Huffman.decodedSecret;System.out.println("""res2: List[Char] = """ + $show(res$2));$skip(55); val res$3 = 
  Huffman.encode(tr)(List('a','a','c', 'f', 'g', 'g'));System.out.println("""res3: List[patmat.Huffman.Bit] = """ + $show(res$3));$skip(60); val res$4 = 
  Huffman.quickEncode(tr)(List('a','a','c', 'f', 'g', 'g'));System.out.println("""res4: List[patmat.Huffman.Bit] = """ + $show(res$4));$skip(22); val res$5 = 
  Huffman.convert(tr);System.out.println("""res5: patmat.Huffman.CodeTable = """ + $show(res$5))}
}

import patmat._
object wc {
  Huffman.times("lavblzzavaa".toList)             //> res0: List[(Char, Int)] = List((l,2), (a,4), (v,2), (b,1), (z,2))
  
  val ordered = Huffman.makeOrderedLeafList(Huffman.times("acahadaaeaafabbgb".toList))
                                                  //> ordered  : List[patmat.Huffman.Leaf] = List(Leaf(c,1), Leaf(h,1), Leaf(d,1),
                                                  //|  Leaf(e,1), Leaf(f,1), Leaf(g,1), Leaf(b,3), Leaf(a,8))
  val b = Huffman.until(Huffman.singleton, Huffman.combine)(ordered)
                                                  //> b  : patmat.Huffman.CodeTree = Fork(Leaf(a,8),Fork(Fork(Fork(Leaf(c,1),Leaf(
                                                  //| h,1),List(c, h),2),Fork(Leaf(d,1),Leaf(e,1),List(d, e),2),List(c, h, d, e),4
                                                  //| ),Fork(Fork(Leaf(f,1),Leaf(g,1),List(f, g),2),Leaf(b,3),List(f, g, b),5),Lis
                                                  //| t(c, h, d, e, f, g, b),9),List(a, c, h, d, e, f, g, b),17)
  val tr = Huffman.createCodeTree("acahadaaeaafabbgb".toList)
                                                  //> tr  : patmat.Huffman.CodeTree = Fork(Leaf(a,8),Fork(Fork(Fork(Leaf(c,1),Leaf
                                                  //| (h,1),List(c, h),2),Fork(Leaf(d,1),Leaf(e,1),List(d, e),2),List(c, h, d, e),
                                                  //| 4),Fork(Fork(Leaf(f,1),Leaf(g,1),List(f, g),2),Leaf(b,3),List(f, g, b),5),Li
                                                  //| st(c, h, d, e, f, g, b),9),List(a, c, h, d, e, f, g, b),17)
  Huffman.decode(tr, List(1, 0, 0, 1))            //> res1: List[Char] = List(h)
  Huffman.decodedSecret                           //> res2: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  Huffman.encode(tr)(List('a','a','c', 'f', 'g', 'g'))
                                                  //> res3: List[patmat.Huffman.Bit] = List(0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0,
                                                  //|  1, 1, 1, 0, 1)
  Huffman.quickEncode(tr)(List('a','a','c', 'f', 'g', 'g'))
                                                  //> res4: List[patmat.Huffman.Bit] = List(0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0,
                                                  //|  1, 1, 1, 0, 1)
  Huffman.convert(tr)                             //> res5: patmat.Huffman.CodeTable = List((a,List(0)), (c,List(1, 0, 0, 0)), (h,
                                                  //| List(1, 0, 0, 1)), (d,List(1, 0, 1, 0)), (e,List(1, 0, 1, 1)), (f,List(1, 1,
                                                  //|  0, 0)), (g,List(1, 1, 0, 1)), (b,List(1, 1, 1)))
}
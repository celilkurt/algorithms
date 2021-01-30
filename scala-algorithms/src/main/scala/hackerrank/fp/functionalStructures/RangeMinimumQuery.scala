package hackerrank.fp.functionalStructures

import scala.io.StdIn.readLine


object RangeMinimumQuery {

  def main(args: Array[String]): Unit = {

    val queryCount = readLine.split(" ")(1).toInt
    val numbs = readLine.split(" ").map(_.toInt)
    val x =  (math.ceil(Math.log(numbs.length) / Math.log(2)))

    //Maximum size of segment tree
    val max_size = 2 *  math.pow(2, x).toInt - 1
    val tree = Array.fill(max_size)(Int.MaxValue)

    build(tree,numbs,0,0,numbs.length-1)
    println(tree.mkString(" "))

    for(i <- 1 to queryCount){

      val params = readLine.split(" ").map(_.toInt)
      val beginI = params(0)
      val endI = params(1)
      println(query(tree,0,0,numbs.length-1,beginI,endI))


    }





  }

  def build(tree: Array[Int], numbs: Array[Int], node: Int, start: Int, end: Int): Unit = {
    if (start == end) {
      tree(node) = numbs(start)
      //println(s"${node }  => ${numbs(start)}")
    }else {
      val mid = (start + end) / 2
      build(tree, numbs, 2 * node + 1, start, mid)
      build(tree, numbs, 2 * node + 2, mid + 1, end)

      tree(node) = List(tree(2 * node + 1), tree(2 * node + 2)).min
      //println(s"$node: (${tree(2 * node + 1)} - ${tree(2 * node + 2)}) => ${tree(node)}")
    }
  }

  def query(tree: Array[Int], node: Int, start: Int, end: Int, l: Int, r: Int): Int =
  {
    if(l > end || start > r)
    {
      // range represented by a node is completely outside the given range
      return Int.MaxValue;
    }
    if(l <= start && end <= r)
    {
      // range represented by a node is completely inside the given range
      return tree(node)
    }
    // range represented by a node is partially inside and partially outside the given range
    val mid = (start + end) / 2
    val p1 = query(tree,2*node+1, start, mid, l, r)
    val p2 = query(tree,2*node+2, mid+1, end, l, r)
    List(p1, p2).min
  }



  // root: (i-1)/2, left child: 2*i+1, left child: 2*i+2,


}

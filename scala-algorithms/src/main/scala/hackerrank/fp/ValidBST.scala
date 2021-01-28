package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

// 3 2 1 5 4 6

object ValidBST {

  def main(args: Array[String]): Unit = {

    val t = readInt
    for(i <- 0 until t){

      val numCount = readInt
      val nums = for(num <- readLine.split(" ")) yield num.toInt

      val root = Node(EmptyNode,EmptyNode,nums(0))
      Range(1,nums.length).foreach(i => {insertNode(root,nums(i))})

      if(printTree(root).trim == nums.mkString(" "))
        println("YES")
      else
        println("NO")

    }

  }

  def insertNode(root: Node, newValue: Int): Unit = {

    if(root.value > newValue){
        root.left match {
        case Node(left, right, value) => { insertNode(root.left.asInstanceOf[Node],newValue)}
        case EmptyNode => { root.left = Node(EmptyNode,EmptyNode,newValue)}
      }
    }else {
      root.right match {
        case Node(left, right, value) => { insertNode(root.right.asInstanceOf[Node], newValue) }
        case EmptyNode => { root.right = Node(EmptyNode, EmptyNode, newValue) }
      }
    }

  }

  def printTree(root: Tree): String =
    root match {
      case Node(left, right, value) => {List(value + " ", printTree(left), printTree(right)).mkString}
      case EmptyNode => { "" }

    }
}

sealed trait Tree
case class Node(var left: Tree , var right: Tree , value: Int) extends Tree

case object EmptyNode extends Tree

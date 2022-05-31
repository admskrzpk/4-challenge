import scala.io.StdIn.readLine

object Calendar extends App {


  println("Enter date: ")
  val date = readLine()
  print("Assign task ")
  val task = readLine()
  println(s"Your task for $date is $task")



}
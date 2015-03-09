package pl.edu.pjwstk

import akka.actor.Actor

class HelloActor extends Actor{
  override def receive: Receive = {
    case "hello" => println("hello back at you")
    case _ => println("???")
  }
}
package pl.edu.pjwstk

import akka.actor.{Props, ActorSystem}

object Main extends App{
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "witaj"
}
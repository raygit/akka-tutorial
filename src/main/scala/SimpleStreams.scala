import akka._
import akka.actor._
import akka.stream._
import akka.stream.scaladsl._

trait SimpleSource {

  val source : Source[Int, Unit] = Source(1 to 100)

}

object StreamingX extends App {

  override def main(args: Array[String]) {

    implicit val system = ActorSystem("quickstart")
    implicit val materializer = ActorMaterializer()

    val ss = new SimpleSource{}

    ss.source.runForeach(i => println(i))(materializer)
  }
}


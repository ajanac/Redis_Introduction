/**
  * Created by Ajana Sathian on 12/18/2017.
  * Introducing the concept of redis api to read or write from or to Redis server
  */
import redis.clients.jedis.Jedis
object HelloWorldRedis {
  def main(args: Array[String]): Unit = {
    val redisObj= new Jedis("localhost")
    redisObj.set("Hello","World")
    println(redisObj.get("Hello"))
    println(redisObj.get("name"))
  }
}

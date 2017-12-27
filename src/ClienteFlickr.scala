import java.util.Properties


object ClienteFlickr extends App {  
  
  val props = new Properties()
  props.load(getClass.getClassLoader.getResourceAsStream("config.properties"))
  val apiKey = props.getProperty("flickr.api.key").replace("\"", "")
  val method = "flickr.photos.search"
  val tags = "pitbull"
  
  val url = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"
  
  scala.io.Source.fromURL(url).getLines().foreach(println)
  
}
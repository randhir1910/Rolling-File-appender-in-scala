import org.apache.log4j.Logger

object Logg extends App {
  val logger = Logger.getLogger(getClass.getName)
  logger.fatal("Highest priority")
  logger.error("Second highest priority")
  logger.info("Third highest priority")
}
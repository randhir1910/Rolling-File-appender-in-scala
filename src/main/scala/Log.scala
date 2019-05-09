import LoggerUtil._

object Log extends App {

  logger.debug("This is a debug message")
  logger.info("This is an info message")
  logger.warn("This is a warn message")
  logger.error("This is an error message")
  logger.fatal("This is a fatal message")
}

package org.example

import io.vertx.core.Vertx

fun main() {
  val vertx = Vertx.vertx()
  vertx.createHttpServer().requestHandler { it.response().end("hello from vert.x") }.listen(9000)
}

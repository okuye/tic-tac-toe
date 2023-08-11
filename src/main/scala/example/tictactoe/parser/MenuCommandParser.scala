package example.tictactoe.parser

import example.tictactoe.domain.MenuCommand
import zio.ZIO
import zio.macros._
import zio.macros.access.accessible
import zio.macros.mock.mockable//  annotation.{accessible, mockable}
//
@accessible
@mockable
trait MenuCommandParser {

  val menuCommandParser: MenuCommandParser.Service[Any]
}

object MenuCommandParser {

  trait Service[R] {

    def parse(input: String): ZIO[R, Nothing, MenuCommand]
  }
}

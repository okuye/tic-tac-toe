package example.tictactoe
import zio.test.{assert, suite, testM, DefaultRunnableSpec}
import zio.test.environment.TestConsole
import zio.test.Assertion.equalTo

object TicTacToeSpec
    extends DefaultRunnableSpec(
      suite("TicTacToe")(
        testM("prints to console") {
          for {
            test <- TestConsole.makeTest(TestConsole.DefaultData)
            _ <- TicTacToe.program.provide(new TestConsole {
              val console = test
            })
            out <- test.output
          } yield assert(out, equalTo(Vector("TicTacToe game!\n")))
        }
      )
    )

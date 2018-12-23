import scala.annotation.tailrec

def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)

factorial(10)

//尾递归版本
def factorialTailrec(n: Int): Int = {
  @tailrec
  def loop(acc: Int, n: Int): Int =
    if (n == 0) acc else loop(n * acc, n - 1)
  loop(1, n)
}

factorialTailrec(10)
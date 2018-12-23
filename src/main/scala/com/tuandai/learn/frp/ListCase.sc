//构造string list
val fruit = List("Apple","Banana","Orange")

//构造number list
val nums = List(1,2,3,4)

nums.isEmpty

//遍历list
for(x <- nums) print(x)

nums.head

nums.tail

nums.tail.head

nums match {
  case Nil => print("Nil")
  case x :: Nil => print(x)
  case _ :: x :: _ :: _ :: Nil => print(x)
  case _ => print("default case")
}

//Nil是一个预定义好的List常量
//::是List类中的一个方法
//注意::在Scala里是右结合的, 所以4::Nil相当于Nil.::(4)
//Nil.::(4)会返回一个新的List对象, head是4, tail是Nil
val nums2 = 1 :: (2:: (3:: (4 :: Nil)))

//在scala中, ::是右结合的, 并且方法调用可以省略括号, 所以可以写成下面的形式
val nums3 = 1 :: 2 :: 3 :: 4 :: Nil

//TODO 插入排序
val chaosList = 9 :: 3 :: 2 :: 7 :: 5 :: 10 :: Nil

def insert(x: Int, xs: List[Int]): List[Int] =
  if(x < xs.head) x :: xs
  else xs.head :: insert(x, xs.tail)

def insertionSort(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case _ :: Nil => xs
  case x :: xs => insert(x, insertionSort(xs))
}

insertionSort(chaosList)

nums.filter(x => x > 3)
nums.filter(_ > 3)
//filter(List[Int], Int => Boolean): List[Int]
nums.map(x => x + "str")
nums.flatMap(x => List(x + "str"))
//map(List[Int], Int => String): List[String]
//flatMap(List[Int], Int => List[String]): List[String]

nums zip fruit
//zip(List[Int], List[String]): List[(Int, String)]

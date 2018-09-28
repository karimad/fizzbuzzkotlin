fun fizzBuzz(N: Int) = (1..N).map {  if (it % 15 == 0) " fizzbuzz " else { if (it % 3 == 0) " fizz " else if (it % 5 == 0) " buzz " else " $it " }}.toString()

fun main(args : Array<String>) {
    print(fizzBuzz(10))
}


fun start(){
//    val result = passMeFunction(4,4,{a,b -> add(2,3)})

    //High Order Return and pass Function as a parameter
    val result = passMeFunction(4,4,{2+3})
    print(result)
    val returnResult = retunMeFunction()
    print(returnResult(2,3))
}

inline fun passMeFunction(a:Int,b:Int,addd:() -> Int): Int {
 return addd() + 3
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun retunMeFunction():((Int,Int) -> Int){
    return ::add
}

//inline fun doSomethingElse(abc: () -> Unit, noinline xyz: () -> Unit) {
//    // I can take function
//    // do something else here
//    // execute the function
//    abc()
//    xyz()
//}
//
//fun doSomething() {
//    print("doSomething start")
//    doSomethingElse {
//        print("doSomethingElse")
//        // return is not allowed here
//    }
//    print("doSomething end")
//}
////
//inline fun doSomethingElse(crossinline abc: () -> Unit) {
//    // I can take function
//    // do something else here
//    // execute the function
//    abc()
//}



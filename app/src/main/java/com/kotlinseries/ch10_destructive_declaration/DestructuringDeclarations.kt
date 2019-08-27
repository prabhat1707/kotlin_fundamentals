import com.kotlinseries.DataClass

class DestructuringDeclarations{

    fun start(){
        val (name,age) = getData()
        print(name)
        print(age)
    }

    fun getData(): DataClass {
        return DataClass("xyz","56")
    }
}


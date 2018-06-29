class class1
{
	class class2
	{
		fun foo() = "Nested class demo"
	}
}

fun main(args:Array<String>)
{
	val demo:String = class1.class2().foo();
	println(demo)	
}
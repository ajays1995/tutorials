class Outer
{
	inner class Inner
	{
		fun foo() = "Welcome to Inner class demo"
	}
}

fun main(args:Array<String>)
{
	val demo:String = Outer().Inner().foo();
	println(demo);	
}
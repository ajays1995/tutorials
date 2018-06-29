fun main(args:Array<String>)
{
	for(x in 1..10)
		{
			println("for loop "+x)
		}
	
	var y:Int = 1
	
	when(y)
	{
		1-> println("y value is 1")
		2 -> println("y value is 2")
		else ->
				{
					println("else loop")
				}
	}
	
	println("Example of break & continue")
	
	demolabel@ for(z in 1..10)
		{
			if(z==5)
				{
					println("break the value when z is "+z)
					break@demolabel
				}
			else
				{
					println("else block in the continue block "+z)
					continue@demolabel
				}
		}
}
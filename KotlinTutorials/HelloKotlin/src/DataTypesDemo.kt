fun main(args:Array<String>)
{
	val a:Double = 10.0;
	val b:Float = 10.0f;
	val c:Char = 'A';
	val d:Boolean = false;
	val e:Array<Int> = arrayOf(1,2,3,4,5);
	val f:Array<String> = arrayOf("a","b","c");
	
	val i:MutableList<String> = mutableListOf("a","b","c");
	i.add("d");
	
	println("Double value  "+a);
	println("Float value "+b);
	println("Char value "+c);
	println("Boolean value "+d);
	println("int array value "+e[2]);
	println("String array value "+f[1]);
	println("List value first "+i.first());
	println("List value last "+i.last());
	
}
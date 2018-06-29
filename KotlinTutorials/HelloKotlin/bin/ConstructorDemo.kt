class Person
{
	private val firstName:String;
	private val age:Int;
	
	constructor()
	{
		this.firstName = "demo";
		this.age = 20;
	}
	
	constructor(name:String, age:Int)
	{
		this.firstName = name;
		this.age = age;
	}
	
	fun getFirstName() = this.firstName;
	fun getAge() = this.age;
}

fun main(args:Array<String>)
{
	val person:Person = Person("ajay", 34);	
	println("Heyy!  "+person.getFirstName()+" welcome to first constructor demo ");
	
	val person1:Person = Person()
	println("Heyy!  "+person1.getFirstName()+" welcome to first constructor demo ");
}
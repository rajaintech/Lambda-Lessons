# Lambda-Lessons


Lambda from Java Brains youtube channel.

	1. Understanding lambdas
	2. Using lambdas
	3. Functional interfaces
	4. Method references
	5. Collections improvements
	
	
Why Lambdas?
	1. Enables functional programming
	2. Readable and concise code
	3. Eliminates boiler plate clode
	4. Easier to use API's and libraries
	5. Enables support for parallel processing
	
	
Functional vs Object Oriented Programming

Why functional programming?
	1. Read code better and maintain. - HOW?
	2. Elegant in most situations
	
	
Code in OOP

	1. Everything is an object
	2. All code blocks are associated with classes and objects.

	1. If the lambda expression is one line, 
		a. You can remove curly braces.
		b. You can remove return keyword too
If the lambda have one argument, you can remove parenthesis also.

	1. To create a lambda function, you need to create
		a. Interface
		b. Interface name and method name doesn't matter
		
	2. Type inference

Interface having only one abstract method is called Functional Interface
@FunctionalInterface enforces an interface to have only one abstract method


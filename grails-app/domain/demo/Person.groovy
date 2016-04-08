package demo

class Person {

	String name
	Map moreinfo

    static constraints = {
    }

	static embedded = ['moreinfo']
}

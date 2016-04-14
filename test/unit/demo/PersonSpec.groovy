package demo

import spock.lang.Specification
import grails.test.mixin.TestFor

@TestFor(Person)
class PersonSpec extends Specification {
	void "default should be nullable true for map field"() {
		when:
		Person person = new Person(name: "John Doe")
		
		then:
		person.validate() & !person.hasErrors() & !person.errors["moreInfo"]?.code
	}
	
	void "should save"() {
		when:
		Person p = new Person(name: "Hanna")
		
		then:
		p.save() & Person.count() == 1
	}
}
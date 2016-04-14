package demo

import spock.lang.Specification
import grails.test.mixin.support.GrailsUnitTestMixin

@TestMixin(GrailsUnitTestMixin)
class AccountSpec extends Specification {
	void "default should be nullable true on list field"() {
		when:
		Account a = new Account(name: "John Doe", moreInfo: ["benificary":"Hanna Mackey"])
		
		then:
		a.validate() & !a.hasErrors() & !a.errors['transactions']?.code
	}
	
	void "default should be nullable true on map field"() {
		when:
		Account a = new Account(name: "John Doe", transactions: ["49293894", "432974239"])
		
		then:
		a.validate() & !a.hasErrors() & !a.errors["moreInfo"]?.code
	}
}
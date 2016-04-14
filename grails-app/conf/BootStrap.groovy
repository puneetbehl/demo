import demo.Person

class BootStrap {

    def init = { servletContext ->
		new Person(name: "John Doe", moreInfo: [
										qualifications: [graduations: "BTech"], 
										skills: ["Java", "Groovy", "Grails"]
									]).save(flush: true)
    }
    def destroy = {
    }
}

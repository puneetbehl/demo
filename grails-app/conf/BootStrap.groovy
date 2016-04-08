import demo.Person

class BootStrap {

    def init = { servletContext ->
		new Person(name: "John Doe", moreinfo: [qualifications: ["graduation": "B-Tech.", "undergraduate": "MS"], experience: [company1:"TO THE NEW Digital"]]).save(flush:true)
    }
    def destroy = {
    }

}

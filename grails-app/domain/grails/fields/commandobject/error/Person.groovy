package grails.fields.commandobject.error

class Person {

    String firstname
    String lastname
    String email

    static constraints = {
        firstname nullable: false, blank: false
        lastname nullable: false, blank: false
        email nullable: false, email: true
    }
}

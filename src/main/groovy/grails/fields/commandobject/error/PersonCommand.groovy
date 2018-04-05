package grails.fields.commandobject.error

import grails.validation.Validateable

class PersonCommand implements Validateable{

    String firstname
    String lastname
    String email

    static constraints = {
        firstname nullable: false, blank: false
        lastname nullable: false, blank: false
        email nullable: false, email: true
    }
}

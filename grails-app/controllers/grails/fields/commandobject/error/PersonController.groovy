package grails.fields.commandobject.error

class PersonController {

    def save(PersonCommand command){
        if(command.hasErrors()){
            println 'not valid'
        }else{
            println 'it works'
        }
    }
}

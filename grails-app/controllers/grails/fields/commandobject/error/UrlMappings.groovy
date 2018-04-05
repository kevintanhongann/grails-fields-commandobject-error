package grails.fields.commandobject.error

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/testPersonForm")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

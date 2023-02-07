package controller

import model.rest.request.CreateCustomer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("api/customer")
class Customer {

    @PostMapping("create")
    fun create(@RequestBody @Valid customerCreateRequest: CreateCustomer) {
        //TODO HERE CONTINUE
    }
}
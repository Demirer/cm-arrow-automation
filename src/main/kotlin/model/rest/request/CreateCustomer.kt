package model.rest.request

import org.jetbrains.annotations.NotNull
import java.time.LocalDate

data class CreateCustomer (
    @NotNull val name: String,
    @NotNull val surname: String,
    @NotNull val dateOfBirth: LocalDate,
    @NotNull val city: String
)

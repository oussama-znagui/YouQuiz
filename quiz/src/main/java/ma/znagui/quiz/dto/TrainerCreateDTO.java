package ma.znagui.quiz.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class TrainerCreateDTO {
    @NotBlank(message = "le prenom du formateur svp ! ")
    private String firstName;

    @NotBlank(message = "le nom du formateur svp ! ")
    private String lastName;


    private LocalDate birthDate;

    @NotBlank(message = "l'adresse du formateur svp ! ")
    private String address;
    @NotBlank(message = "la spetialite du formateur svp ! ")
    private String specialty;

}

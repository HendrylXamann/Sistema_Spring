package Hendryl_Studies.FirstProjectSpringArtifact.Pets;
import jakarta.persistence.*;
import lombok.*;

@Table(name="itens")
@Entity(name = "itens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PetsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeitem;
    private String valoritem;
    private Integer qtditem;
}

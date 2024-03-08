import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_pessoa")
@Data
public class Pessoa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;  
    private Integer idade;      
}

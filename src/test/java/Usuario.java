

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    private Long getId() {
        return id;
    }
}

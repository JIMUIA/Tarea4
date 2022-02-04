package tarea4.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.fasterxml.jackson.databind.util.ClassUtil.name;

@Entity
@Table (name="users")
public class Users {

    @Id
    private Long id;




}

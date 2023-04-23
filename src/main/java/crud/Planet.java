package crud;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Planet {
    @Id
    private String id;
    @Column(length = 500, nullable = false)
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planet{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}').append('\'');
        return sb.toString();
    }
}

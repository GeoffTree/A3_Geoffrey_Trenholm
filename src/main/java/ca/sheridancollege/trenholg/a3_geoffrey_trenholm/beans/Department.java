//Geoffrey Trenholm 991712128

package ca.sheridancollege.trenholg.a3_geoffrey_trenholm.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    private Long dept_id;

    private String dept_name;

    @Column(unique = true)
    private String email;

    @ManyToMany(mappedBy = "departments")
    private Set<Employee> employees = new HashSet<>();

    @PrePersist
    public void generateId() {
        if (dept_id == null) {
            dept_id = (long) (Math.random() * 9_000_000_000L) + 1_000_000_000L;
        }
    }
}

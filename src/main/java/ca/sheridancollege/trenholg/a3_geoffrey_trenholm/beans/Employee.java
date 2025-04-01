//Geoffrey Trenholm 991712128

package ca.sheridancollege.trenholg.a3_geoffrey_trenholm.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity(name="employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private Long emp_id;

    private String first_name;
    private String last_name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(unique = true)
    private String email;

    private Date hire_date;

    @ManyToMany
    @JoinTable(
            name = "emp_dept",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "dept_id")
    )
    private Set<Department> departments = new HashSet<>();

    @PrePersist
    public void generateId(){
        if(emp_id == null){
            emp_id = (long)(Math.random()*9_000_000_000L) + 1_000_000_000L;
        }
    }
}

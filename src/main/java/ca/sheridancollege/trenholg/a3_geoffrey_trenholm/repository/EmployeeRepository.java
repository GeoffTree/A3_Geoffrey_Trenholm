//Geoffrey Trenholm 991712128

package ca.sheridancollege.trenholg.a3_geoffrey_trenholm.repository;

import ca.sheridancollege.trenholg.a3_geoffrey_trenholm.beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package org.launchcode.codingevents.models;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        // Check if both references point to the same object in memory
        if (this == o) return true;
        // Check if the object being compared is null or is not of the same class
        if (o == null || getClass() != o.getClass()) return false;
        // Cast the object to AbstractEntity since we're comparing ids
        AbstractEntity entity = (AbstractEntity) o;
        // Compare the id of the current object with the id of the object being compared
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

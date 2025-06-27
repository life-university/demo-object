package com.example.demo_object.identity_equality.v4;

import java.util.Objects;

public class MemberV4 {

    private Long id;
    private String name;

    public MemberV4(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MemberV4 memberV4)) {
            return false;
        }
        return Objects.equals(id, memberV4.id) && Objects.equals(name, memberV4.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

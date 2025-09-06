    package com.springjwtauth.model;

    import jakarta.persistence.*;
    import lombok.Data;

    @Entity
    @Data
    @Table(name = "jwt_student")
    public class StudentEntity {

        @Id
        @GeneratedValue(strategy =GenerationType.IDENTITY)
        private Long id;
        private String firstName;
        private String lastName;
        private String department;
        private String semester;

    }

package com.portfolio.backend.security.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class NuevoUsuario {
    @NotBlank
    private String nombre;
    @NotBlank @Getter @Setter
    private String apellido;
    @Getter @Setter
    private double telefono;
    @Getter @Setter
    private String about;
    @Getter @Setter
    private String profileUrl;
    @NotBlank
    private String nombreUsuario;
    @Email
    private String email;
    @NotBlank
    private String password;
/*
    public NuevoUsuario(String nombre, String apellido, double telefono, String about, String nombreUsuario, String email, String password, LocalDate birthday, Set<String> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.about = about;
        this.telefono = telefono;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.roles = roles;
    }

 */

    @Getter @Setter @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthday;
    private Set<String> roles = new HashSet<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}

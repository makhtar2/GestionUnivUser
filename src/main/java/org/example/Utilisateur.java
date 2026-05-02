package org.example;


public class Utilisateur  {
    public enum Role {
        ETUDIANT,
        ENSEIGNANT,
        AGENT
    }


    private String matricule;
    private String nom;
    private String prenom;
    private Role role;
    private String telephone;
    private String email;

    public Utilisateur(String matricule, String nom, String prenom, Role role, String telephone, String email) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
        this.telephone = telephone;
        this.email = email;
    }

    // Getters et Setters


    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[" + matricule + "] " + prenom + " " + nom + " (" + role + ") - " + email;
    }
}
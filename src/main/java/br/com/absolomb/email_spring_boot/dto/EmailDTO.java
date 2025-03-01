package br.com.absolomb.email_spring_boot.dto;

public record EmailDTO(String to, String subject, String body) {
}
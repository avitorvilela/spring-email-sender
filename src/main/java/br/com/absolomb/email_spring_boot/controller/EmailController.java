package br.com.absolomb.email_spring_boot.controller;

import br.com.absolomb.email_spring_boot.dto.EmailDTO;
import br.com.absolomb.email_spring_boot.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public void sendEmail(@RequestBody EmailDTO emailDto) {
        emailService.sendMail(emailDto);
    }
}
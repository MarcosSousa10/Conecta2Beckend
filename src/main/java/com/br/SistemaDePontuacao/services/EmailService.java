package com.br.SistemaDePontuacao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void enviarEmail( String assunto, String corpo) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("profissional@othondecarvalho.com.br");
        message.setSubject(assunto);
        message.setText(corpo);
        emailSender.send(message);
    }
}

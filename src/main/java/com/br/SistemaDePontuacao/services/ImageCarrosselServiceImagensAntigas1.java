    
package com.br.SistemaDePontuacao.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.SistemaDePontuacao.Model.auth.ImagemCAntigas1;
import com.br.SistemaDePontuacao.Repository.auth.ImageCarrosselRepositoryImagensAntigas1;


@Service
public class ImageCarrosselServiceImagensAntigas1 {
    private final ImageCarrosselRepositoryImagensAntigas1 imageRepository;

    public ImageCarrosselServiceImagensAntigas1(ImageCarrosselRepositoryImagensAntigas1 imageRepository) {
        this.imageRepository = imageRepository;
    }

public ImagemCAntigas1 saveImage(byte[] file) {
        ImagemCAntigas1 image = new ImagemCAntigas1();
        image.setData(file);
        return imageRepository.save(image);
    }
    public ImagemCAntigas1 getImageById(Long id) {
        return imageRepository.findById(id).orElse(null);
    }
    public List<ImagemCAntigas1> getAllImages() {
        return imageRepository.findAll();
    }
    public void deleteImageById() {
        imageRepository.deleteImagem();
    }
    
}
    
package com.br.SistemaDePontuacao.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.SistemaDePontuacao.Model.auth.ImagemCAntigas2;
import com.br.SistemaDePontuacao.Repository.auth.ImageCarrosselRepositoryImagensAntigas2;


@Service
public class ImageCarrosselServiceImagensAntigas2 {
    private final ImageCarrosselRepositoryImagensAntigas2 imageRepository;

    public ImageCarrosselServiceImagensAntigas2(ImageCarrosselRepositoryImagensAntigas2 imageRepository) {
        this.imageRepository = imageRepository;
    }

public ImagemCAntigas2 saveImage(byte[] file) {
        ImagemCAntigas2 image = new ImagemCAntigas2();
        image.setData(file);
        return imageRepository.save(image);
    }
    public ImagemCAntigas2 getImageById(Long id) {
        return imageRepository.findById(id).orElse(null);
    }
    public List<ImagemCAntigas2> getAllImages() {
        return imageRepository.findAll();
    }
    public void deleteImageById() {
        imageRepository.deleteImagem();
    }
    
}
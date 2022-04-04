package com.example.demo.Material;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {


    private final MaterialRepository materialRepository;


    @Autowired
    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public void createMaterial(Material material) {
        materialRepository.save(material);

    }

    public Material findMaterialTitle(String title) {
        System.out.print("in s");
        Material material = materialRepository.findByTitle(title);
        System.out.println(material);
        return material;
    }

    public List<Material> getMaterials() {
        return materialRepository.findAll();
    }


    public void deleteMaterial(String id) {
        int Id = Integer.parseInt(id);
        materialRepository.deleteById(Id);

    }
    public Material updateMaterial(String id , Material updateMaterial){
        int Id = Integer.parseInt(id);
        Material m = materialRepository.findById(Id).orElse(null);
        if (m != null){
            m.setAttachments(updateMaterial.getAttachments());
            m.setAuthor(updateMaterial.getAuthor());
            m.setContent(updateMaterial.getContent());
            m.setDate(updateMaterial.getDate());
            m.setLanguage(updateMaterial.getLanguage());
            m.setSection(updateMaterial.getSection());
            m.setTitle(updateMaterial.getTitle());
            m.setUrl(updateMaterial.getUrl());
            materialRepository.save(m);
        }
        return m;
    }
}

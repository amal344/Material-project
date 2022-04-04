package com.example.demo.Material;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "materials")
@CrossOrigin("*")
public class MaterialController {


    private final MaterialService materialService;

    @Autowired
    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping
    public List<Material> getMaterials(){
        return materialService.getMaterials();
    }
    @GetMapping("/{title}")
    public Material findMaterialTitle(@PathVariable String title){
       System.out.print("in c");
        return materialService.findMaterialTitle(title);
    }

    @PostMapping
    public void createPatient(@RequestBody Material material){
        if(material.getAttachments().substring(material.getAttachments().length()-3).equals("png")||material.getAttachments().substring(material.getAttachments().length()-3).equals("pdf"))
             materialService.createMaterial(material);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable String id) {
         materialService.deleteMaterial(id);
    }

    @PutMapping("/{id}")
    public Material updateMateral(@PathVariable String id, @RequestBody Material material) {
        return materialService.updateMaterial(id,material);
    }


}

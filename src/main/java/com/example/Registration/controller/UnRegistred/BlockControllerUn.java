/*
package com.example.Registration.controller.UnRegistred;

import com.example.Registration.converter.Converter;
import com.example.Registration.dto.BlockDTO;
import com.example.Registration.entity.Block;
import com.example.Registration.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlockControllerUn {
    @Autowired
    private BlockService service;
    Converter converter = new Converter();

    @GetMapping("/all")
    public Iterable<BlockDTO> getAllBlock() {
        Iterable<Block> blocks = service.findAllBlock();
        List<BlockDTO> blockDTOS = new ArrayList<>();

        for (var el : blocks)
            blockDTOS.add(converter.BlockDTOConv(el));
        return blockDTOS;
    }

    @GetMapping("/{id}")
    public BlockDTO getBlock(@PathVariable Long id) {
        return converter.BlockDTOConv(service.findBlock(id));
    }
}


*/

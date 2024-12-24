package com.example.nurses_microservice.Controller;

import com.example.nurses_microservice.Model.NursesModel;
import com.example.nurses_microservice.Service.NursesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nurses")
public class NursesController {

    private final NursesService nursesService;

    public NursesController(NursesService nursesService) {
        this.nursesService = nursesService;
    }

    @PostMapping
    public ResponseEntity<NursesModel> createNurse(@RequestBody NursesModel nurses) {

        NursesModel savedNurse = nursesService.saveNurses(nurses);
        return new ResponseEntity<>(savedNurse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<NursesModel>> getAllNurses() {

        List<NursesModel> nurses = nursesService.getAllNurses();
        return new ResponseEntity<>(nurses, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNurseById(@PathVariable int id) {
        nursesService.deleteNurseById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    public ResponseEntity<NursesModel> updateNurse(
            @PathVariable int id,
            @RequestBody NursesModel updatedNurse
    ) {
        NursesModel nurse = nursesService.updateNurse(id, updatedNurse);
        return new ResponseEntity<>(nurse, HttpStatus.OK);
    }


}

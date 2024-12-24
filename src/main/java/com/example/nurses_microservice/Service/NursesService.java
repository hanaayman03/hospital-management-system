package com.example.nurses_microservice.Service;

import com.example.nurses_microservice.Model.NursesModel;
import com.example.nurses_microservice.Repository.NursesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // Import for List

@Service
public class NursesService {

    @Autowired
    private NursesRepo nursesRepo;


    public NursesService(NursesRepo nursesRepo) {
        this.nursesRepo = nursesRepo;
    }

    public NursesModel saveNurses(NursesModel nursesModel) {
        return nursesRepo.save(nursesModel);
    }

    public List<NursesModel> getAllNurses() {
        return nursesRepo.findAll();
    }
    public void deleteNurseById(int id) {
        nursesRepo.deleteById(id);
    }
    public NursesModel updateNurse(int id, NursesModel updatedNurse) {
        return nursesRepo.findById(id)
                .map(existingNurse -> {

                    existingNurse.setName(updatedNurse.getName());
                    existingNurse.setDepartment(updatedNurse.getDepartment());
                    existingNurse.setWorkSchedule(updatedNurse.getWorkSchedule());
                    // Save the updated entity
                    return nursesRepo.save(existingNurse);
                })
                .orElseThrow(() -> new RuntimeException("Nurse not found with id: " + id));
    }


}

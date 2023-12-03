package com.julian.school.controller;

import com.julian.school.model.FullSchoolResponse;
import com.julian.school.model.School;
import com.julian.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @GetMapping
    public ResponseEntity<List<School>> findAllSchool(){
        return ResponseEntity.ok(schoolService.findAllSchools());
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findSchoolsWithStudents(@PathVariable("school-id") Long schoolId){
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody School school) {
        schoolService.saveSchool(school);
        return ResponseEntity.status(HttpStatus.CREATED).body("School guardada exitosamente");
    }


}

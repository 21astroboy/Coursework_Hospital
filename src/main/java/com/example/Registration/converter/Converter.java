package com.example.Registration.converter;

import com.example.Registration.dto.BlockDTO;
import com.example.Registration.dto.DoctorDTO;
import com.example.Registration.dto.PatientDTO;
import com.example.Registration.entity.Block;
import com.example.Registration.entity.Doctor;
import com.example.Registration.entity.Patient;

public class Converter {
    public DoctorDTO DoctorDTOConv(Doctor doctor) {
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setFullname(doctor.getFullname());
        doctorDTO.setExperience(doctor.getExperience());
        doctorDTO.setPosition(doctor.getPosition());
        doctorDTO.setWorkNumber(doctor.getWorkNumber());
        doctorDTO.setIsDirector(doctor.getIsDirector());
        return doctorDTO;
    }

    public PatientDTO PatientDTOConv(Patient patient) {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setFullname(patient.getFullname());
        patientDTO.setPhone(patient.getPhone());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setInsuranceNum(patient.getInsuranceNum());
        return patientDTO;
    }

    public BlockDTO BlockDTOConv(Block block) {
        BlockDTO blockDTO = new BlockDTO();
        blockDTO.setTitle(block.getTitle());
        blockDTO.setAddress(block.getAddress());
        blockDTO.setPhone(block.getPhone());
        return blockDTO;
    }

}

package com.citybless.healthcare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class VitalSign {
    @Id
    private LocalDateTime timestamp; // ใช้เวลาเป็น primary key
    private String patientName; // ชื่อผู้ป่วย
    private double heartRate; // อัตราการเต้นของหัวใจ
    private double systolicPressure; // ความดันเลือด Systolic
    private double diastolicPressure; // ความดันเลือด Diastolic
    private double temperature; // อุณหภูมิร่างกาย
    private double breathingRate; // อัตราการหายใจ
    private double dtx; // ค่า dtx
    private String comments; // คอมเม้นสำหรับผู้วัดแสดงความคิดเห็น
}
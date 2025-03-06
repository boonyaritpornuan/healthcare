package com.citybless.healthcare.repository;

import com.citybless.healthcare.model.VitalSign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.time.LocalDateTime;

@Repository
public interface VitalSignRepository extends JpaRepository<VitalSign, LocalDateTime> {
    List<VitalSign> findByPatientNameOrderByTimestampDesc(String patientName); // ค้นหาและเรียงจากล่าสุดก่อน
}
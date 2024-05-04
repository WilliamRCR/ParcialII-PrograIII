package com.parcial.finanzas.dao;

import com.parcial.finanzas.entities.Report;
import org.springframework.data.repository.CrudRepository;

public interface ReportDao extends CrudRepository<Report, Long> {
}

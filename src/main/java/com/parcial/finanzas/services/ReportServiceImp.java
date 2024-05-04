package com.parcial.finanzas.services;

import com.parcial.finanzas.dao.ReportDao;
import com.parcial.finanzas.entities.Report;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImp implements ReportService{
    @Autowired
    ReportDao reportDao;

    @Override
    public Report getTotalByUserId(Long id) {
        return reportDao.findById(id).orElse(null);
    }
}

package com.parcial.finanzas.controllers;

import com.parcial.finanzas.entities.Report;
import com.parcial.finanzas.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    ReportService reportService;

    @GetMapping(value = "/{id}")
    public Report getTotalByUserId(Long id){return reportService.getTotalByUserId(id);}
}

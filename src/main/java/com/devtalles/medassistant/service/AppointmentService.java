package com.devtalles.medassistant.service;

import com.devtalles.medassistant.dto.AppointmentInfo;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentService {
    List<AppointmentInfo> findAvailableAppointments(String specialty, LocalDate date);
}

package az.cloud.client.insurancecloudclient.controller;

import az.cloud.client.insurancecloudclient.service.InsuranceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class InsuranceController {
    private final InsuranceService insuranceService;

    @GetMapping("details")
    public String displayMyDetails() {
        return insuranceService.displayFullNameAndAge();
    }
}

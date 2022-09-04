package az.cloud.client.insurancecloudclient.service.impl;

import az.cloud.client.insurancecloudclient.service.InsuranceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
@RequiredArgsConstructor
public class InsuranceServiceImpl implements InsuranceService {
    private final Environment environment;
    @Value("${my.name}")
    private String name;
    @Value("${my.surname}")
    private String surname;
    @Value("${my.age}")
    private int age;

    @Override
    public String displayFullNameAndAge() {
        return String.format("My name is %s and surname is %s and age is %s",
                name,
                surname,
                age);
    }
}

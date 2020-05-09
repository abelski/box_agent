package by.abelski.boxagent.service;

import by.abelski.boxagent.entities.Request;
import by.abelski.boxagent.entities.ServiceProviders;
import by.abelski.boxagent.entities.Status;
import by.abelski.boxagent.persistance.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RequestService {
    @Autowired
    RequestRepository requestRepository;
    @Autowired
    UserService userService;

    public List<Request> getActiveRequests() {
        return requestRepository.findAll();
    }

    public Request place(boolean BigSizeBox, Long deliveryCost, String fromAddress, String fromComment, String fromPhone, String toAddress, String toPhone, String toComment, String what, String provider) {
        final Request request = new Request();
        request.setBigSizeBox(BigSizeBox);
        request.setCretionDate(new Date());
        request.setWhat(what);
        request.setCreatedBy(userService.getCurrentUser());
        request.setDeliveryCost(deliveryCost);
        request.setProvider(ServiceProviders.valueOf(provider));

        request.setFromAddress(fromAddress);
        request.setFromPhone(fromPhone);
        request.setFromComment(fromComment);

        request.setToAddress(toAddress);
        request.setToPhone(toPhone);
        request.setToComment(toComment);

        request.setStatus(Status.TODO);

        requestRepository.save(request);
        return request;
    }
}

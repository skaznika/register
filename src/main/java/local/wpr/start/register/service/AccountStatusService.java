package local.wpr.start.register.service;

import local.wpr.start.register.model.AccountStatus;

import java.util.List;

public interface AccountStatusService {
    List<AccountStatus> getAll();
    AccountStatus getById(Long accountId);
}
